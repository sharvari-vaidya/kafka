// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.kafka.code.model.proto;

/**
 * Protobuf type {@code com.kafka.code.model.model.kafkaRequest}
 */
public  final class kafkaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.kafka.code.model.model.kafkaRequest)
    kafkaRequestOrBuilder {
  // Use kafkaRequest.newBuilder() to construct.
  private kafkaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private kafkaRequest() {
    price_ = 0;
    qty_ = 0;
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private kafkaRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            price_ = input.readInt32();
            break;
          }
          case 16: {

            qty_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kafka.code.model.proto.KafkaBasicsProto.internal_static_com_kafka_code_model_model_kafkaRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kafka.code.model.proto.KafkaBasicsProto.internal_static_com_kafka_code_model_model_kafkaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kafka.code.model.proto.kafkaRequest.class, com.kafka.code.model.proto.kafkaRequest.Builder.class);
  }

  public static final int PRICE_FIELD_NUMBER = 1;
  private int price_;
  /**
   * <code>optional int32 price = 1;</code>
   */
  public int getPrice() {
    return price_;
  }

  public static final int QTY_FIELD_NUMBER = 2;
  private int qty_;
  /**
   * <code>optional int32 qty = 2;</code>
   */
  public int getQty() {
    return qty_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (price_ != 0) {
      output.writeInt32(1, price_);
    }
    if (qty_ != 0) {
      output.writeInt32(2, qty_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, price_);
    }
    if (qty_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, qty_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kafka.code.model.proto.kafkaRequest)) {
      return super.equals(obj);
    }
    com.kafka.code.model.proto.kafkaRequest other = (com.kafka.code.model.proto.kafkaRequest) obj;

    boolean result = true;
    result = result && (getPrice()
        == other.getPrice());
    result = result && (getQty()
        == other.getQty());
    result = result && getName()
        .equals(other.getName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (37 * hash) + QTY_FIELD_NUMBER;
    hash = (53 * hash) + getQty();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kafka.code.model.proto.kafkaRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.kafka.code.model.proto.kafkaRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.kafka.code.model.model.kafkaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.kafka.code.model.model.kafkaRequest)
      com.kafka.code.model.proto.kafkaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kafka.code.model.proto.KafkaBasicsProto.internal_static_com_kafka_code_model_model_kafkaRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kafka.code.model.proto.KafkaBasicsProto.internal_static_com_kafka_code_model_model_kafkaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kafka.code.model.proto.kafkaRequest.class, com.kafka.code.model.proto.kafkaRequest.Builder.class);
    }

    // Construct using com.kafka.code.model.proto.kafkaRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      price_ = 0;

      qty_ = 0;

      name_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kafka.code.model.proto.KafkaBasicsProto.internal_static_com_kafka_code_model_model_kafkaRequest_descriptor;
    }

    public com.kafka.code.model.proto.kafkaRequest getDefaultInstanceForType() {
      return com.kafka.code.model.proto.kafkaRequest.getDefaultInstance();
    }

    public com.kafka.code.model.proto.kafkaRequest build() {
      com.kafka.code.model.proto.kafkaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kafka.code.model.proto.kafkaRequest buildPartial() {
      com.kafka.code.model.proto.kafkaRequest result = new com.kafka.code.model.proto.kafkaRequest(this);
      result.price_ = price_;
      result.qty_ = qty_;
      result.name_ = name_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kafka.code.model.proto.kafkaRequest) {
        return mergeFrom((com.kafka.code.model.proto.kafkaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kafka.code.model.proto.kafkaRequest other) {
      if (other == com.kafka.code.model.proto.kafkaRequest.getDefaultInstance()) return this;
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
      }
      if (other.getQty() != 0) {
        setQty(other.getQty());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.kafka.code.model.proto.kafkaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kafka.code.model.proto.kafkaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int price_ ;
    /**
     * <code>optional int32 price = 1;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>optional int32 price = 1;</code>
     */
    public Builder setPrice(int value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 price = 1;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0;
      onChanged();
      return this;
    }

    private int qty_ ;
    /**
     * <code>optional int32 qty = 2;</code>
     */
    public int getQty() {
      return qty_;
    }
    /**
     * <code>optional int32 qty = 2;</code>
     */
    public Builder setQty(int value) {
      
      qty_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 qty = 2;</code>
     */
    public Builder clearQty() {
      
      qty_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.kafka.code.model.model.kafkaRequest)
  }

  // @@protoc_insertion_point(class_scope:com.kafka.code.model.model.kafkaRequest)
  private static final com.kafka.code.model.proto.kafkaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kafka.code.model.proto.kafkaRequest();
  }

  public static com.kafka.code.model.proto.kafkaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<kafkaRequest>
      PARSER = new com.google.protobuf.AbstractParser<kafkaRequest>() {
    public kafkaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new kafkaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<kafkaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<kafkaRequest> getParserForType() {
    return PARSER;
  }

  public com.kafka.code.model.proto.kafkaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
