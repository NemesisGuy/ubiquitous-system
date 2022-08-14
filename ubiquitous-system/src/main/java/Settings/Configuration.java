/*
 *     
 * 
 */
package Settings;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter B 
 * nemesisnet.co.za
 */
public class Configuration {

    public static void main(String[] args) {
        String[][] configsTestArr = {{"db.url", "db.user", "db.password"},
        {"localhost", "root", "password"}};
        Map<String, String> map = new HashMap<String, String>();

        map.put("db.connectionName", "test");
        map.put("db.url", "test");
        map.put("db.port", "80");
        map.put("db.name", "Library");
        map.put("db.user", "test");
        map.put("db.password", "example");

        Configuration configuration = new Configuration();

        configuration.writeConfig("Database-Connection", map);
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

    public boolean writeConfig(String fileName, Map<String, String> properties) {

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
            JOptionPane.showMessageDialog(null, "Error : " + "\n Unable to create Config File, Please Check file your folder structure and permissions  \n");
        }
        return success;

    }

    public static boolean isConfigFileFound(String fileName) {
        boolean fileExsits = false;
        File file = new File(fileName + ".properties");
        if (file.exists() && !file.isDirectory()) {
            fileExsits = true;
            System.out.println("file exsists ");
        } else {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return fileExsits;
    }

}
