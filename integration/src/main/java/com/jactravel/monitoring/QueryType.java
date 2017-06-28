// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryProxyRequest.proto

package com.jactravel.monitoring;

/**
 * Protobuf enum {@code Jactravel.Monitoring.QueryType}
 */
public enum QueryType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NewBooking = 0;</code>
   */
  NewBooking(0, 0),
  /**
   * <code>PreBook = 1;</code>
   */
  PreBook(1, 1),
  /**
   * <code>PreCancel = 2;</code>
   */
  PreCancel(2, 2),
  /**
   * <code>CancelBooking = 3;</code>
   */
  CancelBooking(3, 3),
  /**
   * <code>Cancel = 4;</code>
   */
  Cancel(4, 4),
  /**
   * <code>CancellationPolicy = 5;</code>
   */
  CancellationPolicy(5, 5),
  /**
   * <code>CancellationPolicyV2 = 6;</code>
   */
  CancellationPolicyV2(6, 6),
  /**
   * <code>Book = 7;</code>
   */
  Book(7, 7),
  /**
   * <code>Search = 8;</code>
   */
  Search(8, 8),
  /**
   * <code>BookingDetails = 9;</code>
   */
  BookingDetails(9, 9),
  /**
   * <code>GetBooking = 10;</code>
   */
  GetBooking(10, 10),
  /**
   * <code>GetFacilities = 11;</code>
   */
  GetFacilities(11, 11),
  /**
   * <code>GeoTree = 12;</code>
   */
  GeoTree(12, 12),
  /**
   * <code>HotelList = 13;</code>
   */
  HotelList(13, 13),
  /**
   * <code>LiveErrata = 14;</code>
   */
  LiveErrata(14, 14),
  /**
   * <code>HotelSearch = 15;</code>
   */
  HotelSearch(15, 15),
  /**
   * <code>HotelDetails = 16;</code>
   */
  HotelDetails(16, 16),
  /**
   * <code>PriceSearch = 17;</code>
   */
  PriceSearch(17, 17),
  /**
   * <code>Unknown = 18;</code>
   */
  Unknown(18, 18),
  ;

  /**
   * <code>NewBooking = 0;</code>
   */
  public static final int NewBooking_VALUE = 0;
  /**
   * <code>PreBook = 1;</code>
   */
  public static final int PreBook_VALUE = 1;
  /**
   * <code>PreCancel = 2;</code>
   */
  public static final int PreCancel_VALUE = 2;
  /**
   * <code>CancelBooking = 3;</code>
   */
  public static final int CancelBooking_VALUE = 3;
  /**
   * <code>Cancel = 4;</code>
   */
  public static final int Cancel_VALUE = 4;
  /**
   * <code>CancellationPolicy = 5;</code>
   */
  public static final int CancellationPolicy_VALUE = 5;
  /**
   * <code>CancellationPolicyV2 = 6;</code>
   */
  public static final int CancellationPolicyV2_VALUE = 6;
  /**
   * <code>Book = 7;</code>
   */
  public static final int Book_VALUE = 7;
  /**
   * <code>Search = 8;</code>
   */
  public static final int Search_VALUE = 8;
  /**
   * <code>BookingDetails = 9;</code>
   */
  public static final int BookingDetails_VALUE = 9;
  /**
   * <code>GetBooking = 10;</code>
   */
  public static final int GetBooking_VALUE = 10;
  /**
   * <code>GetFacilities = 11;</code>
   */
  public static final int GetFacilities_VALUE = 11;
  /**
   * <code>GeoTree = 12;</code>
   */
  public static final int GeoTree_VALUE = 12;
  /**
   * <code>HotelList = 13;</code>
   */
  public static final int HotelList_VALUE = 13;
  /**
   * <code>LiveErrata = 14;</code>
   */
  public static final int LiveErrata_VALUE = 14;
  /**
   * <code>HotelSearch = 15;</code>
   */
  public static final int HotelSearch_VALUE = 15;
  /**
   * <code>HotelDetails = 16;</code>
   */
  public static final int HotelDetails_VALUE = 16;
  /**
   * <code>PriceSearch = 17;</code>
   */
  public static final int PriceSearch_VALUE = 17;
  /**
   * <code>Unknown = 18;</code>
   */
  public static final int Unknown_VALUE = 18;


  public final int getNumber() { return value; }

  public static QueryType valueOf(int value) {
    switch (value) {
      case 0: return NewBooking;
      case 1: return PreBook;
      case 2: return PreCancel;
      case 3: return CancelBooking;
      case 4: return Cancel;
      case 5: return CancellationPolicy;
      case 6: return CancellationPolicyV2;
      case 7: return Book;
      case 8: return Search;
      case 9: return BookingDetails;
      case 10: return GetBooking;
      case 11: return GetFacilities;
      case 12: return GeoTree;
      case 13: return HotelList;
      case 14: return LiveErrata;
      case 15: return HotelSearch;
      case 16: return HotelDetails;
      case 17: return PriceSearch;
      case 18: return Unknown;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QueryType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static com.google.protobuf.Internal.EnumLiteMap<QueryType>
      internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QueryType>() {
          public QueryType findValueByNumber(int number) {
            return QueryType.valueOf(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(index);
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.jactravel.monitoring.QueryProxyRequestProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final QueryType[] VALUES = values();

  public static QueryType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int index;
  private final int value;

  private QueryType(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Jactravel.Monitoring.QueryType)
}

