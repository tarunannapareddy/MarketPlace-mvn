package marketplace.dao;


import marketplace.dbConnector.DBConnector;
import marketplace.pojos.Item;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemDAO {
    public Connection conn;

    public ItemDAO() {
        this.conn = DBConnector.getProductConnection();
    }

    public String addItem(Item item) {
        try {
            // Insert into the item table
            String insertQuery = "INSERT INTO item (item_id, category, seller_id, name, quantity, sale_price, keywords, condition) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(insertQuery, new String[]{"id"})) {
                preparedStatement.setString(1, item.getItemId());
                preparedStatement.setInt(2, item.getCategory());
                preparedStatement.setInt(3, item.getSellerId());
                preparedStatement.setString(4, item.getName());
                preparedStatement.setInt(5, item.getQuantity());
                preparedStatement.setDouble(6, item.getSalePrice());
                preparedStatement.setArray(7, conn.createArrayOf("VARCHAR", item.getKeyWords()));
                preparedStatement.setString(8, item.getCondition());

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        return item.getItemId(); // Return the generated ID
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("error while updating item"+e);
        }
        return "";
    }

    public boolean updateItemPrice(String itemID, double newSalePrice) {
        try {
            // Update the item table
            String updateQuery = "UPDATE item SET sale_price = ? WHERE item_id = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(updateQuery)) {
                preparedStatement.setDouble(1, newSalePrice);
                preparedStatement.setString(2, itemID);

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            System.out.println("error while updating item"+e);
        }
        return false; // Return false in case of an error
    }

    public Item getItem(String itemID) {
        // Retrieve the current quantity of the item
        String query = "SELECT * FROM item WHERE item_id = ? FOR UPDATE";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, itemID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    int category = resultSet.getInt("category");
                    int sellerID = resultSet.getInt("seller_id");
                    String name = resultSet.getString("name");
                    String condition = resultSet.getString("condition");
                    int quantity = resultSet.getInt("quantity");
                    double salePrice = resultSet.getDouble("sale_price");
                    String[] keywords = (String[]) resultSet.getArray("keywords").getArray();
                    return new Item(id, itemID, name, category, condition, quantity, salePrice,sellerID, keywords);
                }
            }
        } catch (SQLException e){
            System.out.println("error while updating item"+e);
        }
        return null;
    }

    public List<Item> getItemsBySellerId(int seller_id) {
        // Retrieve the current quantity of the item
        List<Item> items = new ArrayList<>();
        String query = "SELECT * FROM item WHERE seller_id = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, seller_id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String itemID = resultSet.getString("item_id");
                    int category = resultSet.getInt("category");
                    int sellerID = resultSet.getInt("seller_id");
                    String name = resultSet.getString("name");
                    String condition = resultSet.getString("condition");
                    int quantity = resultSet.getInt("quantity");
                    double salePrice = resultSet.getDouble("sale_price");
                    String[] keywords = (String[]) resultSet.getArray("keywords").getArray();
                    items.add(new Item(id, itemID, name, category, condition, quantity, salePrice,sellerID, keywords));
                }
            }
        } catch(SQLException e){
            return items;
        }
        return items;
    }

    public boolean updateItemQuantity(String itemID, int quantityToReduce) {
        try {
            // Update the item table
            String updateQuery = "UPDATE item SET quantity = quantity - ? WHERE item_id = ?";
            String deleteQuery = "DELETE FROM item WHERE item_id = ?";

            try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
                 PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery)) {

                // Set parameters for update query
                updateStatement.setInt(1, quantityToReduce);
                updateStatement.setString(2, itemID);

                // Execute the update query
                int updatedRows = updateStatement.executeUpdate();

                if (updatedRows > 0) {
                    Item item = getItem(itemID);
                    if (item !=null &&  item.getId() == 0) {
                        deleteStatement.setString(1, itemID);
                        deleteStatement.executeUpdate();
                    }
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Item> getItemsByCategoryAndKeywords(int categoryId, String[] keywordsList) {
        List<Item> itemList = new ArrayList<>();
        String query = "SELECT * FROM item WHERE category = ? AND ARRAY[?]::VARCHAR[] && keywords";

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, categoryId);
            preparedStatement.setArray(2, conn.createArrayOf("VARCHAR", keywordsList));

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String itemID = resultSet.getString("item_id");
                    int category = resultSet.getInt("category");
                    int sellerID = resultSet.getInt("seller_id");
                    String name = resultSet.getString("name");
                    String condition = resultSet.getString("condition");
                    int quantity = resultSet.getInt("quantity");
                    double salePrice = resultSet.getDouble("sale_price");
                    String[] keywords = (String[]) resultSet.getArray("keywords").getArray();
                    itemList.add(new Item(id, itemID, name, category, condition, quantity, salePrice,sellerID, keywords));
                }
            }
        } catch (SQLException e) {
            System.out.println("error searching items "+e);
        }

        return itemList;
    }

}
