package marketplace.dao;



import marketplace.dbConnector.DBConnector;
import marketplace.pojos.Seller;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Component
public class SellerDAO {

    public Connection conn;

    public SellerDAO() {
        this.conn = DBConnector.getCustomerConnection();
    }

    public int createSeller(Seller seller){
        int rows =-1;
        String  query= "insert into seller (id,name) values (?,?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, seller.getId());
            preparedStatement.setString(2,seller.getName());
            try {
                 rows =preparedStatement.executeUpdate();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rows;
    }

    public Seller getSellerInfo(Integer seller_id){

        String  query= "SELECT * from seller where id="+seller_id;

        Seller seller=null;
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            try {
                ResultSet rs =preparedStatement.executeQuery();
                while (rs.next()) {
                    seller=new Seller(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getInt(5));
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return seller;
    }

    public boolean updateReviewCounts(Integer seller_id,boolean review){
        String query = null;
        if (review){
            query = "UPDATE seller set  pos_rev_count = pos_rev_count+1 where id = "+seller_id;
        }else {
            query = "UPDATE seller set neg_rev_count = neg_rev_count+1 where id = "+seller_id;
        }

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            try {
                int rows =preparedStatement.executeUpdate();
                if(rows>0){
                    System.out.println("Review count Updated successfully");
                }else {
                    System.out.println("Unable to update review count");
                }
                return true;
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void updateItemsSold(Integer seller_id,Integer itemssold){

        String query = "UPDATE seller set items_sold = items_sold+? where id = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            try {
                preparedStatement.setInt(1,itemssold);
                preparedStatement.setInt(2,seller_id);
                int rows =preparedStatement.executeUpdate();
                if(rows>0){
                    System.out.println("Item count Updated successfully");
                }else {
                    System.out.println("Unable to update Item count");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
