/*
 */
package za.ac.cput.crud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Peter Buckingham
 */
public class DatabaseConnection {

    public Connection getDatabaseConnection()  {
        InputStream inputStream;
        Properties properties = new Properties();
        try {
            inputStream = new FileInputStream("Database-Connection.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dbUrl = properties.getProperty("db.url");
        String dbName = properties.getProperty("db.name");
        String dbPort = properties.getProperty("db.port");
        String dbUser = properties.getProperty("db.user");
        String dbPassword = properties.getProperty("db.password");
        String dbURL = "jdbc:mysql://" + dbUrl + ":" + dbPort + "/" + dbName + "";

        Connection conn = null;

        try {
            //  Class.forName("com.mysql.jdbc.Driver"); old driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            if (conn != null) {
                System.out.println("Connected");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
