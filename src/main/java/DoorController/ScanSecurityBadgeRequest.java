// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service1.proto

package DoorController;

/**
 * Protobuf type {@code ScanSecurityBadgeRequest}
 */
public  final class ScanSecurityBadgeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ScanSecurityBadgeRequest)
    ScanSecurityBadgeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScanSecurityBadgeRequest.newBuilder() to construct.
  private ScanSecurityBadgeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScanSecurityBadgeRequest() {
    doorID_ = "";
    badgeID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScanSecurityBadgeRequest(
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

            doorID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            badgeID_ = s;
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
    return DoorController.DoorControlsImpl.internal_static_ScanSecurityBadgeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DoorController.DoorControlsImpl.internal_static_ScanSecurityBadgeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DoorController.ScanSecurityBadgeRequest.class, DoorController.ScanSecurityBadgeRequest.Builder.class);
  }

  public static final int DOORID_FIELD_NUMBER = 1;
  private volatile java.lang.Object doorID_;
  /**
   * <code>string doorID = 1;</code>
   */
  public java.lang.String getDoorID() {
    java.lang.Object ref = doorID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      doorID_ = s;
      return s;
    }
  }
  /**
   * <code>string doorID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDoorIDBytes() {
    java.lang.Object ref = doorID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      doorID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BADGEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object badgeID_;
  /**
   * <code>string badgeID = 2;</code>
   */
  public java.lang.String getBadgeID() {
    java.lang.Object ref = badgeID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      badgeID_ = s;
      return s;
    }
  }
  /**
   * <code>string badgeID = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBadgeIDBytes() {
    java.lang.Object ref = badgeID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      badgeID_ = b;
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
    if (!getDoorIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, doorID_);
    }
    if (!getBadgeIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, badgeID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDoorIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, doorID_);
    }
    if (!getBadgeIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, badgeID_);
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
    if (!(obj instanceof DoorController.ScanSecurityBadgeRequest)) {
      return super.equals(obj);
    }
    DoorController.ScanSecurityBadgeRequest other = (DoorController.ScanSecurityBadgeRequest) obj;

    boolean result = true;
    result = result && getDoorID()
        .equals(other.getDoorID());
    result = result && getBadgeID()
        .equals(other.getBadgeID());
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
    hash = (37 * hash) + DOORID_FIELD_NUMBER;
    hash = (53 * hash) + getDoorID().hashCode();
    hash = (37 * hash) + BADGEID_FIELD_NUMBER;
    hash = (53 * hash) + getBadgeID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DoorController.ScanSecurityBadgeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DoorController.ScanSecurityBadgeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DoorController.ScanSecurityBadgeRequest parseFrom(
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
  public static Builder newBuilder(DoorController.ScanSecurityBadgeRequest prototype) {
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
   * Protobuf type {@code ScanSecurityBadgeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ScanSecurityBadgeRequest)
      DoorController.ScanSecurityBadgeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DoorController.DoorControlsImpl.internal_static_ScanSecurityBadgeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DoorController.DoorControlsImpl.internal_static_ScanSecurityBadgeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DoorController.ScanSecurityBadgeRequest.class, DoorController.ScanSecurityBadgeRequest.Builder.class);
    }

    // Construct using DoorController.ScanSecurityBadgeRequest.newBuilder()
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
      doorID_ = "";

      badgeID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DoorController.DoorControlsImpl.internal_static_ScanSecurityBadgeRequest_descriptor;
    }

    @java.lang.Override
    public DoorController.ScanSecurityBadgeRequest getDefaultInstanceForType() {
      return DoorController.ScanSecurityBadgeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public DoorController.ScanSecurityBadgeRequest build() {
      DoorController.ScanSecurityBadgeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public DoorController.ScanSecurityBadgeRequest buildPartial() {
      DoorController.ScanSecurityBadgeRequest result = new DoorController.ScanSecurityBadgeRequest(this);
      result.doorID_ = doorID_;
      result.badgeID_ = badgeID_;
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
      if (other instanceof DoorController.ScanSecurityBadgeRequest) {
        return mergeFrom((DoorController.ScanSecurityBadgeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DoorController.ScanSecurityBadgeRequest other) {
      if (other == DoorController.ScanSecurityBadgeRequest.getDefaultInstance()) return this;
      if (!other.getDoorID().isEmpty()) {
        doorID_ = other.doorID_;
        onChanged();
      }
      if (!other.getBadgeID().isEmpty()) {
        badgeID_ = other.badgeID_;
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
      DoorController.ScanSecurityBadgeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DoorController.ScanSecurityBadgeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object doorID_ = "";
    /**
     * <code>string doorID = 1;</code>
     */
    public java.lang.String getDoorID() {
      java.lang.Object ref = doorID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        doorID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string doorID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDoorIDBytes() {
      java.lang.Object ref = doorID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        doorID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string doorID = 1;</code>
     */
    public Builder setDoorID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      doorID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string doorID = 1;</code>
     */
    public Builder clearDoorID() {
      
      doorID_ = getDefaultInstance().getDoorID();
      onChanged();
      return this;
    }
    /**
     * <code>string doorID = 1;</code>
     */
    public Builder setDoorIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      doorID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object badgeID_ = "";
    /**
     * <code>string badgeID = 2;</code>
     */
    public java.lang.String getBadgeID() {
      java.lang.Object ref = badgeID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        badgeID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string badgeID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBadgeIDBytes() {
      java.lang.Object ref = badgeID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        badgeID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string badgeID = 2;</code>
     */
    public Builder setBadgeID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      badgeID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string badgeID = 2;</code>
     */
    public Builder clearBadgeID() {
      
      badgeID_ = getDefaultInstance().getBadgeID();
      onChanged();
      return this;
    }
    /**
     * <code>string badgeID = 2;</code>
     */
    public Builder setBadgeIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      badgeID_ = value;
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


    // @@protoc_insertion_point(builder_scope:ScanSecurityBadgeRequest)
  }

  // @@protoc_insertion_point(class_scope:ScanSecurityBadgeRequest)
  private static final DoorController.ScanSecurityBadgeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DoorController.ScanSecurityBadgeRequest();
  }

  public static DoorController.ScanSecurityBadgeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScanSecurityBadgeRequest>
      PARSER = new com.google.protobuf.AbstractParser<ScanSecurityBadgeRequest>() {
    @java.lang.Override
    public ScanSecurityBadgeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScanSecurityBadgeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScanSecurityBadgeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScanSecurityBadgeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public DoorController.ScanSecurityBadgeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

