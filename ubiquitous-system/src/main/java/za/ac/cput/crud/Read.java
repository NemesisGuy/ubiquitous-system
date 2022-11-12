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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.Loan;

/**
 * @author Peter Buckingham
 */
public class Read {

    DisplayBookForm displayBookForm;
    String title, subTitle, author, ISBN, description, rating, imageLink;

    /**
     *
     * @return
     */
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
            if (!result.isBeforeFirst()) {//id DB give data back ? if not do this...
                JOptionPane.showMessageDialog(null, "Error : The book titled " + inputTitle + " was not found!");
                System.out.println("No data");
            } else {///dose have data do this
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
    
    public Book readBookById(int bookId) {
        String inputTitle = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

       
        String sql = "SELECT * FROM booktable WHERE id='" + bookId + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";
            if (!result.isBeforeFirst()) {//id DB give data back ? if not do this...
                JOptionPane.showMessageDialog(null, "Error : The book with the id " + bookId + " was not found!");
                System.out.println("No data");
            } else {///dose have data do this
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

                System.out.println(book.getISBN() + "from read class");

                System.out.println(title + " " + subTitle);
                return book;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    /**
     *
     * @return
     */
    public Book loanBookByTitle() {///////////////////////////////????????????????????????????????????
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

    /**
     *
     * @return
     */
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
                bookList.add(new Book(Integer.valueOf(id), title, subTitle, ISBN, author, description, rating, imageLink));
            }
            conn.close();
            //  JOptionPane.showMessageDialog(null, output);

        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @param inputName
     * @param inputPassword
     * @return
     */
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

    /**
     *
     * @param inputName
     * @param inputPassword
     * @return
     */
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
                        System.out.println("Missmatch - close ");

                    }

                }
                System.out.println("Missmatch ");
            }
            // JOptionPane.showMessageDialog(null, "Error - User name or password are incorrect! \n Check for typos \n Try register for a new account!");

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

    /**
     *
     * @param userId
     * @return
     */
    public Loan readUserCurrentLaon(String userId) {
        int userIdInt = Integer.parseInt(userId);
        Loan loan = null;

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        //String sql =  "SELECT TOP 1 userId FROM loantable  WHERE userId='" + userId + "'";
        String sql = "SELECT * FROM bookloanstable WHERE userId='" + userIdInt + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User data found!");

                if (result.isLast()) {
                    // System.out.println(result.getString(1)+ result.getString(2)+ result.getString(3)+ result.getString(4)+ result.getString(5)+ result.getString(6));
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));

                } else {
                    //  System.out.println("Missmatch ");
                    // JOptionPane.showMessageDialog(null, "Error - User name or password are incorrect! \n Check for typos \n Try register for a new account!");
                    //  System.out.println("Missmatch ");
                }

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loan;

    }

    /**
     *
     * @param userId
     * @param book
     * @return
     */
    public Loan readUserLoanByBookTitle(String userId, Book book) {
        int userIdInt = Integer.parseInt(userId);
        int bookId = book.getBookId();
        Loan loan = null;
        String date = "0-0-0";
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM bookloanstable WHERE userId='" + userIdInt + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User data found!");

                if (result.getString("bookId").equalsIgnoreCase(String.valueOf(bookId)) && result.getString("returned").equalsIgnoreCase(String.valueOf(date))) {
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
                    System.out.println("Book Id found!" + loan.getBookId());
                    System.out.println("User ID found!" + loan.getUserId());
                    System.out.println("Returned Date found!" + loan.getReturnedDate());
                    conn.close();
                    return loan;
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loan;
    }

    /**
     *
     * @param userId
     * @param bookId
     * @return
     */
    public ArrayList<Loan> readUserLoansByUserIdAndBookId(String userId, String bookId) {
        int userIdInt = Integer.parseInt(userId);
        int bookIdint = Integer.parseInt(bookId);
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        Loan loan = null;
        //String date = "0-0-0";
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        //String sql =  "SELECT TOP 1 userId FROM loantable  WHERE userId='" + userId + "'";
        String sql = "SELECT * FROM bookloanstable WHERE userId='" + userIdInt + "'";
        //  String sql = "UPDATE bookloanstable SET returned=?  WHERE id=" + loanId +" AND returned !='"+date +"'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User loan data found!");

                if (result.getString(3).equalsIgnoreCase(bookId) && result.getString(2).equalsIgnoreCase(userId) ) {//dont need uid chek really
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
                    System.out.println("Loan ID found = " + loan.getLoanId());
                    System.out.println("Book ID found = " + loan.getBookId());
                    System.out.println("User ID found = " + loan.getUserId());
                    System.out.println("Returned Date found = " + loan.getReturnedDate());
                    System.out.println("Was retruned as Loan! ");
                    loanList.add(loan);
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loanList;

    }public ArrayList<Loan> readUserLoansByUserId(String userId) {
        int userIdInt = Integer.parseInt(userId);
        
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        Loan loan = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM bookloanstable WHERE userId='" + userIdInt + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User loan data found!");

                if (result.getString(2).equalsIgnoreCase(userId) ) {//dont need uid chek really
                   loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
                    System.out.println("Loan ID found = " + loan.getLoanId());
                    System.out.println("Book ID found = " + loan.getBookId());
                    System.out.println("User ID found = " + loan.getUserId());
                    System.out.println("Returned Date found = " + loan.getReturnedDate());
                    System.out.println("Was retruned as Loan! ");
                loanList.add(loan);
                }
        }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loanList;

    }

    /**
     *
     * @param userId
     * @param book
     * @return
     */
    public Loan readOutstandingUserLoanByBookId(String userId, Book book) {
        int userIdInt = Integer.parseInt(userId);
        Loan loan = null;
        String bookid = String.valueOf(book.getBookId());
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "SELECT * FROM bookloanstable WHERE userId='" + userIdInt + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("User data found!");

                if (result.getString("returned").equalsIgnoreCase("false") || result.getString("returned").equalsIgnoreCase("0-0-0")) {
                    // System.out.println(result.getString(1)+ result.getString(2)+ result.getString(3)+ result.getString(4)+ result.getString(5)+ result.getString(6));
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
                    break;
                } else {
            }

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loan;

    }

    /**
     *
     * @param bookId
     * @return
     */
    public ArrayList<Loan> readLaonByBookId(String bookId) {
        int bookIdInt = Integer.parseInt(bookId);
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        User user = new User();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();
        String sql = "SELECT * FROM bookloanstable WHERE bookId='" + bookId + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;
            String output = "Connected: \n";

            while (result.next()) {
                String Id = result.getString(1);
                String userId = result.getString(2);
                String bookIddbd = result.getString(3);
                String loanFromDate = result.getString(4);
                String dueOnDate = result.getString(5);
                String returned = result.getString(6);

                loanList.add(new Loan(Id, userId, bookIddbd, loanFromDate, dueOnDate, returned));
                System.out.println("dueOnDate : " + dueOnDate);

            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loanList;
    }

    /**
     *
     * @param book
     * @return
     */
    public Loan readLatestLoanByBookId(Book book) {

        Loan loan = null;

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "SELECT * FROM bookloanstable WHERE bookId='" + book.getBookId() + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("book loan data found!");

                if (result.isLast()) {
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));

                } else {
                                   }

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loan;

    }

    /**
     *
     * @param book
     * @return
     */
    public Loan readIsBookAvalible(Book book) {
        Loan loan = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "SELECT * FROM bookloanstable WHERE bookId='" + book.getBookId() + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                System.out.println("Loan data found!");
                if (result.getString("returned").equalsIgnoreCase("false") || result.getString("returned").equalsIgnoreCase("0-0-0")) {

                    System.out.println("Book not avalible");
                    loan = new Loan(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
                } else {
                    System.out.println("Book avalible");
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loan;
    }

    /**
     *
     * @param user
     * @return
     */
    public ArrayList<Loan> readUserLoansByUserId(User user) {
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection conn = databaseConnection.getDatabaseConnection();//     String sql = "SELECT * FROM usertable";
        String sql = "SELECT * FROM bookloanstable WHERE userId='" + user.getUserId() + "'";
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            String output = "Connected: \n";
            while (result.next()) {
                String Id = result.getString(1);
                String userId = result.getString(2);
                String bookIddbd = result.getString(3);
                String loanFromDate = result.getString(4);
                String dueOnDate = result.getString(5);
                String returned = result.getString(6);
                loanList.add(new Loan(Id, userId, bookIddbd, loanFromDate, dueOnDate, returned));
                System.out.println("loan Id : " + Id + "\tBook Id : " + bookIddbd + "\t dueOnDate : " + dueOnDate);
            }
            conn.close();
            JOptionPane.showMessageDialog(null, output);
        } catch (SQLException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loanList;
    }
}
