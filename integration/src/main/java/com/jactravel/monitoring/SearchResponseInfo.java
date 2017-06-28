// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchRequest.proto

package com.jactravel.monitoring;

/**
 * Protobuf type {@code Jactravel.Monitoring.SearchResponseInfo}
 */
public  final class SearchResponseInfo extends
    com.google.protobuf.GeneratedMessage
    implements SearchResponseInfoOrBuilder {
  // Use SearchResponseInfo.newBuilder() to construct.
  private SearchResponseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private SearchResponseInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final SearchResponseInfo defaultInstance;
  public static SearchResponseInfo getDefaultInstance() {
    return defaultInstance;
  }

  public SearchResponseInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private SearchResponseInfo(
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
            propertyReferenceCount_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            propertyCount_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            pricedRoomCount_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              suppliersSearched_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            suppliersSearched_.add(input.readBytes());
            break;
          }
          case 42: {
            bitField0_ |= 0x00000008;
            success_ = input.readBytes();
            break;
          }
          case 50: {
            bitField0_ |= 0x00000010;
            errorMessage_ = input.readBytes();
            break;
          }
          case 58: {
            bitField0_ |= 0x00000020;
            errorStackTrace_ = input.readBytes();
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        suppliersSearched_ = new com.google.protobuf.UnmodifiableLazyStringList(suppliersSearched_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jactravel.monitoring.SearchRequestProto.internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jactravel.monitoring.SearchRequestProto.internal_static_Jactravel_Monitoring_SearchResponseInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jactravel.monitoring.SearchResponseInfo.class, com.jactravel.monitoring.SearchResponseInfo.Builder.class);
  }

  public static com.google.protobuf.Parser<SearchResponseInfo> PARSER =
      new com.google.protobuf.AbstractParser<SearchResponseInfo>() {
    public SearchResponseInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchResponseInfo(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<SearchResponseInfo> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 propertyReferenceCount = 1;
  public static final int PROPERTYREFERENCECOUNT_FIELD_NUMBER = 1;
  private int propertyReferenceCount_;
  /**
   * <code>optional int32 propertyReferenceCount = 1;</code>
   *
   * <pre>
   * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
   * </pre>
   */
  public boolean hasPropertyReferenceCount() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 propertyReferenceCount = 1;</code>
   *
   * <pre>
   * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
   * </pre>
   */
  public int getPropertyReferenceCount() {
    return propertyReferenceCount_;
  }

  // optional int32 propertyCount = 2;
  public static final int PROPERTYCOUNT_FIELD_NUMBER = 2;
  private int propertyCount_;
  /**
   * <code>optional int32 propertyCount = 2;</code>
   *
   * <pre>
   * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
   * </pre>
   */
  public boolean hasPropertyCount() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 propertyCount = 2;</code>
   *
   * <pre>
   * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
   * </pre>
   */
  public int getPropertyCount() {
    return propertyCount_;
  }

  // optional int32 pricedRoomCount = 3;
  public static final int PRICEDROOMCOUNT_FIELD_NUMBER = 3;
  private int pricedRoomCount_;
  /**
   * <code>optional int32 pricedRoomCount = 3;</code>
   */
  public boolean hasPricedRoomCount() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 pricedRoomCount = 3;</code>
   */
  public int getPricedRoomCount() {
    return pricedRoomCount_;
  }

  // repeated string suppliersSearched = 4;
  public static final int SUPPLIERSSEARCHED_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList suppliersSearched_;
  /**
   * <code>repeated string suppliersSearched = 4;</code>
   */
  public java.util.List<java.lang.String>
      getSuppliersSearchedList() {
    return suppliersSearched_;
  }
  /**
   * <code>repeated string suppliersSearched = 4;</code>
   */
  public int getSuppliersSearchedCount() {
    return suppliersSearched_.size();
  }
  /**
   * <code>repeated string suppliersSearched = 4;</code>
   */
  public java.lang.String getSuppliersSearched(int index) {
    return suppliersSearched_.get(index);
  }
  /**
   * <code>repeated string suppliersSearched = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSuppliersSearchedBytes(int index) {
    return suppliersSearched_.getByteString(index);
  }

  // optional string success = 5;
  public static final int SUCCESS_FIELD_NUMBER = 5;
  private java.lang.Object success_;
  /**
   * <code>optional string success = 5;</code>
   */
  public boolean hasSuccess() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string success = 5;</code>
   */
  public java.lang.String getSuccess() {
    java.lang.Object ref = success_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        success_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string success = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSuccessBytes() {
    java.lang.Object ref = success_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      success_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string errorMessage = 6;
  public static final int ERRORMESSAGE_FIELD_NUMBER = 6;
  private java.lang.Object errorMessage_;
  /**
   * <code>optional string errorMessage = 6;</code>
   */
  public boolean hasErrorMessage() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string errorMessage = 6;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        errorMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string errorMessage = 6;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string errorStackTrace = 7;
  public static final int ERRORSTACKTRACE_FIELD_NUMBER = 7;
  private java.lang.Object errorStackTrace_;
  /**
   * <code>optional string errorStackTrace = 7;</code>
   */
  public boolean hasErrorStackTrace() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional string errorStackTrace = 7;</code>
   */
  public java.lang.String getErrorStackTrace() {
    java.lang.Object ref = errorStackTrace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        errorStackTrace_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string errorStackTrace = 7;</code>
   */
  public com.google.protobuf.ByteString
      getErrorStackTraceBytes() {
    java.lang.Object ref = errorStackTrace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorStackTrace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    propertyReferenceCount_ = 0;
    propertyCount_ = 0;
    pricedRoomCount_ = 0;
    suppliersSearched_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    success_ = "";
    errorMessage_ = "";
    errorStackTrace_ = "";
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
      output.writeInt32(1, propertyReferenceCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, propertyCount_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, pricedRoomCount_);
    }
    for (int i = 0; i < suppliersSearched_.size(); i++) {
      output.writeBytes(4, suppliersSearched_.getByteString(i));
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(5, getSuccessBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBytes(6, getErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBytes(7, getErrorStackTraceBytes());
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
        .computeInt32Size(1, propertyReferenceCount_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, propertyCount_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pricedRoomCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < suppliersSearched_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(suppliersSearched_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getSuppliersSearchedList().size();
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, getSuccessBytes());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, getErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, getErrorStackTraceBytes());
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

  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.jactravel.monitoring.SearchResponseInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.jactravel.monitoring.SearchResponseInfo prototype) {
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
   * Protobuf type {@code Jactravel.Monitoring.SearchResponseInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.jactravel.monitoring.SearchResponseInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jactravel.monitoring.SearchRequestProto.internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jactravel.monitoring.SearchRequestProto.internal_static_Jactravel_Monitoring_SearchResponseInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jactravel.monitoring.SearchResponseInfo.class, com.jactravel.monitoring.SearchResponseInfo.Builder.class);
    }

    // Construct using com.jactravel.monitoring.SearchResponseInfo.newBuilder()
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
      propertyReferenceCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      propertyCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      pricedRoomCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      suppliersSearched_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      success_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      errorMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000020);
      errorStackTrace_ = "";
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jactravel.monitoring.SearchRequestProto.internal_static_Jactravel_Monitoring_SearchResponseInfo_descriptor;
    }

    public com.jactravel.monitoring.SearchResponseInfo getDefaultInstanceForType() {
      return com.jactravel.monitoring.SearchResponseInfo.getDefaultInstance();
    }

    public com.jactravel.monitoring.SearchResponseInfo build() {
      com.jactravel.monitoring.SearchResponseInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.jactravel.monitoring.SearchResponseInfo buildPartial() {
      com.jactravel.monitoring.SearchResponseInfo result = new com.jactravel.monitoring.SearchResponseInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.propertyReferenceCount_ = propertyReferenceCount_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.propertyCount_ = propertyCount_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.pricedRoomCount_ = pricedRoomCount_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        suppliersSearched_ = new com.google.protobuf.UnmodifiableLazyStringList(
            suppliersSearched_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.suppliersSearched_ = suppliersSearched_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000008;
      }
      result.success_ = success_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000010;
      }
      result.errorMessage_ = errorMessage_;
      if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
        to_bitField0_ |= 0x00000020;
      }
      result.errorStackTrace_ = errorStackTrace_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jactravel.monitoring.SearchResponseInfo) {
        return mergeFrom((com.jactravel.monitoring.SearchResponseInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jactravel.monitoring.SearchResponseInfo other) {
      if (other == com.jactravel.monitoring.SearchResponseInfo.getDefaultInstance()) return this;
      if (other.hasPropertyReferenceCount()) {
        setPropertyReferenceCount(other.getPropertyReferenceCount());
      }
      if (other.hasPropertyCount()) {
        setPropertyCount(other.getPropertyCount());
      }
      if (other.hasPricedRoomCount()) {
        setPricedRoomCount(other.getPricedRoomCount());
      }
      if (!other.suppliersSearched_.isEmpty()) {
        if (suppliersSearched_.isEmpty()) {
          suppliersSearched_ = other.suppliersSearched_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureSuppliersSearchedIsMutable();
          suppliersSearched_.addAll(other.suppliersSearched_);
        }
        onChanged();
      }
      if (other.hasSuccess()) {
        bitField0_ |= 0x00000010;
        success_ = other.success_;
        onChanged();
      }
      if (other.hasErrorMessage()) {
        bitField0_ |= 0x00000020;
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (other.hasErrorStackTrace()) {
        bitField0_ |= 0x00000040;
        errorStackTrace_ = other.errorStackTrace_;
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
      com.jactravel.monitoring.SearchResponseInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jactravel.monitoring.SearchResponseInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 propertyReferenceCount = 1;
    private int propertyReferenceCount_ ;
    /**
     * <code>optional int32 propertyReferenceCount = 1;</code>
     *
     * <pre>
     * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
     * </pre>
     */
    public boolean hasPropertyReferenceCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 propertyReferenceCount = 1;</code>
     *
     * <pre>
     * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
     * </pre>
     */
    public int getPropertyReferenceCount() {
      return propertyReferenceCount_;
    }
    /**
     * <code>optional int32 propertyReferenceCount = 1;</code>
     *
     * <pre>
     * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
     * </pre>
     */
    public Builder setPropertyReferenceCount(int value) {
      bitField0_ |= 0x00000001;
      propertyReferenceCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 propertyReferenceCount = 1;</code>
     *
     * <pre>
     * total number of unique Properties retunred in a search (same as TotalProperties in search response xml)
     * </pre>
     */
    public Builder clearPropertyReferenceCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      propertyReferenceCount_ = 0;
      onChanged();
      return this;
    }

    // optional int32 propertyCount = 2;
    private int propertyCount_ ;
    /**
     * <code>optional int32 propertyCount = 2;</code>
     *
     * <pre>
     * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
     * </pre>
     */
    public boolean hasPropertyCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 propertyCount = 2;</code>
     *
     * <pre>
     * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
     * </pre>
     */
    public int getPropertyCount() {
      return propertyCount_;
    }
    /**
     * <code>optional int32 propertyCount = 2;</code>
     *
     * <pre>
     * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
     * </pre>
     */
    public Builder setPropertyCount(int value) {
      bitField0_ |= 0x00000002;
      propertyCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 propertyCount = 2;</code>
     *
     * <pre>
     * total number of unique Properties processed for the search. (i.e. Property Count before the deduplication process)
     * </pre>
     */
    public Builder clearPropertyCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      propertyCount_ = 0;
      onChanged();
      return this;
    }

    // optional int32 pricedRoomCount = 3;
    private int pricedRoomCount_ ;
    /**
     * <code>optional int32 pricedRoomCount = 3;</code>
     */
    public boolean hasPricedRoomCount() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 pricedRoomCount = 3;</code>
     */
    public int getPricedRoomCount() {
      return pricedRoomCount_;
    }
    /**
     * <code>optional int32 pricedRoomCount = 3;</code>
     */
    public Builder setPricedRoomCount(int value) {
      bitField0_ |= 0x00000004;
      pricedRoomCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 pricedRoomCount = 3;</code>
     */
    public Builder clearPricedRoomCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pricedRoomCount_ = 0;
      onChanged();
      return this;
    }

    // repeated string suppliersSearched = 4;
    private com.google.protobuf.LazyStringList suppliersSearched_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSuppliersSearchedIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        suppliersSearched_ = new com.google.protobuf.LazyStringArrayList(suppliersSearched_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public java.util.List<java.lang.String>
        getSuppliersSearchedList() {
      return java.util.Collections.unmodifiableList(suppliersSearched_);
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public int getSuppliersSearchedCount() {
      return suppliersSearched_.size();
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public java.lang.String getSuppliersSearched(int index) {
      return suppliersSearched_.get(index);
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSuppliersSearchedBytes(int index) {
      return suppliersSearched_.getByteString(index);
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public Builder setSuppliersSearched(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSuppliersSearchedIsMutable();
      suppliersSearched_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public Builder addSuppliersSearched(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSuppliersSearchedIsMutable();
      suppliersSearched_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public Builder addAllSuppliersSearched(
        java.lang.Iterable<java.lang.String> values) {
      ensureSuppliersSearchedIsMutable();
      super.addAll(values, suppliersSearched_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public Builder clearSuppliersSearched() {
      suppliersSearched_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string suppliersSearched = 4;</code>
     */
    public Builder addSuppliersSearchedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSuppliersSearchedIsMutable();
      suppliersSearched_.add(value);
      onChanged();
      return this;
    }

    // optional string success = 5;
    private java.lang.Object success_ = "";
    /**
     * <code>optional string success = 5;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string success = 5;</code>
     */
    public java.lang.String getSuccess() {
      java.lang.Object ref = success_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        success_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string success = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSuccessBytes() {
      java.lang.Object ref = success_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        success_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string success = 5;</code>
     */
    public Builder setSuccess(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string success = 5;</code>
     */
    public Builder clearSuccess() {
      bitField0_ = (bitField0_ & ~0x00000010);
      success_ = getDefaultInstance().getSuccess();
      onChanged();
      return this;
    }
    /**
     * <code>optional string success = 5;</code>
     */
    public Builder setSuccessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      success_ = value;
      onChanged();
      return this;
    }

    // optional string errorMessage = 6;
    private java.lang.Object errorMessage_ = "";
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public boolean hasErrorMessage() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public Builder clearErrorMessage() {
      bitField0_ = (bitField0_ & ~0x00000020);
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorMessage = 6;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
      errorMessage_ = value;
      onChanged();
      return this;
    }

    // optional string errorStackTrace = 7;
    private java.lang.Object errorStackTrace_ = "";
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public boolean hasErrorStackTrace() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public java.lang.String getErrorStackTrace() {
      java.lang.Object ref = errorStackTrace_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        errorStackTrace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public com.google.protobuf.ByteString
        getErrorStackTraceBytes() {
      java.lang.Object ref = errorStackTrace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorStackTrace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public Builder setErrorStackTrace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
      errorStackTrace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public Builder clearErrorStackTrace() {
      bitField0_ = (bitField0_ & ~0x00000040);
      errorStackTrace_ = getDefaultInstance().getErrorStackTrace();
      onChanged();
      return this;
    }
    /**
     * <code>optional string errorStackTrace = 7;</code>
     */
    public Builder setErrorStackTraceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
      errorStackTrace_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Jactravel.Monitoring.SearchResponseInfo)
  }

  static {
    defaultInstance = new SearchResponseInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Jactravel.Monitoring.SearchResponseInfo)
}

