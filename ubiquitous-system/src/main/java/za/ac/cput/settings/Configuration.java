/*
 *     
 * 
 */
package za.ac.cput.settings;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter B nemesisnet.co.za
 */
public class Configuration {

    public static void main(String[] args) {
//        String[][] configsTestArr = {{"db.url", "db.user", "db.password"},
//        {"localhost", "root", "password"}};
//    //    Map<String, String> map = new HashMap<String, String>();
        //       Path path = Paths.get("/settings/");
//  //      map.put("db.connectionName", "test");
//  //      map.put("db.url", "test");
// //       map.put("db.port", "80");
// //       map.put("db.name", "Library");
// //       map.put("db.user", "test");
////        map.put("db.password", "example");

        //  Configuration configuration = new Configuration();
        //    configuration.writeConfig(path,"Database-Connection", map);
    }

    public void intiDefaultConfigs() {
        intiDefaultCompanyProfileConfig();
        intiDefaultDatabaseConnectionConfig();

    }

    public void intiDefaultCompanyProfileConfig() {
        String fileName = "Company-Profile.properties";
        Path path = Paths.get("resources/settings/" + fileName);
        Path folderPath = Paths.get("resources/settings/");
        Configuration configuration = new Configuration();
        FileHandler fileHandler = new FileHandler();    
        Map<String, String> properties = new HashMap<String, String>();
        //     name website conrty timzone adminname currency
        properties.put("company.name", "Example Inc");
        properties.put("company.url", "example.com");
        properties.put("company.contry", "South Africa");
        properties.put("company.timeZone", "+2:00");
        properties.put("company.adminName", "Jhon Snow");
        properties.put("company.currency", "R");
        fileHandler.initConfig(folderPath, path);
        configuration.writeConfig(path, properties);
    }
    public void intiDefaultDatabaseConnectionConfig() {
        String fileName = "Database-Connection.properties";
        Path path = Paths.get("resources/settings/" + fileName);
        Path folderPath = Paths.get("resources/settings/");
        Configuration configuration = new Configuration();
        FileHandler fileHandler = new FileHandler();
        Map<String, String> properties = new HashMap<String, String>(); // creates Map where keys and values of string type
        //method to store elements
        properties.put("db.connectionName", "Default-Connection");
        properties.put("db.url", "192.168.0.31");
        properties.put("db.port", "9042");
        properties.put("db.name", "Library");
        properties.put("db.user", "admin");
        properties.put("db.password", "e8pUIoSehi@vjYyY");
        fileHandler.initConfig(folderPath, path);
        configuration.writeConfig(path, properties);
    }

    

    public boolean writeConfigTest() {

        boolean success = false;

        try ( OutputStream output = new FileOutputStream("/config.properties")) {

            Properties prop = new Properties();

            prop.setProperty("db.url", "testurl");
            prop.setProperty("db.user", "testuser");
            prop.setProperty("db.password", "testpassword");

            prop.store(output, null);

            System.out.println(prop);
            success = true;

        } catch (IOException io) {
            io.printStackTrace();
        }
        return success;

    }

  
    public Icon displayLogoBannerFromConfig() {
         String fileName = "Company-Profile.properties";
        Path path = Paths.get("resources/settings/" + fileName);
        Path folderPath = Paths.get("resources/settings/");
        ImageIcon imageIcon = null;
        try ( InputStream input = new FileInputStream(path.toString())) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("company.logoPath"));
            // Icon  new ImageIcon(input);
            imageIcon = new ImageIcon(prop.getProperty("company.logoPath"));
            Image image = imageIcon.getImage(); // transform it 
            Image scaledImage = image.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
            imageIcon = new ImageIcon(scaledImage);  // transform it back

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imageIcon;
    }

    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
    public Properties readConfig(Path path) {
        Properties properties = new Properties();
        try ( InputStream input = new FileInputStream(path.toString())) {
            // load a properties file
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }

    public boolean writeConfig(Path path, Map<String, String> propertiesMap) {
        boolean isConfigSet = false;
        try ( OutputStream output = new FileOutputStream(path.toString())) {

            Properties properties = new Properties();

            // set the properties value
            for (Map.Entry element : propertiesMap.entrySet()) {
                String key = (String) element.getKey();
                String value = (String) element.getValue();
                System.out.println(key + " : " + value);
                properties.setProperty(key, value);
            }
            // save properties to paths folder
            properties.store(output, null);
            System.out.println(path);
            System.out.println("Writing : \t" + properties);

        } catch (IOException io) {
            io.printStackTrace();
        }
        return false;
    }

}
