package marketplace.dao;



import marketplace.dbConnector.DBConnector;
import org.springframework.stereotype.Component;

import java.sql.Connection;
@Component
public class OrderDAO {
    public Connection conn;

    public OrderDAO() {
        this.conn = DBConnector.getProductConnection();
    }


}
