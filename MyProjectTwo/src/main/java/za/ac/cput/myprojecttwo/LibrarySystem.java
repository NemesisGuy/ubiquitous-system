/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.myprojecttwo;
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
/**
 *
 * @author wendy
 */
public class LibrarySystem {
  public Connection getDatabaseConnection() {
        String dbURL = "jdbc:mysql://" + "librarydatabase.nemesisnet.co.za" + ":" + "3306" + "/" + "LibraryDatabase " + "";
        String dbUser = "LibraryDbUser";
        String dbPassword = "NcP_?+3gV63g";

        Connection conn = null;
        int ok;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(dbURL + " " + dbUser + " " + dbPassword);
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            if (conn != null) {
                System.out.println("Connected");
            }
        } catch (SQLException ex) {
            System.out.println("Connection Failed!!");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibrarySystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }  
  public static void main(String[] args) {
        LibrarySystem databaseConnection = new LibrarySystem();
        databaseConnection.getDatabaseConnection();
    }
}
