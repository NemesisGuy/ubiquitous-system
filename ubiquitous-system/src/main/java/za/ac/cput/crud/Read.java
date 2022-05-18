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
import za.ac.cput.googlebooksapi.Book;

/**
 * @author Peter Buckingham
 */
public class Read {

    DisplayBookForm displayBookForm;
    String title, subTitle, author, ISBN, description, rating, imageLink;

    public void readBookByTitle() {
        String inputTitle = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        while (inputTitle == null || inputTitle.isEmpty() || inputTitle.isBlank()) {
            inputTitle = JOptionPane.showInputDialog(null, "Please enter the name of the book you would like to find:");
        }
        String sql = "SELECT * FROM booktable WHERE title='" + inputTitle + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";
            if (!result.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Error : The book titled " + inputTitle + " was not found!");
                System.out.println("No data");
            } else {
                while (result.next()) {
                    title = result.getString(2);
                    subTitle = result.getString(3);
                    author = result.getString("author");
                    ISBN = result.getString(5);
                    description = result.getString(6);
                    rating = result.getString(7);
                    imageLink = result.getString(8);

                    output = output + ++count + " " + title + " " + subTitle + " " + author + " " + ISBN + " " + rating + " \n" + description + "\n" + imageLink;

                    // String output = "Book #%d: %s - %s - %s ";
                    //  System.out.println(String.format(output, ++count, title, subTitle, author));
                    
                    break;
                }
                conn.close();
                JOptionPane.showMessageDialog(null, "Success - Book titled " + inputTitle + " found: \n" + output);
               // displayBookForm = new DisplayBookForm(title, subTitle, author, description, rating, imageLink);
                Book book = new Book(0, title, subTitle, ISBN, author, description, rating, imageLink);
                displayBookForm = new DisplayBookForm(book);
               // displayBookForm.setVisible(true);
                System.out.println(title +" " + subTitle);
               // displayBookForm.setAlwaysOnTop(true);
                

            }                                              //  new DisplayBookForm(title,  subtTitle, author, description ,  rating,  imageLink);
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readAllBooks() {
        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM booktable";
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

    public void readUserByName() {
        String name = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        while (name == null || name.isEmpty() || name.isBlank()) {
            name = JOptionPane.showInputDialog(null, "Please enter the name of the user you would like to find:");
        }
        String sql = "SELECT * FROM usertable WHERE firstName='" + name + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";
            if (!result.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Error : The user named " + name + " was not found!");
                System.out.println("No data");
            } else {

                while (result.next()) {
                    String firstName = result.getString(2);
                    String lastName = result.getString(3);
                    String userName = result.getString(4);
                    String email = result.getString(5);
                    String password = result.getString(6);
                    String userAccessLevel = result.getString(7);

                    output = output + ++count + " " + firstName + " " + lastName + " " + userName + " " + email + " " + password + " " + userAccessLevel + "\n";
                    break;
                    // String output = "Book #%d: %s - %s - %s ";
                    //  System.out.println(String.format(output, ++count, title, subTitle, author));
                }
                conn.close();
                JOptionPane.showMessageDialog(null, "Success - User " + name + " found: \n" + output);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
