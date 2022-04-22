/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
            // JOptionPane jOptionPane = new  JOptionPane();
            while (result.next()) {
                String title = result.getString(2);
                String subTitle = result.getString(3);
                String author = result.getString("author");

                output = output + ++count + " " + title + " " + subTitle + " " + author + "\n";

                // String output = "Book #%d: %s - %s - %s ";
                //  System.out.println(String.format(output, ++count, title, subTitle, author));
            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
