package marketplace.dbConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private static String customerDBURL = "jdbc:postgresql://localhost:5432/customer";
    private static String productDBURL = "jdbc:postgresql://localhost:5432/product";
    private static String userName = "postgres";
    private static String password = "tarun1997";
    private static Connection customerDBConnection = null;
    private static Connection productDBConnection =  null;

    private DBConnector() {

    }

    public synchronized static Connection getCustomerConnection() {
        if(customerDBConnection == null){
            try {
                customerDBConnection = DriverManager.getConnection(customerDBURL, userName, password);
            } catch (SQLException e) {
                System.out.println("failed creating customer db connection");
            }
        }
        return customerDBConnection;
    }

    public synchronized static Connection getProductConnection()  {
        if(productDBConnection == null){
            try {
                productDBConnection = DriverManager.getConnection(productDBURL, userName, password);
            } catch (SQLException e) {
                System.out.println("failed creating product db connection");
            }
        }
        return productDBConnection;
    }

}
