package marketplace.dao;



import marketplace.dbConnector.DBConnector;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class CartDAO {
    private Connection conn;

    public CartDAO() {
        this.conn = DBConnector.getProductConnection();
    }

    public int getCart(int buyerId){
        String query = "SELECT * FROM cart WHERE buyer_id = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, buyerId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id");
                } else{
                    return createCart(buyerId);
                }
            }
        } catch (SQLException e){
            System.out.println("error while updating item"+e);
        }
        return -1;
    }

    private int createCart(int buyerId){
        String query = "INSERT INTO CART (buyer_id) VALUES (?)";
        int id = -1;
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)){
            preparedStatement.setInt(1, buyerId);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getInt("id"); // Return the generated ID
                }
            }
        } catch (SQLException e) {
            System.out.println("exception while creating cart "+id);
        }
        return id;
    }

    public boolean updateCartQuantity(int cartId, String itemID, int quantityChange) {
        try {
            // Update the item table
            String updateQuery = "UPDATE cart_item SET quantity = quantity + ? WHERE cart_id = ? and item_id = ?";
            String insertQuery = "INSERT INTO cart_item (cart_id, item_id, quantity) VALUES (?, ?, ?)";
            try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
                    PreparedStatement insertStatement = conn.prepareStatement(insertQuery)) {

                // Set parameters for update query
                updateStatement.setInt(1, quantityChange);
                updateStatement.setInt(2, cartId);
                updateStatement.setString(3, itemID);

                // Execute the update query
                int updatedRows = updateStatement.executeUpdate();
                if(updatedRows >0){
                    return true;
                } else if(quantityChange>0){
                        // If no rows were updated, insert a new row
                        insertStatement.setInt(1, cartId);
                        insertStatement.setString(2, itemID);
                        insertStatement.setInt(3, quantityChange);

                        int insertedRows = insertStatement.executeUpdate();
                        return insertedRows > 0;
                    }
            }
        } catch (SQLException e) {
            System.out.println("exception while updating cart "+e);
        }
        return false;
    }

    public boolean deleteCart(int cartId) {
        try {
            // Update the item table
            String updateQuery = "DELETE from cart_item WHERE cart_id = ?";

            try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery)) {

                // Set parameters for update query
                updateStatement.setInt(1, cartId);

                // Execute the update query
                int updatedRows = updateStatement.executeUpdate();
                return updatedRows>0;
            }
        } catch (SQLException e) {
            System.out.println("exception while updating cart "+e);
        }
        return false;
    }



}
