// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service2.proto

package CameraController;

public interface CameraAdjustmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CameraAdjustmentRequest)
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
   * <code>.CameraAdjustmentRequest.CameraDirection cameraDirection = 2;</code>
   */
  int getCameraDirectionValue();
  /**
   * <code>.CameraAdjustmentRequest.CameraDirection cameraDirection = 2;</code>
   */
  CameraController.CameraAdjustmentRequest.CameraDirection getCameraDirection();

  /**
   * <code>bool cameraBeingControlled = 3;</code>
   */
  boolean getCameraBeingControlled();
}
