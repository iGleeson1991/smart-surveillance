// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service3.proto

package AlarmController;

/**
 * Protobuf type {@code AlarmCheckResponse}
 */
public  final class AlarmCheckResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AlarmCheckResponse)
    AlarmCheckResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmCheckResponse.newBuilder() to construct.
  private AlarmCheckResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmCheckResponse() {
    alarmInfo_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlarmCheckResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            alarmInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return AlarmController.AlarmControlsImpl.internal_static_AlarmCheckResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AlarmController.AlarmControlsImpl.internal_static_AlarmCheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmController.AlarmCheckResponse.class, AlarmController.AlarmCheckResponse.Builder.class);
  }

  public static final int ALARMINFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object alarmInfo_;
  /**
   * <code>string alarmInfo = 1;</code>
   */
  public java.lang.String getAlarmInfo() {
    java.lang.Object ref = alarmInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alarmInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string alarmInfo = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAlarmInfoBytes() {
    java.lang.Object ref = alarmInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alarmInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAlarmInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alarmInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAlarmInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alarmInfo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AlarmController.AlarmCheckResponse)) {
      return super.equals(obj);
    }
    AlarmController.AlarmCheckResponse other = (AlarmController.AlarmCheckResponse) obj;

    boolean result = true;
    result = result && getAlarmInfo()
        .equals(other.getAlarmInfo());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALARMINFO_FIELD_NUMBER;
    hash = (53 * hash) + getAlarmInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AlarmController.AlarmCheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmController.AlarmCheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AlarmController.AlarmCheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmController.AlarmCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AlarmController.AlarmCheckResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AlarmCheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AlarmCheckResponse)
      AlarmController.AlarmCheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AlarmController.AlarmControlsImpl.internal_static_AlarmCheckResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AlarmController.AlarmControlsImpl.internal_static_AlarmCheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmController.AlarmCheckResponse.class, AlarmController.AlarmCheckResponse.Builder.class);
    }

    // Construct using AlarmController.AlarmCheckResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      alarmInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AlarmController.AlarmControlsImpl.internal_static_AlarmCheckResponse_descriptor;
    }

    @java.lang.Override
    public AlarmController.AlarmCheckResponse getDefaultInstanceForType() {
      return AlarmController.AlarmCheckResponse.getDefaultInstance();
    }

    @java.lang.Override
    public AlarmController.AlarmCheckResponse build() {
      AlarmController.AlarmCheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public AlarmController.AlarmCheckResponse buildPartial() {
      AlarmController.AlarmCheckResponse result = new AlarmController.AlarmCheckResponse(this);
      result.alarmInfo_ = alarmInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AlarmController.AlarmCheckResponse) {
        return mergeFrom((AlarmController.AlarmCheckResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmController.AlarmCheckResponse other) {
      if (other == AlarmController.AlarmCheckResponse.getDefaultInstance()) return this;
      if (!other.getAlarmInfo().isEmpty()) {
        alarmInfo_ = other.alarmInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      AlarmController.AlarmCheckResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmController.AlarmCheckResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object alarmInfo_ = "";
    /**
     * <code>string alarmInfo = 1;</code>
     */
    public java.lang.String getAlarmInfo() {
      java.lang.Object ref = alarmInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alarmInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alarmInfo = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAlarmInfoBytes() {
      java.lang.Object ref = alarmInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alarmInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alarmInfo = 1;</code>
     */
    public Builder setAlarmInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alarmInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alarmInfo = 1;</code>
     */
    public Builder clearAlarmInfo() {
      
      alarmInfo_ = getDefaultInstance().getAlarmInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string alarmInfo = 1;</code>
     */
    public Builder setAlarmInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alarmInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AlarmCheckResponse)
  }

  // @@protoc_insertion_point(class_scope:AlarmCheckResponse)
  private static final AlarmController.AlarmCheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AlarmController.AlarmCheckResponse();
  }

  public static AlarmController.AlarmCheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmCheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlarmCheckResponse>() {
    @java.lang.Override
    public AlarmCheckResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlarmCheckResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmCheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmCheckResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public AlarmController.AlarmCheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
