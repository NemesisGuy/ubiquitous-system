/*
 *
 *
 */
package za.ac.cput.crud;

import utilities.Loan;
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
    //class that creates a new object and saves them to the database

    /**
     *
     * @param title
     * @param subTitle
     * @param author
     * @param ISBN
     * @param description
     * @param rate
     * @param imageLink
     */
    public void createBook(String title, String subTitle, String author, String ISBN, String description, String rate, String imageLink) {
        //createBook method with parameters : title, subTitle, author, ISBN, description, rate, imageLink
        //createBook method with signature : public void createBook(String title, String subTitle, String author, String ISBN, String description, String rate, String imageLink);
        //method that creates a new book object and saves it to the database
        DatabaseConnection databaseConnection = new DatabaseConnection();   //create a new database connection object
        Connection conn = databaseConnection.getDatabaseConnection();       //create a new connection object and assign it the value of the database connection object
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

    /**
     *
     * @param firstName
     * @param lastName
     * @param userName
     * @param email
     * @param password
     * @param userAccessLevel
     * @apiNote This method creates a new user object and saves it to the database, it is used by the admin user, and is not available to the general public,
     *
     */
    public void createUser(String firstName, String lastName, String userName, String email, String password, int userAccessLevel) {
        //createUser method with parameters : firstName, lastName, userName, email, password, userAccessLevel
        //createUser method with signature : public void createUser(String firstName, String lastName, String userName, String email, String password, int userAccessLevel);
        //method that creates a new user object and saves it to the database
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

    /**
     *
     * @param user user object
     * @param loan loan object
     * @apiNote this method creates a new loan object and saves it to the database using the user object and the loan object, the user object is used to get the user id and the loan object is used to get the book id the user id and the book id are then used to create a new loan object and save it to the database the loan object is then returned
     *
     */
    public void createLoan(User user, Loan loan) {
        //createLoan method with parameters : user, loan
        //createLoan method with signature : public void createLoan(User user, Loan loan);
        //method that creates a new loan object and saves it to the database
        String userId = user.getUserId();
        loan.getClass();
        if (loan.getReturnedDate() == null) {
            loan.setReturnedDate("0-0-0");
        }
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
            statement.setString(5, loan.getReturnedDate());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "A new user made a loan and  was inserted successfully!");
                System.out.println("A new loan was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
