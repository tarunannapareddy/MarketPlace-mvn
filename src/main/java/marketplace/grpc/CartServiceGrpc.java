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
    comments = "Source: cart.proto")
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Cart.GetCartRequest,
      grpc.Cart.GetCartResponse> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = grpc.Cart.GetCartRequest.class,
      responseType = grpc.Cart.GetCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Cart.GetCartRequest,
      grpc.Cart.GetCartResponse> getGetCartMethod() {
    io.grpc.MethodDescriptor<grpc.Cart.GetCartRequest, grpc.Cart.GetCartResponse> getGetCartMethod;
    if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
          CartServiceGrpc.getGetCartMethod = getGetCartMethod = 
              io.grpc.MethodDescriptor.<grpc.Cart.GetCartRequest, grpc.Cart.GetCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.CartService", "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.GetCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.GetCartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetCart"))
                  .build();
          }
        }
     }
     return getGetCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Cart.UpdateCartQuantityRequest,
      grpc.Cart.UpdateCartQuantityResponse> getUpdateCartQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCartQuantity",
      requestType = grpc.Cart.UpdateCartQuantityRequest.class,
      responseType = grpc.Cart.UpdateCartQuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Cart.UpdateCartQuantityRequest,
      grpc.Cart.UpdateCartQuantityResponse> getUpdateCartQuantityMethod() {
    io.grpc.MethodDescriptor<grpc.Cart.UpdateCartQuantityRequest, grpc.Cart.UpdateCartQuantityResponse> getUpdateCartQuantityMethod;
    if ((getUpdateCartQuantityMethod = CartServiceGrpc.getUpdateCartQuantityMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getUpdateCartQuantityMethod = CartServiceGrpc.getUpdateCartQuantityMethod) == null) {
          CartServiceGrpc.getUpdateCartQuantityMethod = getUpdateCartQuantityMethod = 
              io.grpc.MethodDescriptor.<grpc.Cart.UpdateCartQuantityRequest, grpc.Cart.UpdateCartQuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.CartService", "UpdateCartQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.UpdateCartQuantityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.UpdateCartQuantityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("UpdateCartQuantity"))
                  .build();
          }
        }
     }
     return getUpdateCartQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Cart.DeleteCartRequest,
      grpc.Cart.DeleteCartResponse> getDeleteCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCart",
      requestType = grpc.Cart.DeleteCartRequest.class,
      responseType = grpc.Cart.DeleteCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Cart.DeleteCartRequest,
      grpc.Cart.DeleteCartResponse> getDeleteCartMethod() {
    io.grpc.MethodDescriptor<grpc.Cart.DeleteCartRequest, grpc.Cart.DeleteCartResponse> getDeleteCartMethod;
    if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
          CartServiceGrpc.getDeleteCartMethod = getDeleteCartMethod = 
              io.grpc.MethodDescriptor.<grpc.Cart.DeleteCartRequest, grpc.Cart.DeleteCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.CartService", "DeleteCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.DeleteCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Cart.DeleteCartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteCart"))
                  .build();
          }
        }
     }
     return getDeleteCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    return new CartServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CartServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CartServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCart(grpc.Cart.GetCartRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.GetCartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    /**
     */
    public void updateCartQuantity(grpc.Cart.UpdateCartQuantityRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.UpdateCartQuantityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCartQuantityMethod(), responseObserver);
    }

    /**
     */
    public void deleteCart(grpc.Cart.DeleteCartRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.DeleteCartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Cart.GetCartRequest,
                grpc.Cart.GetCartResponse>(
                  this, METHODID_GET_CART)))
          .addMethod(
            getUpdateCartQuantityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Cart.UpdateCartQuantityRequest,
                grpc.Cart.UpdateCartQuantityResponse>(
                  this, METHODID_UPDATE_CART_QUANTITY)))
          .addMethod(
            getDeleteCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Cart.DeleteCartRequest,
                grpc.Cart.DeleteCartResponse>(
                  this, METHODID_DELETE_CART)))
          .build();
    }
  }

  /**
   */
  public static final class CartServiceStub extends io.grpc.stub.AbstractStub<CartServiceStub> {
    private CartServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CartServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCart(grpc.Cart.GetCartRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.GetCartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCartQuantity(grpc.Cart.UpdateCartQuantityRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.UpdateCartQuantityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCartQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCart(grpc.Cart.DeleteCartRequest request,
        io.grpc.stub.StreamObserver<grpc.Cart.DeleteCartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CartServiceBlockingStub extends io.grpc.stub.AbstractStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CartServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Cart.GetCartResponse getCart(grpc.Cart.GetCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Cart.UpdateCartQuantityResponse updateCartQuantity(grpc.Cart.UpdateCartQuantityRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCartQuantityMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Cart.DeleteCartResponse deleteCart(grpc.Cart.DeleteCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CartServiceFutureStub extends io.grpc.stub.AbstractStub<CartServiceFutureStub> {
    private CartServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CartServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Cart.GetCartResponse> getCart(
        grpc.Cart.GetCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Cart.UpdateCartQuantityResponse> updateCartQuantity(
        grpc.Cart.UpdateCartQuantityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCartQuantityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Cart.DeleteCartResponse> deleteCart(
        grpc.Cart.DeleteCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CART = 0;
  private static final int METHODID_UPDATE_CART_QUANTITY = 1;
  private static final int METHODID_DELETE_CART = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CART:
          serviceImpl.getCart((grpc.Cart.GetCartRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Cart.GetCartResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CART_QUANTITY:
          serviceImpl.updateCartQuantity((grpc.Cart.UpdateCartQuantityRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Cart.UpdateCartQuantityResponse>) responseObserver);
          break;
        case METHODID_DELETE_CART:
          serviceImpl.deleteCart((grpc.Cart.DeleteCartRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Cart.DeleteCartResponse>) responseObserver);
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

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Cart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getGetCartMethod())
              .addMethod(getUpdateCartQuantityMethod())
              .addMethod(getDeleteCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
