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

    public boolean writeConfig(Path path, String fileName, Map<String, String> properties) {

        boolean success = false;
        if (isConfigFileFound(fileName)) {
            try ( OutputStream output = new FileOutputStream(fileName + ".properties")) {

                Properties prop = new Properties();

                for (Map.Entry element : properties.entrySet()) {
                    String key = (String) element.getKey();
                    String value = (String) element.getValue();

                    System.out.println(key + " : " + value);
                    prop.setProperty(key, value);
                }

                prop.store(output, null);

                System.out.println("prop : " + prop);
                success = true;

            } catch (IOException io) {
                io.printStackTrace();
                //  System.out.println("Creating Config file for " + fileName);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error : " + "\n Unable to save settings!\n File not found!! \n ");
            createFolderAndFile( path, fileName);
        }
        return success;

    }

    public static boolean isConfigFileFound(String fileName) {
        boolean fileExsits = false;
        File file = new File(fileName + ".properties");
        
        if (file.exists() && !file.isDirectory() && file.canRead() && file.canWrite()) {
            fileExsits = true;
            System.out.println("file exsists ");
        } else {
            System.out.println("file does not exsist, or has permissions issues! ");
        }
        return fileExsits;
    }

    public void createFolderAndFile(Path path, String fileName) {
        File file = new File(fileName + ".properties");
        try {

            // path = Paths.get("/home/");

            //java.nio.file.Files;
            Files.createDirectories(path);

            System.out.println("Directory was created!");
            
        } catch (IOException e) {

            System.err.println("Failed to create directory!" + e.getMessage());

        }
        try {
             
                file.createNewFile();
                System.out.println("File was created!");
            } catch (IOException ex) {
                Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Failed to create File!" + ex.getMessage());
            }

    }
    public Icon displayLogoBannerFromConfig(){
    ImageIcon imageIcon  =null;
    try (InputStream input = new FileInputStream("Company-Profile.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("company.logoPath"));
         // Icon  new ImageIcon(input);
            imageIcon  = new ImageIcon(prop.getProperty("company.logoPath"));
            Image image = imageIcon.getImage(); // transform it 
            Image scaledImage = image.getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
            imageIcon = new ImageIcon(scaledImage);  // transform it back
          
  
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imageIcon;
    }

}
