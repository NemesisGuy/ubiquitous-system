/*
 *     
 * 
 */
package za.ac.cput.settings;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter B
 */
public class FileHandler {

    public static void copyFile(File from, File to)  {
        try {
            Files.copy(from.toPath(), to.toPath());
            System.out.println("SUCCESS -  Completed Copy to : \n" + to);
            
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
