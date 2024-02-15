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
 * <pre>
 * Define gRPC service for Buyer DAO
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: buyer.proto")
public final class BuyerServiceGrpc {

  private BuyerServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.BuyerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.BuyerOuterClass.Buyer,
      grpc.BuyerOuterClass.CreateBuyerResponse> getCreateBuyerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBuyer",
      requestType = grpc.BuyerOuterClass.Buyer.class,
      responseType = grpc.BuyerOuterClass.CreateBuyerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.BuyerOuterClass.Buyer,
      grpc.BuyerOuterClass.CreateBuyerResponse> getCreateBuyerMethod() {
    io.grpc.MethodDescriptor<grpc.BuyerOuterClass.Buyer, grpc.BuyerOuterClass.CreateBuyerResponse> getCreateBuyerMethod;
    if ((getCreateBuyerMethod = BuyerServiceGrpc.getCreateBuyerMethod) == null) {
      synchronized (BuyerServiceGrpc.class) {
        if ((getCreateBuyerMethod = BuyerServiceGrpc.getCreateBuyerMethod) == null) {
          BuyerServiceGrpc.getCreateBuyerMethod = getCreateBuyerMethod = 
              io.grpc.MethodDescriptor.<grpc.BuyerOuterClass.Buyer, grpc.BuyerOuterClass.CreateBuyerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.BuyerService", "CreateBuyer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.Buyer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.CreateBuyerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuyerServiceMethodDescriptorSupplier("CreateBuyer"))
                  .build();
          }
        }
     }
     return getCreateBuyerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.BuyerOuterClass.GetBuyerInfoRequest,
      grpc.BuyerOuterClass.Buyer> getGetBuyerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBuyerInfo",
      requestType = grpc.BuyerOuterClass.GetBuyerInfoRequest.class,
      responseType = grpc.BuyerOuterClass.Buyer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.BuyerOuterClass.GetBuyerInfoRequest,
      grpc.BuyerOuterClass.Buyer> getGetBuyerInfoMethod() {
    io.grpc.MethodDescriptor<grpc.BuyerOuterClass.GetBuyerInfoRequest, grpc.BuyerOuterClass.Buyer> getGetBuyerInfoMethod;
    if ((getGetBuyerInfoMethod = BuyerServiceGrpc.getGetBuyerInfoMethod) == null) {
      synchronized (BuyerServiceGrpc.class) {
        if ((getGetBuyerInfoMethod = BuyerServiceGrpc.getGetBuyerInfoMethod) == null) {
          BuyerServiceGrpc.getGetBuyerInfoMethod = getGetBuyerInfoMethod = 
              io.grpc.MethodDescriptor.<grpc.BuyerOuterClass.GetBuyerInfoRequest, grpc.BuyerOuterClass.Buyer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.BuyerService", "GetBuyerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.GetBuyerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.Buyer.getDefaultInstance()))
                  .setSchemaDescriptor(new BuyerServiceMethodDescriptorSupplier("GetBuyerInfo"))
                  .build();
          }
        }
     }
     return getGetBuyerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.BuyerOuterClass.UpdateNumItemsRequest,
      grpc.BuyerOuterClass.UpdateNumItemsResponse> getUpdateNumItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNumItems",
      requestType = grpc.BuyerOuterClass.UpdateNumItemsRequest.class,
      responseType = grpc.BuyerOuterClass.UpdateNumItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.BuyerOuterClass.UpdateNumItemsRequest,
      grpc.BuyerOuterClass.UpdateNumItemsResponse> getUpdateNumItemsMethod() {
    io.grpc.MethodDescriptor<grpc.BuyerOuterClass.UpdateNumItemsRequest, grpc.BuyerOuterClass.UpdateNumItemsResponse> getUpdateNumItemsMethod;
    if ((getUpdateNumItemsMethod = BuyerServiceGrpc.getUpdateNumItemsMethod) == null) {
      synchronized (BuyerServiceGrpc.class) {
        if ((getUpdateNumItemsMethod = BuyerServiceGrpc.getUpdateNumItemsMethod) == null) {
          BuyerServiceGrpc.getUpdateNumItemsMethod = getUpdateNumItemsMethod = 
              io.grpc.MethodDescriptor.<grpc.BuyerOuterClass.UpdateNumItemsRequest, grpc.BuyerOuterClass.UpdateNumItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.BuyerService", "UpdateNumItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.UpdateNumItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.BuyerOuterClass.UpdateNumItemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuyerServiceMethodDescriptorSupplier("UpdateNumItems"))
                  .build();
          }
        }
     }
     return getUpdateNumItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuyerServiceStub newStub(io.grpc.Channel channel) {
    return new BuyerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuyerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuyerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuyerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuyerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Define gRPC service for Buyer DAO
   * </pre>
   */
  public static abstract class BuyerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to create a Buyer
     * </pre>
     */
    public void createBuyer(grpc.BuyerOuterClass.Buyer request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.CreateBuyerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBuyerMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to retrieve Buyer information
     * </pre>
     */
    public void getBuyerInfo(grpc.BuyerOuterClass.GetBuyerInfoRequest request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.Buyer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBuyerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to update the number of items purchased by a Buyer
     * </pre>
     */
    public void updateNumItems(grpc.BuyerOuterClass.UpdateNumItemsRequest request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.UpdateNumItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNumItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBuyerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.BuyerOuterClass.Buyer,
                grpc.BuyerOuterClass.CreateBuyerResponse>(
                  this, METHODID_CREATE_BUYER)))
          .addMethod(
            getGetBuyerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.BuyerOuterClass.GetBuyerInfoRequest,
                grpc.BuyerOuterClass.Buyer>(
                  this, METHODID_GET_BUYER_INFO)))
          .addMethod(
            getUpdateNumItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.BuyerOuterClass.UpdateNumItemsRequest,
                grpc.BuyerOuterClass.UpdateNumItemsResponse>(
                  this, METHODID_UPDATE_NUM_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Define gRPC service for Buyer DAO
   * </pre>
   */
  public static final class BuyerServiceStub extends io.grpc.stub.AbstractStub<BuyerServiceStub> {
    private BuyerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuyerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuyerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuyerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to create a Buyer
     * </pre>
     */
    public void createBuyer(grpc.BuyerOuterClass.Buyer request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.CreateBuyerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBuyerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to retrieve Buyer information
     * </pre>
     */
    public void getBuyerInfo(grpc.BuyerOuterClass.GetBuyerInfoRequest request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.Buyer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBuyerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to update the number of items purchased by a Buyer
     * </pre>
     */
    public void updateNumItems(grpc.BuyerOuterClass.UpdateNumItemsRequest request,
        io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.UpdateNumItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNumItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define gRPC service for Buyer DAO
   * </pre>
   */
  public static final class BuyerServiceBlockingStub extends io.grpc.stub.AbstractStub<BuyerServiceBlockingStub> {
    private BuyerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuyerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuyerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuyerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to create a Buyer
     * </pre>
     */
    public grpc.BuyerOuterClass.CreateBuyerResponse createBuyer(grpc.BuyerOuterClass.Buyer request) {
      return blockingUnaryCall(
          getChannel(), getCreateBuyerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to retrieve Buyer information
     * </pre>
     */
    public grpc.BuyerOuterClass.Buyer getBuyerInfo(grpc.BuyerOuterClass.GetBuyerInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBuyerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to update the number of items purchased by a Buyer
     * </pre>
     */
    public grpc.BuyerOuterClass.UpdateNumItemsResponse updateNumItems(grpc.BuyerOuterClass.UpdateNumItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNumItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define gRPC service for Buyer DAO
   * </pre>
   */
  public static final class BuyerServiceFutureStub extends io.grpc.stub.AbstractStub<BuyerServiceFutureStub> {
    private BuyerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuyerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuyerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuyerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to create a Buyer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.BuyerOuterClass.CreateBuyerResponse> createBuyer(
        grpc.BuyerOuterClass.Buyer request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBuyerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to retrieve Buyer information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.BuyerOuterClass.Buyer> getBuyerInfo(
        grpc.BuyerOuterClass.GetBuyerInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBuyerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to update the number of items purchased by a Buyer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.BuyerOuterClass.UpdateNumItemsResponse> updateNumItems(
        grpc.BuyerOuterClass.UpdateNumItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNumItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUYER = 0;
  private static final int METHODID_GET_BUYER_INFO = 1;
  private static final int METHODID_UPDATE_NUM_ITEMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuyerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuyerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BUYER:
          serviceImpl.createBuyer((grpc.BuyerOuterClass.Buyer) request,
              (io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.CreateBuyerResponse>) responseObserver);
          break;
        case METHODID_GET_BUYER_INFO:
          serviceImpl.getBuyerInfo((grpc.BuyerOuterClass.GetBuyerInfoRequest) request,
              (io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.Buyer>) responseObserver);
          break;
        case METHODID_UPDATE_NUM_ITEMS:
          serviceImpl.updateNumItems((grpc.BuyerOuterClass.UpdateNumItemsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.BuyerOuterClass.UpdateNumItemsResponse>) responseObserver);
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

  private static abstract class BuyerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuyerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.BuyerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuyerService");
    }
  }

  private static final class BuyerServiceFileDescriptorSupplier
      extends BuyerServiceBaseDescriptorSupplier {
    BuyerServiceFileDescriptorSupplier() {}
  }

  private static final class BuyerServiceMethodDescriptorSupplier
      extends BuyerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuyerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuyerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuyerServiceFileDescriptorSupplier())
              .addMethod(getCreateBuyerMethod())
              .addMethod(getGetBuyerInfoMethod())
              .addMethod(getUpdateNumItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
