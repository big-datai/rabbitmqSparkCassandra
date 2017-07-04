package com.jactravel.monitoring.streaming

import com.jactravel.monitoring.model._
import com.typesafe.scalalogging.LazyLogging
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.rabbitmq.RabbitMQUtils
import org.apache.spark.streaming.{Duration, Seconds, StreamingContext}

/**
  * Created by dmitry on 7/4/17.
  */

object ProcessBusiness extends LazyLogging with ConfigService with ProcessMonitoringStream {

  override val keyspaceName: String = "jactravel_monitoring_new"

  def main(args: Array[String]): Unit = {

    spark= SparkSession
      .builder()
      .config(conf)
      //.enableHiveSupport()
      .getOrCreate()
    import com.datastax.spark.connector.streaming._


    ///use get or create to use check point
    ssc = new StreamingContext(spark.sparkContext, Seconds(5) )//Milliseconds(500))
    val numPar=150

    val bookingStream = RabbitMQUtils.createStream[BookRequest](ssc
      , prepareQueueMap("BookRequest")
      , messageBookingHandler).repartition(numPar)

    val preBookingStream = RabbitMQUtils.createStream[PreBookRequest](ssc
      , prepareQueueMap("PreBookRequest")
      , messagePreBookingHandler).repartition(numPar)

    val searchRequestStream = RabbitMQUtils.createStream[SearchRequest](ssc
      , prepareQueueMap("SearchRequest")
      , messageSearchRequestHandler).repartition(numPar)

    val supplierBookhRequestStream = RabbitMQUtils.createStream[SupplierBookRequest](ssc
      , prepareQueueMap("SupplierBookRequest")
      , messageSupplierBookRequestHandler).repartition(numPar)

    val supplierPreBookRequestStream = RabbitMQUtils.createStream[SupplierPreBookRequest](ssc
      , prepareQueueMap("SupplierPreBookRequest")
      , messageSupplierPreBookRequestHandler).repartition(numPar)

    val supplierSearchRequestStream = RabbitMQUtils.createStream[SupplierSearchRequest](ssc
      , prepareQueueMap("SupplierSearchRequest")
      , messageSupplierSearchRequestHandler).repartition(numPar)
    //
    val queryProxyStream = RabbitMQUtils.createStream[QueryProxyRequest](ssc
      , prepareQueueMap("QueryProxyRequest")
      , messageQueryProxyHandler).repartition(numPar)

    val cmiRequestStream = RabbitMQUtils.createStream[CmiRequest](ssc
      , prepareQueueMap("CMIRequest")
      , messageCmiRequestHandler).repartition(numPar)

    val cmiBatchRequestStream = RabbitMQUtils.createStream[CmiBatchRequest](ssc
      , prepareQueueMap("CMIBatchRequest")
      , messageCmiBatchRequestHandler).repartition(numPar)

    ssc.remember(Duration(1800000L))//every
    val brand=spark
      .read
      .format("com.databricks.spark.csv")
      .option("header", "true") // Use first line of all files as header
      .option("inferSchema", "true") // Automatically infer data types
      .load(aws+"brand.csv")
    brand.createOrReplaceTempView("Brand")
    val trade=spark
      .read
      .format("com.databricks.spark.csv")
      .option("header", "true") // Use first line of all files as header
      .option("inferSchema", "true") // Automatically infer data types
      .load(aws+"trade.csv")
    trade.createOrReplaceTempView("Trade")
    val saleschannel=spark
      .read
      .format("com.databricks.spark.csv")
      .option("header", "true") // Use first line of all files as header
      .option("inferSchema", "true") // Automatically infer data types
      .load(aws+"saleschannel.csv")
    saleschannel.createOrReplaceTempView("SalesChannel")


    bookingStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("BookRequest")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "book_request")
    preBookingStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("pre_book_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "pre_book_request")
    searchRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("search_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "search_request")
    supplierBookhRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("supplier_book_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "supplier_book_request")
    supplierPreBookRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("supplier_pre_book_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "supplier_pre_book_request")
    supplierSearchRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("supplier_search_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "supplier_search_request")
    queryProxyStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("QueryProxyRequest")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "query_proxy_request")
    cmiRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("cmi_request")
      rdd.take(1)
      rdd }.saveToCassandra(keyspaceName, "cmi_request")
    cmiBatchRequestStream.transform{rdd=>spark.createDataFrame(rdd).createOrReplaceTempView("cmi_batch_request")
      rdd.take(1)
      //here we put all the sqls

      // BOOKING
      spark.sql("""
        SELECT br.search_query_uuid as query_uuid,
               brand_name,
               trade_name,
               trade_group,
               trade_parent_group,
               sales_channel,
               (unix_timestamp(end_utc_timestamp) - unix_timestamp(start_utc_timestamp)) * 1000 as response_time_ms,
               br.error_stack_trace,
               br.success,
               xml_booking_login,
               window(start_utc_timestamp, '5 minutes').end as time
        FROM BookRequest as br,
             SalesChannel as sc,
             Trade as t,
             Brand as b
        LEFT JOIN QueryProxyRequest as qpr
        ON br.search_query_uuid == qpr.query_uuid
        WHERE br.sales_channel_id == sc.sales_channel_id
        AND br.trade_id == t.trade_id
        AND br.brand_id == b.brand_id""").createOrReplaceTempView("BookingEnriched")

      // BOOKING COUNT
      val bookingCount = spark.sql("""
      SELECT COUNT(query_uuid) as booking_count,
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xmL_booking_login
      from BookingEnriched
      group by
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xml_booking_login
      """)
      // BOOKING SUCCESS
      val bookingSucces = spark.sql("""
      SELECT COUNT(query_uuid) as booking_success,
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xmL_booking_login
      FROM BookingEnriched
      WHERE success IS NOT NULL
      GROUP BY
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xml_booking_login
      """)

      // BOOKING ERROR
      val bookingError = spark.sql("""
      SELECT COUNT(query_uuid) as booking_errors,
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xmL_booking_login
      FROM BookingEnriched
      WHERE error_stack_trace IS NOT NULL
      GROUP BY
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xml_booking_login
      """)
      // BOOKING RESPONSE TIME
      val bookingResponse = spark.sql("""
      SELECT COUNT(query_uuid) as booking_errors,
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xmL_booking_login,
          min(response_time_ms) as min_response_time_ms,
          max(response_time_ms) as max_response_time_ms,
          avg(response_time_ms) as avg_response_time_ms
      FROM BookingEnriched
      GROUP BY
          time,
          brand_name,
          sales_channel,
          trade_group,
          trade_name,
          trade_parent_group,
          xml_booking_login
      """)
      println("++++++++++++++++++++++++++++++  count book ++++++++"+bookingSucces.count())
      bookingError.count()
      bookingResponse.count()
        rdd }.saveToCassandra(keyspaceName, "cmi_batch_request")



    // Start the computation
    ssc.start()

    // Termination
    ssc.awaitTermination()

  }

  private[this] def prepareQueueMap(queueName: String) = {
    Map(
      "hosts" -> hosts
      , "queueName" -> queueName
      //      , "exchangeName" -> exchangeName
      //      , "exchangeType" -> exchangeType
      , "vHost" -> vHost
      , "userName" -> username
      , "password" -> password
      , "routingKey" -> queueName
      // ,"maxMessagesPerPartition"->"1"
      ,"maxMessagesPerPartition" -> "100"
      ,"levelParallelism"->"100"
      ,"rememberDuration" -> "1800000"
      ,"maxReceiveTime"->"500"
      ,"storageLevel"->"MEMORY_AND_DISK"

    )
  }
}
