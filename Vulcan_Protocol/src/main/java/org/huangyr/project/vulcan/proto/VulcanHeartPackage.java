// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VulcanTransferProto.proto

package org.huangyr.project.vulcan.proto;

/**
 * <pre>
 * 心跳数据包
 * </pre>
 *
 * Protobuf type {@code org.huangyr.project.vulcan.proto.VulcanHeartPackage}
 */
public  final class VulcanHeartPackage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.huangyr.project.vulcan.proto.VulcanHeartPackage)
    VulcanHeartPackageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VulcanHeartPackage.newBuilder() to construct.
  private VulcanHeartPackage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VulcanHeartPackage() {
    message_ = "";
    ip_ = "";
    heartTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VulcanHeartPackage(
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

            message_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 24: {

            heartTime_ = input.readUInt64();
            break;
          }
          case 34: {
            org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder subBuilder = null;
            if (runnerNodeInfo_ != null) {
              subBuilder = runnerNodeInfo_.toBuilder();
            }
            runnerNodeInfo_ = input.readMessage(org.huangyr.project.vulcan.proto.RunnerNodeInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(runnerNodeInfo_);
              runnerNodeInfo_ = subBuilder.buildPartial();
            }

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
    return org.huangyr.project.vulcan.proto.VulcanTransferProto.internal_static_org_huangyr_project_vulcan_proto_VulcanHeartPackage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.huangyr.project.vulcan.proto.VulcanTransferProto.internal_static_org_huangyr_project_vulcan_proto_VulcanHeartPackage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.huangyr.project.vulcan.proto.VulcanHeartPackage.class, org.huangyr.project.vulcan.proto.VulcanHeartPackage.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * 心跳消息
   * </pre>
   *
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 心跳消息
   * </pre>
   *
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_FIELD_NUMBER = 2;
  private volatile java.lang.Object ip_;
  /**
   * <pre>
   * 发送心跳的机器IP
   * </pre>
   *
   * <code>string ip = 2;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 发送心跳的机器IP
   * </pre>
   *
   * <code>string ip = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEARTTIME_FIELD_NUMBER = 3;
  private long heartTime_;
  /**
   * <pre>
   * 发送心跳时间
   * </pre>
   *
   * <code>uint64 heartTime = 3;</code>
   */
  public long getHeartTime() {
    return heartTime_;
  }

  public static final int RUNNERNODEINFO_FIELD_NUMBER = 4;
  private org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo_;
  /**
   * <pre>
   * 上报Runner自身节点信息
   * </pre>
   *
   * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
   */
  public boolean hasRunnerNodeInfo() {
    return runnerNodeInfo_ != null;
  }
  /**
   * <pre>
   * 上报Runner自身节点信息
   * </pre>
   *
   * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
   */
  public org.huangyr.project.vulcan.proto.RunnerNodeInfo getRunnerNodeInfo() {
    return runnerNodeInfo_ == null ? org.huangyr.project.vulcan.proto.RunnerNodeInfo.getDefaultInstance() : runnerNodeInfo_;
  }
  /**
   * <pre>
   * 上报Runner自身节点信息
   * </pre>
   *
   * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
   */
  public org.huangyr.project.vulcan.proto.RunnerNodeInfoOrBuilder getRunnerNodeInfoOrBuilder() {
    return getRunnerNodeInfo();
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
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ip_);
    }
    if (heartTime_ != 0L) {
      output.writeUInt64(3, heartTime_);
    }
    if (runnerNodeInfo_ != null) {
      output.writeMessage(4, getRunnerNodeInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ip_);
    }
    if (heartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, heartTime_);
    }
    if (runnerNodeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getRunnerNodeInfo());
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
    if (!(obj instanceof org.huangyr.project.vulcan.proto.VulcanHeartPackage)) {
      return super.equals(obj);
    }
    org.huangyr.project.vulcan.proto.VulcanHeartPackage other = (org.huangyr.project.vulcan.proto.VulcanHeartPackage) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getIp()
        .equals(other.getIp());
    result = result && (getHeartTime()
        == other.getHeartTime());
    result = result && (hasRunnerNodeInfo() == other.hasRunnerNodeInfo());
    if (hasRunnerNodeInfo()) {
      result = result && getRunnerNodeInfo()
          .equals(other.getRunnerNodeInfo());
    }
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + HEARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeartTime());
    if (hasRunnerNodeInfo()) {
      hash = (37 * hash) + RUNNERNODEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getRunnerNodeInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage parseFrom(
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
  public static Builder newBuilder(org.huangyr.project.vulcan.proto.VulcanHeartPackage prototype) {
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
   * <pre>
   * 心跳数据包
   * </pre>
   *
   * Protobuf type {@code org.huangyr.project.vulcan.proto.VulcanHeartPackage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.huangyr.project.vulcan.proto.VulcanHeartPackage)
      org.huangyr.project.vulcan.proto.VulcanHeartPackageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.huangyr.project.vulcan.proto.VulcanTransferProto.internal_static_org_huangyr_project_vulcan_proto_VulcanHeartPackage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.huangyr.project.vulcan.proto.VulcanTransferProto.internal_static_org_huangyr_project_vulcan_proto_VulcanHeartPackage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.huangyr.project.vulcan.proto.VulcanHeartPackage.class, org.huangyr.project.vulcan.proto.VulcanHeartPackage.Builder.class);
    }

    // Construct using org.huangyr.project.vulcan.proto.VulcanHeartPackage.newBuilder()
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
      message_ = "";

      ip_ = "";

      heartTime_ = 0L;

      if (runnerNodeInfoBuilder_ == null) {
        runnerNodeInfo_ = null;
      } else {
        runnerNodeInfo_ = null;
        runnerNodeInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.huangyr.project.vulcan.proto.VulcanTransferProto.internal_static_org_huangyr_project_vulcan_proto_VulcanHeartPackage_descriptor;
    }

    @java.lang.Override
    public org.huangyr.project.vulcan.proto.VulcanHeartPackage getDefaultInstanceForType() {
      return org.huangyr.project.vulcan.proto.VulcanHeartPackage.getDefaultInstance();
    }

    @java.lang.Override
    public org.huangyr.project.vulcan.proto.VulcanHeartPackage build() {
      org.huangyr.project.vulcan.proto.VulcanHeartPackage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.huangyr.project.vulcan.proto.VulcanHeartPackage buildPartial() {
      org.huangyr.project.vulcan.proto.VulcanHeartPackage result = new org.huangyr.project.vulcan.proto.VulcanHeartPackage(this);
      result.message_ = message_;
      result.ip_ = ip_;
      result.heartTime_ = heartTime_;
      if (runnerNodeInfoBuilder_ == null) {
        result.runnerNodeInfo_ = runnerNodeInfo_;
      } else {
        result.runnerNodeInfo_ = runnerNodeInfoBuilder_.build();
      }
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
      if (other instanceof org.huangyr.project.vulcan.proto.VulcanHeartPackage) {
        return mergeFrom((org.huangyr.project.vulcan.proto.VulcanHeartPackage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.huangyr.project.vulcan.proto.VulcanHeartPackage other) {
      if (other == org.huangyr.project.vulcan.proto.VulcanHeartPackage.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (other.getHeartTime() != 0L) {
        setHeartTime(other.getHeartTime());
      }
      if (other.hasRunnerNodeInfo()) {
        mergeRunnerNodeInfo(other.getRunnerNodeInfo());
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
      org.huangyr.project.vulcan.proto.VulcanHeartPackage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.huangyr.project.vulcan.proto.VulcanHeartPackage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * 心跳消息
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 心跳消息
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 心跳消息
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 心跳消息
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 心跳消息
     * </pre>
     *
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ip_ = "";
    /**
     * <pre>
     * 发送心跳的机器IP
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 发送心跳的机器IP
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 发送心跳的机器IP
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 发送心跳的机器IP
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder clearIp() {
      
      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 发送心跳的机器IP
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ip_ = value;
      onChanged();
      return this;
    }

    private long heartTime_ ;
    /**
     * <pre>
     * 发送心跳时间
     * </pre>
     *
     * <code>uint64 heartTime = 3;</code>
     */
    public long getHeartTime() {
      return heartTime_;
    }
    /**
     * <pre>
     * 发送心跳时间
     * </pre>
     *
     * <code>uint64 heartTime = 3;</code>
     */
    public Builder setHeartTime(long value) {
      
      heartTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 发送心跳时间
     * </pre>
     *
     * <code>uint64 heartTime = 3;</code>
     */
    public Builder clearHeartTime() {
      
      heartTime_ = 0L;
      onChanged();
      return this;
    }

    private org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.huangyr.project.vulcan.proto.RunnerNodeInfo, org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder, org.huangyr.project.vulcan.proto.RunnerNodeInfoOrBuilder> runnerNodeInfoBuilder_;
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public boolean hasRunnerNodeInfo() {
      return runnerNodeInfoBuilder_ != null || runnerNodeInfo_ != null;
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public org.huangyr.project.vulcan.proto.RunnerNodeInfo getRunnerNodeInfo() {
      if (runnerNodeInfoBuilder_ == null) {
        return runnerNodeInfo_ == null ? org.huangyr.project.vulcan.proto.RunnerNodeInfo.getDefaultInstance() : runnerNodeInfo_;
      } else {
        return runnerNodeInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public Builder setRunnerNodeInfo(org.huangyr.project.vulcan.proto.RunnerNodeInfo value) {
      if (runnerNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runnerNodeInfo_ = value;
        onChanged();
      } else {
        runnerNodeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public Builder setRunnerNodeInfo(
        org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder builderForValue) {
      if (runnerNodeInfoBuilder_ == null) {
        runnerNodeInfo_ = builderForValue.build();
        onChanged();
      } else {
        runnerNodeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public Builder mergeRunnerNodeInfo(org.huangyr.project.vulcan.proto.RunnerNodeInfo value) {
      if (runnerNodeInfoBuilder_ == null) {
        if (runnerNodeInfo_ != null) {
          runnerNodeInfo_ =
            org.huangyr.project.vulcan.proto.RunnerNodeInfo.newBuilder(runnerNodeInfo_).mergeFrom(value).buildPartial();
        } else {
          runnerNodeInfo_ = value;
        }
        onChanged();
      } else {
        runnerNodeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public Builder clearRunnerNodeInfo() {
      if (runnerNodeInfoBuilder_ == null) {
        runnerNodeInfo_ = null;
        onChanged();
      } else {
        runnerNodeInfo_ = null;
        runnerNodeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder getRunnerNodeInfoBuilder() {
      
      onChanged();
      return getRunnerNodeInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    public org.huangyr.project.vulcan.proto.RunnerNodeInfoOrBuilder getRunnerNodeInfoOrBuilder() {
      if (runnerNodeInfoBuilder_ != null) {
        return runnerNodeInfoBuilder_.getMessageOrBuilder();
      } else {
        return runnerNodeInfo_ == null ?
            org.huangyr.project.vulcan.proto.RunnerNodeInfo.getDefaultInstance() : runnerNodeInfo_;
      }
    }
    /**
     * <pre>
     * 上报Runner自身节点信息
     * </pre>
     *
     * <code>.org.huangyr.project.vulcan.proto.RunnerNodeInfo runnerNodeInfo = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.huangyr.project.vulcan.proto.RunnerNodeInfo, org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder, org.huangyr.project.vulcan.proto.RunnerNodeInfoOrBuilder> 
        getRunnerNodeInfoFieldBuilder() {
      if (runnerNodeInfoBuilder_ == null) {
        runnerNodeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.huangyr.project.vulcan.proto.RunnerNodeInfo, org.huangyr.project.vulcan.proto.RunnerNodeInfo.Builder, org.huangyr.project.vulcan.proto.RunnerNodeInfoOrBuilder>(
                getRunnerNodeInfo(),
                getParentForChildren(),
                isClean());
        runnerNodeInfo_ = null;
      }
      return runnerNodeInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.huangyr.project.vulcan.proto.VulcanHeartPackage)
  }

  // @@protoc_insertion_point(class_scope:org.huangyr.project.vulcan.proto.VulcanHeartPackage)
  private static final org.huangyr.project.vulcan.proto.VulcanHeartPackage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.huangyr.project.vulcan.proto.VulcanHeartPackage();
  }

  public static org.huangyr.project.vulcan.proto.VulcanHeartPackage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VulcanHeartPackage>
      PARSER = new com.google.protobuf.AbstractParser<VulcanHeartPackage>() {
    @java.lang.Override
    public VulcanHeartPackage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VulcanHeartPackage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VulcanHeartPackage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VulcanHeartPackage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.huangyr.project.vulcan.proto.VulcanHeartPackage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

