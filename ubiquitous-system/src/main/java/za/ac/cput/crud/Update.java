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
import utilities.Dates;
import utilities.Loan;

/**
 * @author Peter Buckingham
 */
public class Update {
    private static final Logger LOGGER = Logger.getLogger(Update.class.getName());

    /**
     *
     */
    public void updateBook() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        String bookToUpdate = null;
        while (bookToUpdate == null || bookToUpdate.isEmpty() || bookToUpdate.isEmpty()) {
            bookToUpdate = JOptionPane.showInputDialog(null, "Please enter the title of the book you would like to update: ");
        }
        Connection conn = databaseConnection.getDatabaseConnection();
        String title = bookToUpdate;
        String sql = "UPDATE booktable SET title=?, subTitle=?, author=?, ISBN=?, description=?, rate=?, ImageLink=? WHERE title=?";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            ///get data from form to push to DB
            statement.setString(1, "Harry Potter 2");
            statement.setString(2, "Secret Chamber");
            statement.setString(3, "jk. Roling");
            statement.setString(4, "isbnnnn");
            statement.setString(5, "Harry Potter  returns to school for thew for the first time....");
            statement.setString(6, "4");
            statement.setString(7, "https://covers.openlibrary.org/b/id/10580435-L.jpg");
            statement.setString(8, title);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing book titled : " + title + " was updated successfully!");
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "A book named: " + title + " does not exsist !!", "Ubiquitous System - CRUD - Opertation - Failed  ", JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Warring user attemped updating a Book that does not exsist! ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param bookToUpdate
     * @param book
     */
    public void updateBook(String bookToUpdate, Book book) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        //String bookToUpdate = null;
        while (bookToUpdate == null || bookToUpdate.isEmpty() || bookToUpdate.isEmpty()) {
            bookToUpdate = JOptionPane.showInputDialog(null, "Please enter the title of the book you would like to update: ");

        }

        Connection conn = databaseConnection.getDatabaseConnection();
        String title = bookToUpdate;
        String sql = "UPDATE booktable SET title=?, subTitle=?, author=?, ISBN=?, description=?, rate=?, ImageLink=? WHERE title=?";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            ///get data from form to push to DB
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getSubTitle());
            statement.setString(3, book.getAuthors());
            // statement.setString(4, "XXX XXX XXX XXX");
            statement.setString(4, book.getISBN());
            statement.setString(5, book.getDescription());
            statement.setString(6, book.getRating());
            statement.setString(7, book.getImageLink());
            statement.setString(8, bookToUpdate);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing book titled : " + title + " was updated successfully!");
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "A book named: " + title + " does not exsist !!", "Ubiquitous System - CRUD - Opertation - Failed  ", JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Warring user attemped updating a Book that does not exsist! ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     */
    public void updateUser() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String userNameTmp = null;
        while (userNameTmp == null || userNameTmp.isEmpty() || userNameTmp.isBlank()) {
            userNameTmp = JOptionPane.showInputDialog(null, "Please enter the name of the user you would like to update: ");
        }
        String sqlUserUpdateStament = "UPDATE usertable SET firstName=?, lastName=?, userName=? ,email=? , password=?, userAccessLevel=? WHERE userName=?";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sqlUserUpdateStament);
            statement.setString(1, "Mike");
            statement.setString(2, "Hunts");
            statement.setString(3, "Mikey");
            statement.setString(4, "MikeHunts1999@gmail.com");
            statement.setString(5, "1234");
            statement.setString(6, "0");
            statement.setString(7, userNameTmp);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing user Named: " + userNameTmp + " was updated successfully!");
                LOGGER.info("An existing user Named: " + userNameTmp + " was updated successfully!");
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "A user named: " + userNameTmp + " does not exsist !!", "CRUD - Opertation Failed - Missing Details ", JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Warning user attemped updating a user named: " + userNameTmp + " that does not exsist! ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param userToUpdate
     * @param user
     */
    public void updateUser(String userToUpdate, User user) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String userNameTmp = userToUpdate;
        while (userNameTmp == null || userNameTmp.isEmpty() || userNameTmp.isBlank()) {
            userNameTmp = JOptionPane.showInputDialog(null, "Please enter the name of the user you would like to update: ");
        }
        String sqlUserUpdateStament = "UPDATE usertable SET firstName=?, lastName=?, userName=? ,email=? , password=?, userAccessLevel=? WHERE firstName=?";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sqlUserUpdateStament);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getUserName());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.setString(6, "0");
            statement.setString(7, userNameTmp);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing user Named: " + userNameTmp + " was updated successfully!");
                LOGGER.info("An existing user Named: " + userNameTmp + " was updated successfully!");
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "A user named: " + userNameTmp + " does not exsist !!", "CRUD - Opertation Failed - Missing Details ", JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Warning user attemped updating a user named: " + userNameTmp + " that does not exsist! ");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param loan
     */
    public void updateLoan(Loan loan) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String loanId = loan.getLoanId();
        String date = "0-0-0";
        int loanIdnum = Integer.valueOf(loanId);
        String sql = "UPDATE bookloanstable SET returned=? WHERE id='" + loanId +"'";
        System.out.println("updating loans with the id of : " + loanId);
        Dates dates = new Dates();
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, dates.getFormattedCurrentDate());
            System.out.println("Update sending "+dates.getFormattedCurrentDate() +" the database");
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "An existing loan with the ID of: " + loanId + " was updated successfully!");
                System.out.println("An existing loan with the ID of: " + loanId + " was updated successfully! returned on : " + dates.getFormattedCurrentDate());
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "error occoured loan not found", "Ubiquitous System - CRUD - Opertation - Failed  ", JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Warring user attemped updating a Loan that does not esist! ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
