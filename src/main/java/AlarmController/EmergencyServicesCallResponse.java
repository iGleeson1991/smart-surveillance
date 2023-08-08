// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service3.proto

package AlarmController;

/**
 * Protobuf type {@code EmergencyServicesCallResponse}
 */
public  final class EmergencyServicesCallResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmergencyServicesCallResponse)
    EmergencyServicesCallResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmergencyServicesCallResponse.newBuilder() to construct.
  private EmergencyServicesCallResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmergencyServicesCallResponse() {
    callConfirmation_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmergencyServicesCallResponse(
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

            callConfirmation_ = s;
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
    return AlarmController.AlarmControlsImpl.internal_static_EmergencyServicesCallResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AlarmController.AlarmControlsImpl.internal_static_EmergencyServicesCallResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmController.EmergencyServicesCallResponse.class, AlarmController.EmergencyServicesCallResponse.Builder.class);
  }

  public static final int CALLCONFIRMATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object callConfirmation_;
  /**
   * <code>string callConfirmation = 1;</code>
   */
  public java.lang.String getCallConfirmation() {
    java.lang.Object ref = callConfirmation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callConfirmation_ = s;
      return s;
    }
  }
  /**
   * <code>string callConfirmation = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCallConfirmationBytes() {
    java.lang.Object ref = callConfirmation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callConfirmation_ = b;
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
    if (!getCallConfirmationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, callConfirmation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCallConfirmationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, callConfirmation_);
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
    if (!(obj instanceof AlarmController.EmergencyServicesCallResponse)) {
      return super.equals(obj);
    }
    AlarmController.EmergencyServicesCallResponse other = (AlarmController.EmergencyServicesCallResponse) obj;

    boolean result = true;
    result = result && getCallConfirmation()
        .equals(other.getCallConfirmation());
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
    hash = (37 * hash) + CALLCONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + getCallConfirmation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmController.EmergencyServicesCallResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AlarmController.EmergencyServicesCallResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmController.EmergencyServicesCallResponse parseFrom(
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
  public static Builder newBuilder(AlarmController.EmergencyServicesCallResponse prototype) {
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
   * Protobuf type {@code EmergencyServicesCallResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmergencyServicesCallResponse)
      AlarmController.EmergencyServicesCallResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AlarmController.AlarmControlsImpl.internal_static_EmergencyServicesCallResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AlarmController.AlarmControlsImpl.internal_static_EmergencyServicesCallResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmController.EmergencyServicesCallResponse.class, AlarmController.EmergencyServicesCallResponse.Builder.class);
    }

    // Construct using AlarmController.EmergencyServicesCallResponse.newBuilder()
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
      callConfirmation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AlarmController.AlarmControlsImpl.internal_static_EmergencyServicesCallResponse_descriptor;
    }

    @java.lang.Override
    public AlarmController.EmergencyServicesCallResponse getDefaultInstanceForType() {
      return AlarmController.EmergencyServicesCallResponse.getDefaultInstance();
    }

    @java.lang.Override
    public AlarmController.EmergencyServicesCallResponse build() {
      AlarmController.EmergencyServicesCallResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public AlarmController.EmergencyServicesCallResponse buildPartial() {
      AlarmController.EmergencyServicesCallResponse result = new AlarmController.EmergencyServicesCallResponse(this);
      result.callConfirmation_ = callConfirmation_;
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
      if (other instanceof AlarmController.EmergencyServicesCallResponse) {
        return mergeFrom((AlarmController.EmergencyServicesCallResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmController.EmergencyServicesCallResponse other) {
      if (other == AlarmController.EmergencyServicesCallResponse.getDefaultInstance()) return this;
      if (!other.getCallConfirmation().isEmpty()) {
        callConfirmation_ = other.callConfirmation_;
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
      AlarmController.EmergencyServicesCallResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmController.EmergencyServicesCallResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object callConfirmation_ = "";
    /**
     * <code>string callConfirmation = 1;</code>
     */
    public java.lang.String getCallConfirmation() {
      java.lang.Object ref = callConfirmation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callConfirmation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string callConfirmation = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCallConfirmationBytes() {
      java.lang.Object ref = callConfirmation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callConfirmation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string callConfirmation = 1;</code>
     */
    public Builder setCallConfirmation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callConfirmation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string callConfirmation = 1;</code>
     */
    public Builder clearCallConfirmation() {
      
      callConfirmation_ = getDefaultInstance().getCallConfirmation();
      onChanged();
      return this;
    }
    /**
     * <code>string callConfirmation = 1;</code>
     */
    public Builder setCallConfirmationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callConfirmation_ = value;
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


    // @@protoc_insertion_point(builder_scope:EmergencyServicesCallResponse)
  }

  // @@protoc_insertion_point(class_scope:EmergencyServicesCallResponse)
  private static final AlarmController.EmergencyServicesCallResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AlarmController.EmergencyServicesCallResponse();
  }

  public static AlarmController.EmergencyServicesCallResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmergencyServicesCallResponse>
      PARSER = new com.google.protobuf.AbstractParser<EmergencyServicesCallResponse>() {
    @java.lang.Override
    public EmergencyServicesCallResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmergencyServicesCallResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmergencyServicesCallResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmergencyServicesCallResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public AlarmController.EmergencyServicesCallResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
