/*
 *     
 * 
 */
package za.ac.cput.crud;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Buckingham
 */
public class Read {

    public void readBook() {

    }

    public void readAllBooks() {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM testBookTable";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";

            while (result.next()) {
                String title = result.getString(2);
                String subTitle = result.getString(3);
                String author = result.getString("author");
                String ISBN = result.getString(5);
                String description = result.getString(6);
                String rating = result.getString(7);
                String imageLink = result.getString(8);

                output = output + ++count + " " + title + " " + subTitle + " " + author + " " + ISBN + " " + rating + " \n" + description + "\n" + imageLink;

                // String output = "Book #%d: %s - %s - %s ";
                //  System.out.println(String.format(output, ++count, title, subTitle, author));
            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readAllUsers() {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM userTable";


        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";

            while (result.next()) {
                String firstName = result.getString(2);
                String lastName = result.getString(3);
                String userName = result.getString(4);
                String email = result.getString(5);
                String password = result.getString(6);
                String userAccessLevel = result.getString(7);

                output = output + ++count + " " + firstName + " " + lastName + " " + userName + " " + email + " " + password + " " + userAccessLevel + "\n";

            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
