// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ping_pong.proto

package ru.irit.grpctestserver;

public final class PingPongOuterClass {
  private PingPongOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_irit_grpctestserver_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ru_irit_grpctestserver_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_irit_grpctestserver_Pong_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ru_irit_grpctestserver_Pong_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ping_pong.proto\022\026ru.irit.grpctestserve" +
      "r\"\033\n\004Ping\022\023\n\013requestPing\030\001 \001(\t\"\031\n\004Pong\022\021" +
      "\n\treplyPong\030\001 \001(\t2X\n\010PingPong\022L\n\014testPin" +
      "gPong\022\034.ru.irit.grpctestserver.Ping\032\034.ru" +
      ".irit.grpctestserver.Pong\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ru_irit_grpctestserver_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ru_irit_grpctestserver_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ru_irit_grpctestserver_Ping_descriptor,
        new java.lang.String[] { "RequestPing", });
    internal_static_ru_irit_grpctestserver_Pong_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ru_irit_grpctestserver_Pong_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ru_irit_grpctestserver_Pong_descriptor,
        new java.lang.String[] { "ReplyPong", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
