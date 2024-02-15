package marketplace.dao;



import marketplace.dbConnector.DBConnector;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class OrderDAO {
    public Connection conn;

    public OrderDAO() {
        this.conn = DBConnector.getProductConnection();
    }

    public int createOrder(int buyerId, String status, String transaction_id){

        String insertQuery = "INSERT INTO customer_order (buyer_id, status, transaction_id) VALUES (?, ?,?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery, new String[]{"id"})) {
            preparedStatement.setInt(1, buyerId);
            preparedStatement.setString(2, status);
            preparedStatement.setString(3, transaction_id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt("id");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public int updateOrder(String status, String transaction_id){

        String insertQuery = "UPDATE customer_order SET status = ? WHERE transaction_id = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery, new String[]{"id"})) {
            preparedStatement.setString(1, status);
            preparedStatement.setString(2, transaction_id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt("id");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }


    public int updateOrderItem(int orderId, int quantity, String itemId){
        String insertQuery = "INSERT INTO order_item (order_id, quantity, item_id) VALUES (?, ?,?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery, new String[]{"id"})) {
            preparedStatement.setInt(1, orderId);
            preparedStatement.setInt(2, quantity);
            preparedStatement.setString(3, itemId);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt("id");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

}
