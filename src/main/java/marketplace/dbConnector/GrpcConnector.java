package marketplace.dbConnector;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcConnector {
    private static ManagedChannel managedChannel = null;

    private GrpcConnector() {
    }

    public synchronized static ManagedChannel getCustomerConnection() {
        if(managedChannel == null){
            managedChannel =  ManagedChannelBuilder.forAddress("localhost", 4000).usePlaintext().build();
        }
        return managedChannel;
    }

}
