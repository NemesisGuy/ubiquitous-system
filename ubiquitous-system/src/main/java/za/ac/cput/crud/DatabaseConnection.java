/*
 */
package za.ac.cput.crud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.cput.settings.Configuration;

/**
 * @author Peter Buckingham
 */
public class DatabaseConnection {
//derby port 1527

    public Connection getDatabaseConnection() {

        String fileName = "Database-Connection.properties";
        Path path = Paths.get("resources/settings/" + fileName);
        Path folderPath = Paths.get("resources/settings/");
        InputStream inputStream;
        Properties properties = new Properties();
        Configuration configuration = new Configuration();
        properties = configuration.readConfig(path);
        String dbUrl = properties.getProperty("db.url");
        String dbName = properties.getProperty("db.name");
        String dbPort = properties.getProperty("db.port");
        String dbUser = properties.getProperty("db.user");
        String dbPassword = properties.getProperty("db.password");
        // String dbURL = "jdbc:mysql://" + dbUrl + ":" + dbPort + "/" + dbName + "";
        //String dbURL = "jdbc:mysql://" +"librarydatabase.nemesisnet.co.za"+ ":" + "9042" + "/" +"Library " + "";
   
        String dbURL = "jdbc:mysql://" + "librarydatabase.nemesisnet.co.za" + ":" + "3306" + "/" + "LibraryDatabase " + "";
        Connection conn = null;

        try {

            //  Class.forName("com.mysql.jdbc.Driver"); old driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(dbURL + " " + dbUser + " " + dbPassword);
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            if (conn != null) {
                System.out.println("Connected");
            }

        } catch (SQLException ex) {
            System.out.println("Connection Failed!!");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getDatabaseConnection();
    }
}
