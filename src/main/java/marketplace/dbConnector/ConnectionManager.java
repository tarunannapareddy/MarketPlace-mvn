package marketplace.dbConnector;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
    public static int getTransactionLevel(Connection connection) throws SQLException {
        return connection.getTransactionIsolation();
    }

    public static void setAutoCommit(Connection connection, boolean flag) throws SQLException {
        connection.setAutoCommit(flag);
    }

    public static void commit(Connection connection) throws SQLException {
        connection.commit();
    }
    public static void setTransactionLevel(Connection connection, int val) throws SQLException {
        connection.setTransactionIsolation(val);
    }
}
