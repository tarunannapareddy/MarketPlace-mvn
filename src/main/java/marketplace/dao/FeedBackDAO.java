package marketplace.dao;



import marketplace.dbConnector.DBConnector;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class FeedBackDAO {
    private Connection conn;

    public FeedBackDAO() {
        this.conn = DBConnector.getProductConnection();
    }

    public boolean saveFeedback(String itemId, int buyerId, boolean feedback) {
        String query = "INSERT INTO feedback (item_id, buyer_id, feedback) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, itemId);
            preparedStatement.setInt(2, buyerId);
            preparedStatement.setBoolean(3, feedback);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0; // Return true if at least one row is affected (feedback saved successfully)
        } catch (SQLException e) {
            System.out.println("exception while submitting feedback "+e);
        }
        return false; // Return false in case of an error
    }

    public boolean doesFeedbackExist(int buyerId, String itemId) {
        String query = "SELECT 1 FROM feedback WHERE buyer_id = ? AND item_id = ? LIMIT 1";

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, buyerId);
            preparedStatement.setString(2, itemId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // Return true if at least one row is found
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Return false in case of an error
    }
}
