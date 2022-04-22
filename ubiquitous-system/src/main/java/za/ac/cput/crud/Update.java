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
import javax.swing.JOptionPane;

/**
 *
 * @author Peter Buckingham
 */
public class Update {
    public void updateBook()
    {
        
        DatabaseConnection databaseConnection = new  DatabaseConnection();
       
        Connection conn  = databaseConnection.getDatabaseConnection();
      
        String sql = "UPDATE testBookTable SET title=?, subTitle=?, author=? WHERE title=?";
        
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
        
        statement.setString(1, "Harry Potter 2");
        statement.setString(2, "Secret Chamber");
        statement.setString(3, "jk. Roling");
        statement.setString(4, "Harry Potter 2");
      

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
             JOptionPane.showMessageDialog(null, "An existing book was updated successfully!");
           // System.out.println("An existing book was updated successfully!");
              conn.close();
        }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
