/*
 *
 *
 */
package za.ac.cput.crud;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Peter Buckingham
 */
public class Delete {
    String title;
    String userName;

    public void deleteBook() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        title = JOptionPane.showInputDialog(null, "Please enter the name of the book you would like to delete:");
        // title ="Harry Potter 2";
        String sql = "DELETE FROM testBookTable WHERE title=?";
        PreparedStatement statement = null;
        try {

            statement = conn.prepareStatement(sql);

            statement.setString(1, title);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A book titled:\n" + title + "\n was deleted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUser() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        userName = JOptionPane.showInputDialog(null, "Please enter the name of the user you would like to delete:");

        String sql = "DELETE FROM userTable WHERE userName=?";
        PreparedStatement statement = null;
        try {

            statement = conn.prepareStatement(sql);

            statement.setString(1, userName);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A user named:\n" + userName + "\n was deleted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
