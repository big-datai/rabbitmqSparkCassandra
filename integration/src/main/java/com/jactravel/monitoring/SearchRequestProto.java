// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchRequest.proto

package com.jactravel.monitoring;

public final class SearchRequestProto {
  private SearchRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_Jactravel_Monitoring_SearchRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Jactravel_Monitoring_SearchRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_Jactravel_Monitoring_SearchRequestInfo_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Jactravel_Monitoring_SearchRequestInfo_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Jactravel_Monitoring_SearchResponseInfo_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_Jactravel_Monitoring_RoomRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Jactravel_Monitoring_RoomRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SearchRequest.proto\022\024Jactravel.Monitor" +
      "ing\032\022PlatformType.proto\"\256\001\n\rSearchReques" +
      "t\022\021\n\tqueryUUID\030\001 \001(\t\022\014\n\004host\030\002 \001(\t\022<\n\013re" +
      "questInfo\030\004 \001(\0132\'.Jactravel.Monitoring.S" +
      "earchRequestInfo\022>\n\014responseInfo\030\005 \001(\0132(" +
      ".Jactravel.Monitoring.SearchResponseInfo" +
      "\"\261\003\n\021SearchRequestInfo\022\031\n\021startUtcTimest" +
      "amp\030\001 \001(\t\022\027\n\017endUtcTimestamp\030\002 \001(\t\022\017\n\007tr" +
      "adeID\030\003 \001(\005\022\017\n\007brandID\030\004 \001(\005\022\026\n\016salesCha" +
      "nnelID\030\005 \001(\005\0226\n\016searchGeoLevel\030\006 \001(\0162\036.J",
      "actravel.Monitoring.GeoLevel\022\023\n\013geoLevel" +
      "1ID\030\007 \001(\005\022\023\n\013geoLevel2ID\030\010 \001(\005\022\024\n\014geoLev" +
      "el3IDs\030\t \003(\005\022\034\n\024propertyReferenceIDs\030\n \003" +
      "(\005\022\023\n\013propertyIDs\030\013 \003(\005\022\025\n\rminStarRating" +
      "\030\014 \001(\t\022\023\n\013arrivalDate\030\r \001(\t\022\020\n\010duration\030" +
      "\016 \001(\005\022\023\n\013mealBasisID\030\017 \001(\005\0220\n\005rooms\030\020 \003(" +
      "\0132!.Jactravel.Monitoring.RoomRequest\"\246\001\n" +
      "\022SearchResponseInfo\022\036\n\026propertyReference" +
      "Count\030\001 \001(\005\022\025\n\rpropertyCount\030\002 \001(\005\022\027\n\017pr" +
      "icedRoomCount\030\003 \001(\005\022\017\n\007success\030\004 \001(\t\022\024\n\014",
      "errorMessage\030\005 \001(\t\022\031\n\021suppliersSearched\030" +
      "\006 \003(\t\"B\n\013RoomRequest\022\016\n\006adults\030\001 \001(\005\022\020\n\010" +
      "children\030\002 \001(\005\022\021\n\tchildAges\030\003 \003(\005*k\n\010Geo" +
      "Level\022\023\n\017UnknownGeoLevel\020\000\022\013\n\007Country\020\001\022" +
      "\n\n\006Region\020\002\022\n\n\006Resort\020\003\022\025\n\021PropertyRefer" +
      "ence\020\004\022\016\n\nPropertyID\020\005B0\n\030com.jactravel." +
      "monitoringB\022SearchRequestProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Jactravel_Monitoring_SearchRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Jactravel_Monitoring_SearchRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Jactravel_Monitoring_SearchRequest_descriptor,
              new java.lang.String[] { "QueryUUID", "Host", "RequestInfo", "ResponseInfo", });
          internal_static_Jactravel_Monitoring_SearchRequestInfo_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_Jactravel_Monitoring_SearchRequestInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Jactravel_Monitoring_SearchRequestInfo_descriptor,
              new java.lang.String[] { "StartUtcTimestamp", "EndUtcTimestamp", "TradeID", "BrandID", "SalesChannelID", "SearchGeoLevel", "GeoLevel1ID", "GeoLevel2ID", "GeoLevel3IDs", "PropertyReferenceIDs", "PropertyIDs", "MinStarRating", "ArrivalDate", "Duration", "MealBasisID", "Rooms", });
          internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_Jactravel_Monitoring_SearchResponseInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor,
              new java.lang.String[] { "PropertyReferenceCount", "PropertyCount", "PricedRoomCount", "Success", "ErrorMessage", "SuppliersSearched", });
          internal_static_Jactravel_Monitoring_RoomRequest_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_Jactravel_Monitoring_RoomRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Jactravel_Monitoring_RoomRequest_descriptor,
              new java.lang.String[] { "Adults", "Children", "ChildAges", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.jactravel.monitoring.PlatformTypeProto.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}