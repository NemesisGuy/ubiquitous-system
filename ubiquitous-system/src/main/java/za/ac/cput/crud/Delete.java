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
public class Delete {
    public void deleteBook()
    {
        
        DatabaseConnection databaseConnection = new  DatabaseConnection();
       
        Connection conn  = databaseConnection.getDatabaseConnection();
      
      
        String sql = "DELETE FROM testBookTable WHERE title=?";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
        
        statement.setString(1, "Harry Potter 2");

        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A new book was deleted successfully!");
            conn.close();
        }
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
