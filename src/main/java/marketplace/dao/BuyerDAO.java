package marketplace.dao;


import marketplace.dbConnector.DBConnector;
import marketplace.pojos.Buyer;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class BuyerDAO {
    private Connection conn;

    public BuyerDAO() {
        this.conn = DBConnector.getCustomerConnection();
    }

    public int createBuyer(Buyer buyer){
        int rows =-1;
        String  query= "insert into buyer (id,name) values (?,?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, buyer.getId());
            preparedStatement.setString(2, buyer.getName());
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
    public Buyer getBuyerInfo(int buyerId){
        Buyer buyerInfo = null;
        String  query= "SELECT * FROM buyer where id="+buyerId;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                buyerInfo = new Buyer(rs.getInt(1), rs.getString(2),rs.getInt(3)) ;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buyerInfo;
    }


    public void updateNumItems(int buyer_id,int count){

        String query = "UPDATE buyer set items_purchased = items_purchased + ? where id = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            try {
                preparedStatement.setInt(1,count);
                preparedStatement.setInt(2,buyer_id);
                int rows =preparedStatement.executeUpdate();
                if(rows>0){
                    System.out.println("Item count Updated successfully");
                }else {
                    System.out.println("Unable to update item count");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
