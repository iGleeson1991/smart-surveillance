// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2.proto

package Service2;

public interface CameraAutomationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CameraAutomationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cameraID = 1;</code>
   */
  java.lang.String getCameraID();
  /**
   * <code>string cameraID = 1;</code>
   */
  com.google.protobuf.ByteString
      getCameraIDBytes();

  /**
   * <code>bool motionDetected = 2;</code>
   */
  boolean getMotionDetected();

  /**
   * <code>bool cameraBeingControlled = 3;</code>
   */
  boolean getCameraBeingControlled();

  /**
   * <code>string locationOfMovement = 4;</code>
   */
  java.lang.String getLocationOfMovement();
  /**
   * <code>string locationOfMovement = 4;</code>
   */
  com.google.protobuf.ByteString
      getLocationOfMovementBytes();

  /**
   * <code>string cameraPosition = 5;</code>
   */
  java.lang.String getCameraPosition();
  /**
   * <code>string cameraPosition = 5;</code>
   */
  com.google.protobuf.ByteString
      getCameraPositionBytes();
}
