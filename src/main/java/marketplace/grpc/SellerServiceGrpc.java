package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: seller.proto")
public final class SellerServiceGrpc {

  private SellerServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.SellerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.SellerOuterClass.Seller,
      grpc.SellerOuterClass.CreateSellerResponse> getCreateSellerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSeller",
      requestType = grpc.SellerOuterClass.Seller.class,
      responseType = grpc.SellerOuterClass.CreateSellerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SellerOuterClass.Seller,
      grpc.SellerOuterClass.CreateSellerResponse> getCreateSellerMethod() {
    io.grpc.MethodDescriptor<grpc.SellerOuterClass.Seller, grpc.SellerOuterClass.CreateSellerResponse> getCreateSellerMethod;
    if ((getCreateSellerMethod = SellerServiceGrpc.getCreateSellerMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getCreateSellerMethod = SellerServiceGrpc.getCreateSellerMethod) == null) {
          SellerServiceGrpc.getCreateSellerMethod = getCreateSellerMethod = 
              io.grpc.MethodDescriptor.<grpc.SellerOuterClass.Seller, grpc.SellerOuterClass.CreateSellerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.SellerService", "CreateSeller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.Seller.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.CreateSellerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("CreateSeller"))
                  .build();
          }
        }
     }
     return getCreateSellerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SellerOuterClass.GetSellerInfoRequest,
      grpc.SellerOuterClass.Seller> getGetSellerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSellerInfo",
      requestType = grpc.SellerOuterClass.GetSellerInfoRequest.class,
      responseType = grpc.SellerOuterClass.Seller.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SellerOuterClass.GetSellerInfoRequest,
      grpc.SellerOuterClass.Seller> getGetSellerInfoMethod() {
    io.grpc.MethodDescriptor<grpc.SellerOuterClass.GetSellerInfoRequest, grpc.SellerOuterClass.Seller> getGetSellerInfoMethod;
    if ((getGetSellerInfoMethod = SellerServiceGrpc.getGetSellerInfoMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getGetSellerInfoMethod = SellerServiceGrpc.getGetSellerInfoMethod) == null) {
          SellerServiceGrpc.getGetSellerInfoMethod = getGetSellerInfoMethod = 
              io.grpc.MethodDescriptor.<grpc.SellerOuterClass.GetSellerInfoRequest, grpc.SellerOuterClass.Seller>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.SellerService", "GetSellerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.GetSellerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.Seller.getDefaultInstance()))
                  .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("GetSellerInfo"))
                  .build();
          }
        }
     }
     return getGetSellerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateReviewCountsRequest,
      grpc.SellerOuterClass.UpdateReviewCountsResponse> getUpdateReviewCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReviewCounts",
      requestType = grpc.SellerOuterClass.UpdateReviewCountsRequest.class,
      responseType = grpc.SellerOuterClass.UpdateReviewCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateReviewCountsRequest,
      grpc.SellerOuterClass.UpdateReviewCountsResponse> getUpdateReviewCountsMethod() {
    io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateReviewCountsRequest, grpc.SellerOuterClass.UpdateReviewCountsResponse> getUpdateReviewCountsMethod;
    if ((getUpdateReviewCountsMethod = SellerServiceGrpc.getUpdateReviewCountsMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getUpdateReviewCountsMethod = SellerServiceGrpc.getUpdateReviewCountsMethod) == null) {
          SellerServiceGrpc.getUpdateReviewCountsMethod = getUpdateReviewCountsMethod = 
              io.grpc.MethodDescriptor.<grpc.SellerOuterClass.UpdateReviewCountsRequest, grpc.SellerOuterClass.UpdateReviewCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.SellerService", "UpdateReviewCounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.UpdateReviewCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.UpdateReviewCountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("UpdateReviewCounts"))
                  .build();
          }
        }
     }
     return getUpdateReviewCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateItemsSoldRequest,
      grpc.SellerOuterClass.UpdateItemsSoldResponse> getUpdateItemsSoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemsSold",
      requestType = grpc.SellerOuterClass.UpdateItemsSoldRequest.class,
      responseType = grpc.SellerOuterClass.UpdateItemsSoldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateItemsSoldRequest,
      grpc.SellerOuterClass.UpdateItemsSoldResponse> getUpdateItemsSoldMethod() {
    io.grpc.MethodDescriptor<grpc.SellerOuterClass.UpdateItemsSoldRequest, grpc.SellerOuterClass.UpdateItemsSoldResponse> getUpdateItemsSoldMethod;
    if ((getUpdateItemsSoldMethod = SellerServiceGrpc.getUpdateItemsSoldMethod) == null) {
      synchronized (SellerServiceGrpc.class) {
        if ((getUpdateItemsSoldMethod = SellerServiceGrpc.getUpdateItemsSoldMethod) == null) {
          SellerServiceGrpc.getUpdateItemsSoldMethod = getUpdateItemsSoldMethod = 
              io.grpc.MethodDescriptor.<grpc.SellerOuterClass.UpdateItemsSoldRequest, grpc.SellerOuterClass.UpdateItemsSoldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.SellerService", "UpdateItemsSold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.UpdateItemsSoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SellerOuterClass.UpdateItemsSoldResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SellerServiceMethodDescriptorSupplier("UpdateItemsSold"))
                  .build();
          }
        }
     }
     return getUpdateItemsSoldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SellerServiceStub newStub(io.grpc.Channel channel) {
    return new SellerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SellerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SellerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SellerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SellerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SellerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSeller(grpc.SellerOuterClass.Seller request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.CreateSellerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSellerMethod(), responseObserver);
    }

    /**
     */
    public void getSellerInfo(grpc.SellerOuterClass.GetSellerInfoRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.Seller> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSellerInfoMethod(), responseObserver);
    }

    /**
     */
    public void updateReviewCounts(grpc.SellerOuterClass.UpdateReviewCountsRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateReviewCountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReviewCountsMethod(), responseObserver);
    }

    /**
     */
    public void updateItemsSold(grpc.SellerOuterClass.UpdateItemsSoldRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateItemsSoldResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemsSoldMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSellerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SellerOuterClass.Seller,
                grpc.SellerOuterClass.CreateSellerResponse>(
                  this, METHODID_CREATE_SELLER)))
          .addMethod(
            getGetSellerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SellerOuterClass.GetSellerInfoRequest,
                grpc.SellerOuterClass.Seller>(
                  this, METHODID_GET_SELLER_INFO)))
          .addMethod(
            getUpdateReviewCountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SellerOuterClass.UpdateReviewCountsRequest,
                grpc.SellerOuterClass.UpdateReviewCountsResponse>(
                  this, METHODID_UPDATE_REVIEW_COUNTS)))
          .addMethod(
            getUpdateItemsSoldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SellerOuterClass.UpdateItemsSoldRequest,
                grpc.SellerOuterClass.UpdateItemsSoldResponse>(
                  this, METHODID_UPDATE_ITEMS_SOLD)))
          .build();
    }
  }

  /**
   */
  public static final class SellerServiceStub extends io.grpc.stub.AbstractStub<SellerServiceStub> {
    private SellerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSeller(grpc.SellerOuterClass.Seller request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.CreateSellerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSellerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSellerInfo(grpc.SellerOuterClass.GetSellerInfoRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.Seller> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSellerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReviewCounts(grpc.SellerOuterClass.UpdateReviewCountsRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateReviewCountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReviewCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemsSold(grpc.SellerOuterClass.UpdateItemsSoldRequest request,
        io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateItemsSoldResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemsSoldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SellerServiceBlockingStub extends io.grpc.stub.AbstractStub<SellerServiceBlockingStub> {
    private SellerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.SellerOuterClass.CreateSellerResponse createSeller(grpc.SellerOuterClass.Seller request) {
      return blockingUnaryCall(
          getChannel(), getCreateSellerMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.SellerOuterClass.Seller getSellerInfo(grpc.SellerOuterClass.GetSellerInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSellerInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.SellerOuterClass.UpdateReviewCountsResponse updateReviewCounts(grpc.SellerOuterClass.UpdateReviewCountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReviewCountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.SellerOuterClass.UpdateItemsSoldResponse updateItemsSold(grpc.SellerOuterClass.UpdateItemsSoldRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemsSoldMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SellerServiceFutureStub extends io.grpc.stub.AbstractStub<SellerServiceFutureStub> {
    private SellerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SellerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SellerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SellerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SellerOuterClass.CreateSellerResponse> createSeller(
        grpc.SellerOuterClass.Seller request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSellerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SellerOuterClass.Seller> getSellerInfo(
        grpc.SellerOuterClass.GetSellerInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSellerInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SellerOuterClass.UpdateReviewCountsResponse> updateReviewCounts(
        grpc.SellerOuterClass.UpdateReviewCountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReviewCountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.SellerOuterClass.UpdateItemsSoldResponse> updateItemsSold(
        grpc.SellerOuterClass.UpdateItemsSoldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemsSoldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SELLER = 0;
  private static final int METHODID_GET_SELLER_INFO = 1;
  private static final int METHODID_UPDATE_REVIEW_COUNTS = 2;
  private static final int METHODID_UPDATE_ITEMS_SOLD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SellerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SellerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SELLER:
          serviceImpl.createSeller((grpc.SellerOuterClass.Seller) request,
              (io.grpc.stub.StreamObserver<grpc.SellerOuterClass.CreateSellerResponse>) responseObserver);
          break;
        case METHODID_GET_SELLER_INFO:
          serviceImpl.getSellerInfo((grpc.SellerOuterClass.GetSellerInfoRequest) request,
              (io.grpc.stub.StreamObserver<grpc.SellerOuterClass.Seller>) responseObserver);
          break;
        case METHODID_UPDATE_REVIEW_COUNTS:
          serviceImpl.updateReviewCounts((grpc.SellerOuterClass.UpdateReviewCountsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateReviewCountsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ITEMS_SOLD:
          serviceImpl.updateItemsSold((grpc.SellerOuterClass.UpdateItemsSoldRequest) request,
              (io.grpc.stub.StreamObserver<grpc.SellerOuterClass.UpdateItemsSoldResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SellerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SellerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.SellerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SellerService");
    }
  }

  private static final class SellerServiceFileDescriptorSupplier
      extends SellerServiceBaseDescriptorSupplier {
    SellerServiceFileDescriptorSupplier() {}
  }

  private static final class SellerServiceMethodDescriptorSupplier
      extends SellerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SellerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SellerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SellerServiceFileDescriptorSupplier())
              .addMethod(getCreateSellerMethod())
              .addMethod(getGetSellerInfoMethod())
              .addMethod(getUpdateReviewCountsMethod())
              .addMethod(getUpdateItemsSoldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
