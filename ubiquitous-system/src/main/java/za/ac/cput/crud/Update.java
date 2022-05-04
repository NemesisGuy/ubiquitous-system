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
public class Update {
    public void updateBook() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "UPDATE testBookTable SET title=?, subTitle=?, author=? WHERE title=?";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);


            statement.setString(1, "Harry Potter 2");
            statement.setString(2, "Secret Chamber");
            statement.setString(3, "jk. Roling");
            statement.setString(4, "isbnnnn");
            statement.setString(5, "Harry Potter  returns to school for thew for the first time....");
            statement.setString(6, "4");
            statement.setString(7, "google.com");


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

    public void updateUser() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sqlUserUpdateStament = "UPDATE userTable SET firstName=?, lastName=?, userName=? ,email=? , password=?, userAccessLevel=? WHERE userName=?";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sqlUserUpdateStament);


            statement.setString(1, "Mike");
            statement.setString(2, "Hunts");
            statement.setString(3, "Mikey");
            statement.setString(4, "MikeHunts1999@gmail.com");
            statement.setString(5, "1234");
            statement.setString(6, "0");

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing user was updated successfully!");

                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
