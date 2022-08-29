/*
 *
 *
 */
package za.ac.cput.crud;

import com.google.api.client.testing.json.AbstractJsonParserTest;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Peter Buckingham
 */
public class Read {

    DisplayBookForm displayBookForm;
    String title, subTitle, author, ISBN, description, rating, imageLink;

    public Book readBookByTitle() {
        String inputTitle = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        while (inputTitle == null || inputTitle.isEmpty() || inputTitle.isEmpty()) {
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

                    break;
                }
                conn.close();
                JOptionPane.showMessageDialog(null, "Success - Book titled " + inputTitle + " found: \n" + output);

                Book book = new Book(0, title, subTitle, ISBN, author, description, rating, imageLink);
                //displayBookForm = new DisplayBookForm(book);
                System.out.println(book.getISBN() + "from read class");

                System.out.println(title + " " + subTitle);
                return book;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Book loanBookByTitle() {
        String inputTitle = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        while (inputTitle == null || inputTitle.isEmpty() || inputTitle.isEmpty()) {
            inputTitle = JOptionPane.showInputDialog(null, "Please enter the title of the book you would like to loan:");
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

                    break;
                }
                conn.close();
                JOptionPane.showMessageDialog(null, "Success - Book titled " + inputTitle + " found: \n" + output);

                Book book = new Book(0, title, subTitle, ISBN, author, description, rating, imageLink);
                //displayBookForm = new DisplayBookForm(book);
                System.out.println(book.getISBN() + "from read class");

                System.out.println(title + " " + subTitle);
                return book;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Book> readAllBooks() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
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
                 String id = result.getString(1);
                String title = result.getString(2);
                String subTitle = result.getString(3);
                String author = result.getString("author");
                String ISBN = result.getString(5);
                String description = result.getString(6);
                String rating = result.getString(7);
                String imageLink = result.getString(8);

                output = output + ++count + " " + title + " " + subTitle + " " + author + " " + ISBN + " " + rating + " \n" + description + "\n" + imageLink;
                bookList.add(new Book(Integer.valueOf(id),title, subTitle, ISBN, author, description, rating, imageLink));
            }
            conn.close();
            //  JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }

    public ArrayList<User> readAllUsers() {
        ArrayList<User> userList = new ArrayList<User>();
        User user = new User();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM usertable";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";

            while (result.next()) {
                String userId = result.getString(1);
                String firstName = result.getString(2);
                String lastName = result.getString(3);
                String userName = result.getString(4);
                String email = result.getString(5);
                String password = result.getString(6);
                String userAccessLevel = result.getString(7);

                output = output + ++count + " " + firstName + " " + lastName + " " + userName + " " + email + " " + password + " " + userAccessLevel + "\n";
                userList.add(new User(userId, firstName, lastName, userName, email, password, userAccessLevel));

            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;

    }

    public User readUserByName() {
        User user = new User();

        String name = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        while (name == null || name.isEmpty() || name.isEmpty()) {
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
                    String userId = result.getString(1);
                    String firstName = result.getString(2);
                    String lastName = result.getString(3);
                    String userName = result.getString(4);
                    String email = result.getString(5);
                    String password = result.getString(6);
                    String userAccessLevel = result.getString(7);

                    output = output + ++count + " " + firstName + " " + lastName + " " + userName + " " + email + " " + password + " " + userAccessLevel + "\n";
                    user = new User(userId, firstName, lastName, userName, email, password, userAccessLevel);
//                    user.setFirstName(firstName);
//                    user.setLastName(lastName);
//                    user.setUserName(userName);
//                    user.setEmail(email);
//                    user.setPassword(password);
                    break;
                }
                conn.close();
                JOptionPane.showMessageDialog(null, "Success - User " + name + " found: \n" + output);

                return user;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public User userLoginold(String inputName, String inputPassword) {
        boolean isUserNameMatched = false;
        boolean isUserpasswordMatched = false;
        boolean isUserLoginAllowed = false;
        User user = null;
        System.out.println(inputName);
        System.out.println("from USERLOG in form, passed to  readClass:  " + inputPassword);

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "SELECT * FROM usertable WHERE userName='" + inputName + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";
            if (result.next() == false) {
                JOptionPane.showMessageDialog(null, "Error : The user named " + inputName + " was not found! \n Check for typos \n Try register for a new account");
                System.out.println("No data");
            } else {

                while (result.next()) {
                    user = new User(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7));
                    String userName = result.getString(4);

                    String password = result.getString(6);
                    String userAccessLevel = result.getString(7);

                    if (inputName.equalsIgnoreCase(userName)) {
                        isUserNameMatched = true;
                    }
                    if (inputPassword.equals(password)) {
                        isUserpasswordMatched = true;
                        System.out.println("pwd");
                    }
                    if (isUserpasswordMatched && isUserNameMatched) {
                        isUserLoginAllowed = true;
                        JOptionPane.showMessageDialog(null, "Success - User " + inputName + " found: \n" + inputName + " is being loged in!! ");
                    } else if (!isUserpasswordMatched && !isUserNameMatched) {
                        JOptionPane.showMessageDialog(null, "Error - User name or password are incorrect! \n Check for typos \n Try register for a new account!");
                    }

                    break;
                }
                conn.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;

    }

    public User userLogin(String inputName, String inputPassword) {

        User user = null;
        System.out.println(inputName);
        System.out.println("from USER LOGIN form, passed to  readClass:  " + inputPassword);

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "SELECT * FROM usertable WHERE userName='" + inputName + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User data found!" + result.getString(4));
                result.getString(4);
                if (result.getString(4).equalsIgnoreCase(inputName)) {
                    if (result.getString(6).equals(inputPassword)) {
                        user = new User(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7));
                        conn.close();
                        return user;
                    } else {
                        System.out.println("Missmatch ");
                    JOptionPane.showMessageDialog(null, "Error - User name or password are incorrect! \n Check for typos \n Try register for a new account!");

                    }

                    System.out.println("Missmatch ");

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;

    }

}
