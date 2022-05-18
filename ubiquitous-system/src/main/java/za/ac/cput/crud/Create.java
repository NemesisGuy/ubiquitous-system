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

/**
 * @author Peter Buckingham
 */
public class Create {

    public void createBook() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO booktable(title, subTitle, author, ISBN, description, rate, imageLink) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, "Harry Potter");
            statement.setString(2, "and the Prisoner of Azkaban");
            statement.setString(3, "jk. Roling");
            statement.setString(4, "0-7475-4215-5");
            statement.setString(5, "Harry Potter and the Prisoner of Azkaban by J.K. Rowling, which follows the Boy Who Lived during his third year at Hogwarts School of Witchcraft and Wizardry. This year, the school is guarded by Dementors, sinister hooded creatures sent by the Ministry of Magic as a defence against the escaped murderer Sirius Black who is pursuing Harry. Assisted by Hermione, Ron and the new Defence Against the Dark Arts teacher Remus Lupin, Harry faces a race against time to prevent Voldemort’s return and find out the truth about his parents’ murder.");
            statement.setString(6, "4");
            statement.setString(7, "https://covers.openlibrary.org/b/id/10580435-L.jpg");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new book was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
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

    public void createUser() {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO userTable(firstName, lastName, userName, email, password, userAccessLevel) VALUES (?, ?, ?, ?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1, "Jhon ");
            statement.setString(2, "Doe");
            statement.setString(3, "JD");
            statement.setString(4, "JhonDoe1999@gmail.com");
            statement.setString(5, "1234");
            statement.setString(6, "0");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void createUser(String firstName, String lastName, String userName, String email, String password, int userAccessLevel) {

        DatabaseConnection databaseConnection = new DatabaseConnection();

        Connection conn = databaseConnection.getDatabaseConnection();

        String sql = "INSERT INTO userTable(firstName, lastName, userName, email, password, userAccessLevel) VALUES (?, ?, ?, ?,?,?)";

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
                System.out.println("A new user named " + firstName + " " + lastName + " was inserted successfully!");
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
