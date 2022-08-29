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
 * @author Peter Buckingham
 */
public class Create {

   
    public void createBook(String title, String subTitle, String author, String ISBN, String description, String rate, String imageLink) {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO booktable(title, subTitle, author, ISBN, description, rate, imageLink) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, title);
            statement.setString(2, subTitle);
            statement.setString(3, author);
            statement.setString(4, ISBN);
            statement.setString(5, description);
            statement.setString(6, rate);
            statement.setString(7, imageLink);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new book was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    public void createUser(String firstName, String lastName, String userName, String email, String password, int userAccessLevel) {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO usertable(firstName, lastName, userName, email, password, userAccessLevel) VALUES (?, ?, ?, ?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, userName);
            statement.setString(4, email);
            statement.setString(5, password);
           // System.out.println("This is what was put in the DB : " +password);
            statement.setString(6, Integer.toString(userAccessLevel));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "A new user named " + firstName + " " + lastName + " was inserted successfully!");
                System.out.println("A new user named " + firstName + " " + lastName + " was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void createLoan(User user, Loan loan){
    String userId = user.getUserId();
    loan.getClass();
     DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO bookloanstable(userId, bookId, loanFromDate, dueOnDate, returned) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, loan.getUserId());
            statement.setString(2, String.valueOf(loan.getBookId()));
            statement.setString(3, loan.getLoanFromDate());
            statement.setString(4, loan.getDueOnDate());
            statement.setString(5, Boolean.toString(loan.isReturned()));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "A new user made a loan and  was inserted successfully!");
                System.out.println("A new user named was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

     
    }
}
