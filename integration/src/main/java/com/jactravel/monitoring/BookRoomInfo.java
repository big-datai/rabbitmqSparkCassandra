// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookRoomInfo.proto

package com.jactravel.monitoring;

/**
 * Protobuf type {@code Jactravel.Monitoring.BookRoomInfo}
 */
public  final class BookRoomInfo extends
    com.google.protobuf.GeneratedMessage
    implements BookRoomInfoOrBuilder {
  // Use BookRoomInfo.newBuilder() to construct.
  private BookRoomInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BookRoomInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BookRoomInfo defaultInstance;
  public static BookRoomInfo getDefaultInstance() {
    return defaultInstance;
  }

  public BookRoomInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BookRoomInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            adults_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            children_ = input.readInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              childAges_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            childAges_.add(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
              childAges_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              childAges_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            mealBasisID_ = input.readInt32();
            break;
          }
          case 42: {
            bitField0_ |= 0x00000008;
            bookingToken_ = input.readBytes();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            propertyRoomTypeID_ = input.readInt32();
            break;
          }
          case 58: {
            bitField0_ |= 0x00000020;
            priceDiff_ = input.readBytes();
            break;
          }
          case 64: {
            bitField0_ |= 0x00000040;
            roomCount_ = input.readInt32();
            break;
          }
          case 74: {
            bitField0_ |= 0x00000080;
            preBookingToken_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        childAges_ = java.util.Collections.unmodifiableList(childAges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jactravel.monitoring.BookRoomInfoProto.internal_static_Jactravel_Monitoring_BookRoomInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jactravel.monitoring.BookRoomInfoProto.internal_static_Jactravel_Monitoring_BookRoomInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jactravel.monitoring.BookRoomInfo.class, com.jactravel.monitoring.BookRoomInfo.Builder.class);
  }

  public static com.google.protobuf.Parser<BookRoomInfo> PARSER =
      new com.google.protobuf.AbstractParser<BookRoomInfo>() {
    public BookRoomInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookRoomInfo(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BookRoomInfo> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 adults = 1;
  public static final int ADULTS_FIELD_NUMBER = 1;
  private int adults_;
  /**
   * <code>optional int32 adults = 1;</code>
   */
  public boolean hasAdults() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 adults = 1;</code>
   */
  public int getAdults() {
    return adults_;
  }

  // optional int32 children = 2;
  public static final int CHILDREN_FIELD_NUMBER = 2;
  private int children_;
  /**
   * <code>optional int32 children = 2;</code>
   */
  public boolean hasChildren() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 children = 2;</code>
   */
  public int getChildren() {
    return children_;
  }

  // repeated int32 childAges = 3;
  public static final int CHILDAGES_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> childAges_;
  /**
   * <code>repeated int32 childAges = 3;</code>
   */
  public java.util.List<java.lang.Integer>
      getChildAgesList() {
    return childAges_;
  }
  /**
   * <code>repeated int32 childAges = 3;</code>
   */
  public int getChildAgesCount() {
    return childAges_.size();
  }
  /**
   * <code>repeated int32 childAges = 3;</code>
   */
  public int getChildAges(int index) {
    return childAges_.get(index);
  }

  // optional int32 mealBasisID = 4;
  public static final int MEALBASISID_FIELD_NUMBER = 4;
  private int mealBasisID_;
  /**
   * <code>optional int32 mealBasisID = 4;</code>
   */
  public boolean hasMealBasisID() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 mealBasisID = 4;</code>
   */
  public int getMealBasisID() {
    return mealBasisID_;
  }

  // optional string bookingToken = 5;
  public static final int BOOKINGTOKEN_FIELD_NUMBER = 5;
  private java.lang.Object bookingToken_;
  /**
   * <code>optional string bookingToken = 5;</code>
   */
  public boolean hasBookingToken() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string bookingToken = 5;</code>
   */
  public java.lang.String getBookingToken() {
    java.lang.Object ref = bookingToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        bookingToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string bookingToken = 5;</code>
   */
  public com.google.protobuf.ByteString
      getBookingTokenBytes() {
    java.lang.Object ref = bookingToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bookingToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int32 propertyRoomTypeID = 6;
  public static final int PROPERTYROOMTYPEID_FIELD_NUMBER = 6;
  private int propertyRoomTypeID_;
  /**
   * <code>optional int32 propertyRoomTypeID = 6;</code>
   */
  public boolean hasPropertyRoomTypeID() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int32 propertyRoomTypeID = 6;</code>
   */
  public int getPropertyRoomTypeID() {
    return propertyRoomTypeID_;
  }

  // optional string priceDiff = 7;
  public static final int PRICEDIFF_FIELD_NUMBER = 7;
  private java.lang.Object priceDiff_;
  /**
   * <code>optional string priceDiff = 7;</code>
   */
  public boolean hasPriceDiff() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional string priceDiff = 7;</code>
   */
  public java.lang.String getPriceDiff() {
    java.lang.Object ref = priceDiff_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        priceDiff_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string priceDiff = 7;</code>
   */
  public com.google.protobuf.ByteString
      getPriceDiffBytes() {
    java.lang.Object ref = priceDiff_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      priceDiff_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int32 roomCount = 8;
  public static final int ROOMCOUNT_FIELD_NUMBER = 8;
  private int roomCount_;
  /**
   * <code>optional int32 roomCount = 8;</code>
   */
  public boolean hasRoomCount() {
    return ((bitField0_ & 0x00000040) == 0x00000040);
  }
  /**
   * <code>optional int32 roomCount = 8;</code>
   */
  public int getRoomCount() {
    return roomCount_;
  }

  // optional string preBookingToken = 9;
  public static final int PREBOOKINGTOKEN_FIELD_NUMBER = 9;
  private java.lang.Object preBookingToken_;
  /**
   * <code>optional string preBookingToken = 9;</code>
   */
  public boolean hasPreBookingToken() {
    return ((bitField0_ & 0x00000080) == 0x00000080);
  }
  /**
   * <code>optional string preBookingToken = 9;</code>
   */
  public java.lang.String getPreBookingToken() {
    java.lang.Object ref = preBookingToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        preBookingToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string preBookingToken = 9;</code>
   */
  public com.google.protobuf.ByteString
      getPreBookingTokenBytes() {
    java.lang.Object ref = preBookingToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preBookingToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    adults_ = 0;
    children_ = 0;
    childAges_ = java.util.Collections.emptyList();
    mealBasisID_ = 0;
    bookingToken_ = "";
    propertyRoomTypeID_ = 0;
    priceDiff_ = "";
    roomCount_ = 0;
    preBookingToken_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, adults_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, children_);
    }
    for (int i = 0; i < childAges_.size(); i++) {
      output.writeInt32(3, childAges_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(4, mealBasisID_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(5, getBookingTokenBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt32(6, propertyRoomTypeID_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBytes(7, getPriceDiffBytes());
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      output.writeInt32(8, roomCount_);
    }
    if (((bitField0_ & 0x00000080) == 0x00000080)) {
      output.writeBytes(9, getPreBookingTokenBytes());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, adults_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, children_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < childAges_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(childAges_.get(i));
      }
      size += dataSize;
      size += 1 * getChildAgesList().size();
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, mealBasisID_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, getBookingTokenBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, propertyRoomTypeID_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, getPriceDiffBytes());
    }
    if (((bitField0_ & 0x00000040) == 0x00000040)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, roomCount_);
    }
    if (((bitField0_ & 0x00000080) == 0x00000080)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(9, getPreBookingTokenBytes());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.jactravel.monitoring.BookRoomInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.jactravel.monitoring.BookRoomInfo prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Jactravel.Monitoring.BookRoomInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.jactravel.monitoring.BookRoomInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jactravel.monitoring.BookRoomInfoProto.internal_static_Jactravel_Monitoring_BookRoomInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jactravel.monitoring.BookRoomInfoProto.internal_static_Jactravel_Monitoring_BookRoomInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jactravel.monitoring.BookRoomInfo.class, com.jactravel.monitoring.BookRoomInfo.Builder.class);
    }

    // Construct using com.jactravel.monitoring.BookRoomInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      adults_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      children_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      childAges_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      mealBasisID_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      bookingToken_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      propertyRoomTypeID_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      priceDiff_ = "";
      bitField0_ = (bitField0_ & ~0x00000040);
      roomCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000080);
      preBookingToken_ = "";
      bitField0_ = (bitField0_ & ~0x00000100);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jactravel.monitoring.BookRoomInfoProto.internal_static_Jactravel_Monitoring_BookRoomInfo_descriptor;
    }

    public com.jactravel.monitoring.BookRoomInfo getDefaultInstanceForType() {
      return com.jactravel.monitoring.BookRoomInfo.getDefaultInstance();
    }

    public com.jactravel.monitoring.BookRoomInfo build() {
      com.jactravel.monitoring.BookRoomInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.jactravel.monitoring.BookRoomInfo buildPartial() {
      com.jactravel.monitoring.BookRoomInfo result = new com.jactravel.monitoring.BookRoomInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.adults_ = adults_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.children_ = children_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        childAges_ = java.util.Collections.unmodifiableList(childAges_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.childAges_ = childAges_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000004;
      }
      result.mealBasisID_ = mealBasisID_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000008;
      }
      result.bookingToken_ = bookingToken_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000010;
      }
      result.propertyRoomTypeID_ = propertyRoomTypeID_;
      if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
        to_bitField0_ |= 0x00000020;
      }
      result.priceDiff_ = priceDiff_;
      if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
        to_bitField0_ |= 0x00000040;
      }
      result.roomCount_ = roomCount_;
      if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
        to_bitField0_ |= 0x00000080;
      }
      result.preBookingToken_ = preBookingToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jactravel.monitoring.BookRoomInfo) {
        return mergeFrom((com.jactravel.monitoring.BookRoomInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jactravel.monitoring.BookRoomInfo other) {
      if (other == com.jactravel.monitoring.BookRoomInfo.getDefaultInstance()) return this;
      if (other.hasAdults()) {
        setAdults(other.getAdults());
      }
      if (other.hasChildren()) {
        setChildren(other.getChildren());
      }
      if (!other.childAges_.isEmpty()) {
        if (childAges_.isEmpty()) {
          childAges_ = other.childAges_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureChildAgesIsMutable();
          childAges_.addAll(other.childAges_);
        }
        onChanged();
      }
      if (other.hasMealBasisID()) {
        setMealBasisID(other.getMealBasisID());
      }
      if (other.hasBookingToken()) {
        bitField0_ |= 0x00000010;
        bookingToken_ = other.bookingToken_;
        onChanged();
      }
      if (other.hasPropertyRoomTypeID()) {
        setPropertyRoomTypeID(other.getPropertyRoomTypeID());
      }
      if (other.hasPriceDiff()) {
        bitField0_ |= 0x00000040;
        priceDiff_ = other.priceDiff_;
        onChanged();
      }
      if (other.hasRoomCount()) {
        setRoomCount(other.getRoomCount());
      }
      if (other.hasPreBookingToken()) {
        bitField0_ |= 0x00000100;
        preBookingToken_ = other.preBookingToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.jactravel.monitoring.BookRoomInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jactravel.monitoring.BookRoomInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 adults = 1;
    private int adults_ ;
    /**
     * <code>optional int32 adults = 1;</code>
     */
    public boolean hasAdults() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 adults = 1;</code>
     */
    public int getAdults() {
      return adults_;
    }
    /**
     * <code>optional int32 adults = 1;</code>
     */
    public Builder setAdults(int value) {
      bitField0_ |= 0x00000001;
      adults_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 adults = 1;</code>
     */
    public Builder clearAdults() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adults_ = 0;
      onChanged();
      return this;
    }

    // optional int32 children = 2;
    private int children_ ;
    /**
     * <code>optional int32 children = 2;</code>
     */
    public boolean hasChildren() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 children = 2;</code>
     */
    public int getChildren() {
      return children_;
    }
    /**
     * <code>optional int32 children = 2;</code>
     */
    public Builder setChildren(int value) {
      bitField0_ |= 0x00000002;
      children_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 children = 2;</code>
     */
    public Builder clearChildren() {
      bitField0_ = (bitField0_ & ~0x00000002);
      children_ = 0;
      onChanged();
      return this;
    }

    // repeated int32 childAges = 3;
    private java.util.List<java.lang.Integer> childAges_ = java.util.Collections.emptyList();
    private void ensureChildAgesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        childAges_ = new java.util.ArrayList<java.lang.Integer>(childAges_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getChildAgesList() {
      return java.util.Collections.unmodifiableList(childAges_);
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public int getChildAgesCount() {
      return childAges_.size();
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public int getChildAges(int index) {
      return childAges_.get(index);
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public Builder setChildAges(
        int index, int value) {
      ensureChildAgesIsMutable();
      childAges_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public Builder addChildAges(int value) {
      ensureChildAgesIsMutable();
      childAges_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public Builder addAllChildAges(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureChildAgesIsMutable();
      super.addAll(values, childAges_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 childAges = 3;</code>
     */
    public Builder clearChildAges() {
      childAges_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    // optional int32 mealBasisID = 4;
    private int mealBasisID_ ;
    /**
     * <code>optional int32 mealBasisID = 4;</code>
     */
    public boolean hasMealBasisID() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 mealBasisID = 4;</code>
     */
    public int getMealBasisID() {
      return mealBasisID_;
    }
    /**
     * <code>optional int32 mealBasisID = 4;</code>
     */
    public Builder setMealBasisID(int value) {
      bitField0_ |= 0x00000008;
      mealBasisID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 mealBasisID = 4;</code>
     */
    public Builder clearMealBasisID() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mealBasisID_ = 0;
      onChanged();
      return this;
    }

    // optional string bookingToken = 5;
    private java.lang.Object bookingToken_ = "";
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public boolean hasBookingToken() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public java.lang.String getBookingToken() {
      java.lang.Object ref = bookingToken_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        bookingToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBookingTokenBytes() {
      java.lang.Object ref = bookingToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bookingToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public Builder setBookingToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      bookingToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public Builder clearBookingToken() {
      bitField0_ = (bitField0_ & ~0x00000010);
      bookingToken_ = getDefaultInstance().getBookingToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string bookingToken = 5;</code>
     */
    public Builder setBookingTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      bookingToken_ = value;
      onChanged();
      return this;
    }

    // optional int32 propertyRoomTypeID = 6;
    private int propertyRoomTypeID_ ;
    /**
     * <code>optional int32 propertyRoomTypeID = 6;</code>
     */
    public boolean hasPropertyRoomTypeID() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 propertyRoomTypeID = 6;</code>
     */
    public int getPropertyRoomTypeID() {
      return propertyRoomTypeID_;
    }
    /**
     * <code>optional int32 propertyRoomTypeID = 6;</code>
     */
    public Builder setPropertyRoomTypeID(int value) {
      bitField0_ |= 0x00000020;
      propertyRoomTypeID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 propertyRoomTypeID = 6;</code>
     */
    public Builder clearPropertyRoomTypeID() {
      bitField0_ = (bitField0_ & ~0x00000020);
      propertyRoomTypeID_ = 0;
      onChanged();
      return this;
    }

    // optional string priceDiff = 7;
    private java.lang.Object priceDiff_ = "";
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public boolean hasPriceDiff() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public java.lang.String getPriceDiff() {
      java.lang.Object ref = priceDiff_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        priceDiff_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public com.google.protobuf.ByteString
        getPriceDiffBytes() {
      java.lang.Object ref = priceDiff_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceDiff_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public Builder setPriceDiff(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
      priceDiff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public Builder clearPriceDiff() {
      bitField0_ = (bitField0_ & ~0x00000040);
      priceDiff_ = getDefaultInstance().getPriceDiff();
      onChanged();
      return this;
    }
    /**
     * <code>optional string priceDiff = 7;</code>
     */
    public Builder setPriceDiffBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
      priceDiff_ = value;
      onChanged();
      return this;
    }

    // optional int32 roomCount = 8;
    private int roomCount_ ;
    /**
     * <code>optional int32 roomCount = 8;</code>
     */
    public boolean hasRoomCount() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 roomCount = 8;</code>
     */
    public int getRoomCount() {
      return roomCount_;
    }
    /**
     * <code>optional int32 roomCount = 8;</code>
     */
    public Builder setRoomCount(int value) {
      bitField0_ |= 0x00000080;
      roomCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 roomCount = 8;</code>
     */
    public Builder clearRoomCount() {
      bitField0_ = (bitField0_ & ~0x00000080);
      roomCount_ = 0;
      onChanged();
      return this;
    }

    // optional string preBookingToken = 9;
    private java.lang.Object preBookingToken_ = "";
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public boolean hasPreBookingToken() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public java.lang.String getPreBookingToken() {
      java.lang.Object ref = preBookingToken_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        preBookingToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public com.google.protobuf.ByteString
        getPreBookingTokenBytes() {
      java.lang.Object ref = preBookingToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preBookingToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public Builder setPreBookingToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
      preBookingToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public Builder clearPreBookingToken() {
      bitField0_ = (bitField0_ & ~0x00000100);
      preBookingToken_ = getDefaultInstance().getPreBookingToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string preBookingToken = 9;</code>
     */
    public Builder setPreBookingTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
      preBookingToken_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Jactravel.Monitoring.BookRoomInfo)
  }

  static {
    defaultInstance = new BookRoomInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Jactravel.Monitoring.BookRoomInfo)
}

