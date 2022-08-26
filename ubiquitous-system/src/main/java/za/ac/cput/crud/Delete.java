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
        while (title == null || title.isEmpty() || title.isEmpty()) {
            title = JOptionPane.showInputDialog(null, "Please enter the name of the book you would like to find:");
        }
        // title ="Harry Potter 2";
        String sql = "DELETE FROM booktable WHERE title=?";
        PreparedStatement statement = null;
        try {

            statement = conn.prepareStatement(sql);

            statement.setString(1, title);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A book titled:\n" + title + "\n was deleted successfully!");
                JOptionPane.showMessageDialog(null, "A book titled:\n" + title + "\n was deleted successfully!", "CRUD - Opertation - Success ", JOptionPane.INFORMATION_MESSAGE);
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "A book titled:\n" + title + "\n was not found and was not deleted!", "CRUD - Opertation - Failed  ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteUser() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        while (userName == null || userName.isEmpty() || userName.isBlank()) {
            userName = JOptionPane.showInputDialog(null, "Please enter the name of the user you would like to delete:");
        }

        String sql = "DELETE FROM usertable WHERE userName=?";
        PreparedStatement statement = null;
        try {

            statement = conn.prepareStatement(sql);
            statement.setString(1, userName);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                int result = JOptionPane.showConfirmDialog(null, "Sure? You want to delete the user : " + userName + " ?", "Swing Tester",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("A user named:\n" + userName + "\n was deleted successfully!");
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "A user named:\n" + userName + "\n was deleted successfully!", "CRUD - Opertation - Successfull  ", JOptionPane.INFORMATION_MESSAGE);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "A user named:\n" + userName + "\n was not deleted successfully!", "CRUD - Opertation - Faild  ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "A user named:\n" + userName + "\n was not deleted successfully!\n A valid option vas not selected, procees aborted!", "CRUD - Opertation - Faild  ", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a user name.  \n \n A user named: " + userName + " does not exsist !!", "CRUD - Opertation Failed - Missing Details ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
