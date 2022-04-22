/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Buckingham
 */
public class Create {
    public void createBook()
    {
        
        DatabaseConnection databaseConnection = new  DatabaseConnection();
       
        Connection conn  = databaseConnection.getDatabaseConnection();
      
        String sql = "INSERT INTO testBookTable(title, subTitle, author) VALUES (?, ?, ?)";
        
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
        
        statement.setString(1, "Harry Potter 3");
        statement.setString(2, "In Prison");
        statement.setString(3, "jk. Roling");
      

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new book was inserted successfully!");
            conn.close();
        }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
