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
    comments = "Source: user.proto")
public final class UserDAOServiceGrpc {

  private UserDAOServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.UserDAOService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.User.CreateUserRequest,
      grpc.User.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = grpc.User.CreateUserRequest.class,
      responseType = grpc.User.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.User.CreateUserRequest,
      grpc.User.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<grpc.User.CreateUserRequest, grpc.User.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserDAOServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserDAOServiceGrpc.class) {
        if ((getCreateUserMethod = UserDAOServiceGrpc.getCreateUserMethod) == null) {
          UserDAOServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<grpc.User.CreateUserRequest, grpc.User.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.UserDAOService", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserDAOServiceMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.User.GetUserRequest,
      grpc.User.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = grpc.User.GetUserRequest.class,
      responseType = grpc.User.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.User.GetUserRequest,
      grpc.User.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<grpc.User.GetUserRequest, grpc.User.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserDAOServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserDAOServiceGrpc.class) {
        if ((getGetUserMethod = UserDAOServiceGrpc.getGetUserMethod) == null) {
          UserDAOServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<grpc.User.GetUserRequest, grpc.User.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.UserDAOService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserDAOServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.User.GetAccountRequest,
      grpc.User.GetUserResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = grpc.User.GetAccountRequest.class,
      responseType = grpc.User.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.User.GetAccountRequest,
      grpc.User.GetUserResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<grpc.User.GetAccountRequest, grpc.User.GetUserResponse> getGetAccountMethod;
    if ((getGetAccountMethod = UserDAOServiceGrpc.getGetAccountMethod) == null) {
      synchronized (UserDAOServiceGrpc.class) {
        if ((getGetAccountMethod = UserDAOServiceGrpc.getGetAccountMethod) == null) {
          UserDAOServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<grpc.User.GetAccountRequest, grpc.User.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.UserDAOService", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.User.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserDAOServiceMethodDescriptorSupplier("GetAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserDAOServiceStub newStub(io.grpc.Channel channel) {
    return new UserDAOServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserDAOServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserDAOServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserDAOServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserDAOServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserDAOServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(grpc.User.CreateUserRequest request,
        io.grpc.stub.StreamObserver<grpc.User.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(grpc.User.GetUserRequest request,
        io.grpc.stub.StreamObserver<grpc.User.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(grpc.User.GetAccountRequest request,
        io.grpc.stub.StreamObserver<grpc.User.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.User.CreateUserRequest,
                grpc.User.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.User.GetUserRequest,
                grpc.User.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.User.GetAccountRequest,
                grpc.User.GetUserResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class UserDAOServiceStub extends io.grpc.stub.AbstractStub<UserDAOServiceStub> {
    private UserDAOServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDAOServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDAOServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDAOServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(grpc.User.CreateUserRequest request,
        io.grpc.stub.StreamObserver<grpc.User.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(grpc.User.GetUserRequest request,
        io.grpc.stub.StreamObserver<grpc.User.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(grpc.User.GetAccountRequest request,
        io.grpc.stub.StreamObserver<grpc.User.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserDAOServiceBlockingStub extends io.grpc.stub.AbstractStub<UserDAOServiceBlockingStub> {
    private UserDAOServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDAOServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDAOServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDAOServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.User.CreateUserResponse createUser(grpc.User.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User.GetUserResponse getUser(grpc.User.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.User.GetUserResponse getAccount(grpc.User.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserDAOServiceFutureStub extends io.grpc.stub.AbstractStub<UserDAOServiceFutureStub> {
    private UserDAOServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDAOServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDAOServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDAOServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User.CreateUserResponse> createUser(
        grpc.User.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User.GetUserResponse> getUser(
        grpc.User.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.User.GetUserResponse> getAccount(
        grpc.User.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_GET_ACCOUNT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserDAOServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserDAOServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((grpc.User.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<grpc.User.CreateUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((grpc.User.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<grpc.User.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((grpc.User.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<grpc.User.GetUserResponse>) responseObserver);
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

  private static abstract class UserDAOServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserDAOServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserDAOService");
    }
  }

  private static final class UserDAOServiceFileDescriptorSupplier
      extends UserDAOServiceBaseDescriptorSupplier {
    UserDAOServiceFileDescriptorSupplier() {}
  }

  private static final class UserDAOServiceMethodDescriptorSupplier
      extends UserDAOServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserDAOServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserDAOServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDAOServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
