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
    comments = "Source: item.proto")
public final class ItemServiceGrpc {

  private ItemServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.ItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.Item,
      grpc.ItemOuterClass.AddItemResponse> getAddItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddItem",
      requestType = grpc.ItemOuterClass.Item.class,
      responseType = grpc.ItemOuterClass.AddItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.Item,
      grpc.ItemOuterClass.AddItemResponse> getAddItemMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.Item, grpc.ItemOuterClass.AddItemResponse> getAddItemMethod;
    if ((getAddItemMethod = ItemServiceGrpc.getAddItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getAddItemMethod = ItemServiceGrpc.getAddItemMethod) == null) {
          ItemServiceGrpc.getAddItemMethod = getAddItemMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.Item, grpc.ItemOuterClass.AddItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "AddItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.Item.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.AddItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("AddItem"))
                  .build();
          }
        }
     }
     return getAddItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemPriceRequest,
      grpc.ItemOuterClass.UpdateItemPriceResponse> getUpdateItemPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemPrice",
      requestType = grpc.ItemOuterClass.UpdateItemPriceRequest.class,
      responseType = grpc.ItemOuterClass.UpdateItemPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemPriceRequest,
      grpc.ItemOuterClass.UpdateItemPriceResponse> getUpdateItemPriceMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemPriceRequest, grpc.ItemOuterClass.UpdateItemPriceResponse> getUpdateItemPriceMethod;
    if ((getUpdateItemPriceMethod = ItemServiceGrpc.getUpdateItemPriceMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemPriceMethod = ItemServiceGrpc.getUpdateItemPriceMethod) == null) {
          ItemServiceGrpc.getUpdateItemPriceMethod = getUpdateItemPriceMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.UpdateItemPriceRequest, grpc.ItemOuterClass.UpdateItemPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "UpdateItemPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.UpdateItemPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.UpdateItemPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("UpdateItemPrice"))
                  .build();
          }
        }
     }
     return getUpdateItemPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemRequest,
      grpc.ItemOuterClass.Item> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = grpc.ItemOuterClass.GetItemRequest.class,
      responseType = grpc.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemRequest,
      grpc.ItemOuterClass.Item> getGetItemMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemRequest, grpc.ItemOuterClass.Item> getGetItemMethod;
    if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
          ItemServiceGrpc.getGetItemMethod = getGetItemMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.GetItemRequest, grpc.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.GetItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.Item.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetItem"))
                  .build();
          }
        }
     }
     return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsBySellerIdRequest,
      grpc.ItemOuterClass.Item> getGetItemsBySellerIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemsBySellerId",
      requestType = grpc.ItemOuterClass.GetItemsBySellerIdRequest.class,
      responseType = grpc.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsBySellerIdRequest,
      grpc.ItemOuterClass.Item> getGetItemsBySellerIdMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsBySellerIdRequest, grpc.ItemOuterClass.Item> getGetItemsBySellerIdMethod;
    if ((getGetItemsBySellerIdMethod = ItemServiceGrpc.getGetItemsBySellerIdMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemsBySellerIdMethod = ItemServiceGrpc.getGetItemsBySellerIdMethod) == null) {
          ItemServiceGrpc.getGetItemsBySellerIdMethod = getGetItemsBySellerIdMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.GetItemsBySellerIdRequest, grpc.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "GetItemsBySellerId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.GetItemsBySellerIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.Item.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetItemsBySellerId"))
                  .build();
          }
        }
     }
     return getGetItemsBySellerIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemQuantityRequest,
      grpc.ItemOuterClass.UpdateItemQuantityResponse> getUpdateItemQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateItemQuantity",
      requestType = grpc.ItemOuterClass.UpdateItemQuantityRequest.class,
      responseType = grpc.ItemOuterClass.UpdateItemQuantityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemQuantityRequest,
      grpc.ItemOuterClass.UpdateItemQuantityResponse> getUpdateItemQuantityMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.UpdateItemQuantityRequest, grpc.ItemOuterClass.UpdateItemQuantityResponse> getUpdateItemQuantityMethod;
    if ((getUpdateItemQuantityMethod = ItemServiceGrpc.getUpdateItemQuantityMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemQuantityMethod = ItemServiceGrpc.getUpdateItemQuantityMethod) == null) {
          ItemServiceGrpc.getUpdateItemQuantityMethod = getUpdateItemQuantityMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.UpdateItemQuantityRequest, grpc.ItemOuterClass.UpdateItemQuantityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "UpdateItemQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.UpdateItemQuantityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.UpdateItemQuantityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("UpdateItemQuantity"))
                  .build();
          }
        }
     }
     return getUpdateItemQuantityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest,
      grpc.ItemOuterClass.Item> getGetItemsByCategoryAndKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemsByCategoryAndKeywords",
      requestType = grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest.class,
      responseType = grpc.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest,
      grpc.ItemOuterClass.Item> getGetItemsByCategoryAndKeywordsMethod() {
    io.grpc.MethodDescriptor<grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest, grpc.ItemOuterClass.Item> getGetItemsByCategoryAndKeywordsMethod;
    if ((getGetItemsByCategoryAndKeywordsMethod = ItemServiceGrpc.getGetItemsByCategoryAndKeywordsMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemsByCategoryAndKeywordsMethod = ItemServiceGrpc.getGetItemsByCategoryAndKeywordsMethod) == null) {
          ItemServiceGrpc.getGetItemsByCategoryAndKeywordsMethod = getGetItemsByCategoryAndKeywordsMethod = 
              io.grpc.MethodDescriptor.<grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest, grpc.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.ItemService", "GetItemsByCategoryAndKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ItemOuterClass.Item.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("GetItemsByCategoryAndKeywords"))
                  .build();
          }
        }
     }
     return getGetItemsByCategoryAndKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemServiceStub newStub(io.grpc.Channel channel) {
    return new ItemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addItem(grpc.ItemOuterClass.Item request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.AddItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddItemMethod(), responseObserver);
    }

    /**
     */
    public void updateItemPrice(grpc.ItemOuterClass.UpdateItemPriceRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemPriceMethod(), responseObserver);
    }

    /**
     */
    public void getItem(grpc.ItemOuterClass.GetItemRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getItemsBySellerId(grpc.ItemOuterClass.GetItemsBySellerIdRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemsBySellerIdMethod(), responseObserver);
    }

    /**
     */
    public void updateItemQuantity(grpc.ItemOuterClass.UpdateItemQuantityRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemQuantityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateItemQuantityMethod(), responseObserver);
    }

    /**
     */
    public void getItemsByCategoryAndKeywords(grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemsByCategoryAndKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ItemOuterClass.Item,
                grpc.ItemOuterClass.AddItemResponse>(
                  this, METHODID_ADD_ITEM)))
          .addMethod(
            getUpdateItemPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ItemOuterClass.UpdateItemPriceRequest,
                grpc.ItemOuterClass.UpdateItemPriceResponse>(
                  this, METHODID_UPDATE_ITEM_PRICE)))
          .addMethod(
            getGetItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ItemOuterClass.GetItemRequest,
                grpc.ItemOuterClass.Item>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetItemsBySellerIdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ItemOuterClass.GetItemsBySellerIdRequest,
                grpc.ItemOuterClass.Item>(
                  this, METHODID_GET_ITEMS_BY_SELLER_ID)))
          .addMethod(
            getUpdateItemQuantityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ItemOuterClass.UpdateItemQuantityRequest,
                grpc.ItemOuterClass.UpdateItemQuantityResponse>(
                  this, METHODID_UPDATE_ITEM_QUANTITY)))
          .addMethod(
            getGetItemsByCategoryAndKeywordsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest,
                grpc.ItemOuterClass.Item>(
                  this, METHODID_GET_ITEMS_BY_CATEGORY_AND_KEYWORDS)))
          .build();
    }
  }

  /**
   */
  public static final class ItemServiceStub extends io.grpc.stub.AbstractStub<ItemServiceStub> {
    private ItemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceStub(channel, callOptions);
    }

    /**
     */
    public void addItem(grpc.ItemOuterClass.Item request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.AddItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemPrice(grpc.ItemOuterClass.UpdateItemPriceRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItem(grpc.ItemOuterClass.GetItemRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemsBySellerId(grpc.ItemOuterClass.GetItemsBySellerIdRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetItemsBySellerIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemQuantity(grpc.ItemOuterClass.UpdateItemQuantityRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemQuantityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateItemQuantityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemsByCategoryAndKeywords(grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest request,
        io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetItemsByCategoryAndKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemServiceBlockingStub> {
    private ItemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.ItemOuterClass.AddItemResponse addItem(grpc.ItemOuterClass.Item request) {
      return blockingUnaryCall(
          getChannel(), getAddItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ItemOuterClass.UpdateItemPriceResponse updateItemPrice(grpc.ItemOuterClass.UpdateItemPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ItemOuterClass.Item getItem(grpc.ItemOuterClass.GetItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.ItemOuterClass.Item> getItemsBySellerId(
        grpc.ItemOuterClass.GetItemsBySellerIdRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetItemsBySellerIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ItemOuterClass.UpdateItemQuantityResponse updateItemQuantity(grpc.ItemOuterClass.UpdateItemQuantityRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateItemQuantityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.ItemOuterClass.Item> getItemsByCategoryAndKeywords(
        grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetItemsByCategoryAndKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemServiceFutureStub extends io.grpc.stub.AbstractStub<ItemServiceFutureStub> {
    private ItemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ItemOuterClass.AddItemResponse> addItem(
        grpc.ItemOuterClass.Item request) {
      return futureUnaryCall(
          getChannel().newCall(getAddItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ItemOuterClass.UpdateItemPriceResponse> updateItemPrice(
        grpc.ItemOuterClass.UpdateItemPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ItemOuterClass.Item> getItem(
        grpc.ItemOuterClass.GetItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ItemOuterClass.UpdateItemQuantityResponse> updateItemQuantity(
        grpc.ItemOuterClass.UpdateItemQuantityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateItemQuantityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ITEM = 0;
  private static final int METHODID_UPDATE_ITEM_PRICE = 1;
  private static final int METHODID_GET_ITEM = 2;
  private static final int METHODID_GET_ITEMS_BY_SELLER_ID = 3;
  private static final int METHODID_UPDATE_ITEM_QUANTITY = 4;
  private static final int METHODID_GET_ITEMS_BY_CATEGORY_AND_KEYWORDS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ITEM:
          serviceImpl.addItem((grpc.ItemOuterClass.Item) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.AddItemResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_PRICE:
          serviceImpl.updateItemPrice((grpc.ItemOuterClass.UpdateItemPriceRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemPriceResponse>) responseObserver);
          break;
        case METHODID_GET_ITEM:
          serviceImpl.getItem((grpc.ItemOuterClass.GetItemRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item>) responseObserver);
          break;
        case METHODID_GET_ITEMS_BY_SELLER_ID:
          serviceImpl.getItemsBySellerId((grpc.ItemOuterClass.GetItemsBySellerIdRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_QUANTITY:
          serviceImpl.updateItemQuantity((grpc.ItemOuterClass.UpdateItemQuantityRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.UpdateItemQuantityResponse>) responseObserver);
          break;
        case METHODID_GET_ITEMS_BY_CATEGORY_AND_KEYWORDS:
          serviceImpl.getItemsByCategoryAndKeywords((grpc.ItemOuterClass.GetItemsByCategoryAndKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ItemOuterClass.Item>) responseObserver);
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

  private static abstract class ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ItemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemService");
    }
  }

  private static final class ItemServiceFileDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier {
    ItemServiceFileDescriptorSupplier() {}
  }

  private static final class ItemServiceMethodDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemServiceFileDescriptorSupplier())
              .addMethod(getAddItemMethod())
              .addMethod(getUpdateItemPriceMethod())
              .addMethod(getGetItemMethod())
              .addMethod(getGetItemsBySellerIdMethod())
              .addMethod(getUpdateItemQuantityMethod())
              .addMethod(getGetItemsByCategoryAndKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
