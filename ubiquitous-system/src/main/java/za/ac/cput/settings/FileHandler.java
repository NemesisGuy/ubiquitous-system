/*
 *     
 * 
 */
package za.ac.cput.settings;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter B
 */
public class FileHandler {

    /**
     *
     * @param from
     * @param to
     */
    public static void copyFile(File from, File to) {
        try {
            Files.copy(from.toPath(), to.toPath());
            System.out.println("SUCCESS -  Completed Copy to : \n" + to);

        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param folderPath
     * @param path
     * @return
     */
    public boolean initConfig(Path folderPath, Path path) {
      
        FileHandler fileHandler = new FileHandler();
        if (!fileHandler.isConfigFileFound(path)) {
            fileHandler.createFolder(folderPath);
            fileHandler.createFile(path);
            fileHandler.isFilePermissionValid(path);
           
        } 
        return true;

    }

    /**
     *
     * @param path
     * @return
     */
    public boolean isConfigFileFound(Path path) {
        boolean fileExsits = false;
        File file = new File(path.toString());

        if (file.exists()) {
            System.out.println("File exsists... ");
            if (file.isDirectory()) {
                System.out.println("File is actually a Directory!");
            } else {
                System.out.println("File is not a Directory - No fix required!");
                fileExsits = true;
            }
        } else {
            System.out.println("File does not exist!");
            fileExsits = false;
        }
        return fileExsits;
    }

    /**
     *
     * @param path
     * @return
     */
    public boolean isFilePermissionValid(Path path) {
        boolean filePermissionValid = false;
        File file = new File(path.toString());
        if (!file.canRead() || !file.canWrite()) {
            System.out.println("File has permissions issues!  ");
            System.out.println("Applying File Permissions fix...");
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
            System.out.println("File Permissions fix Completed...");
            filePermissionValid = true;
            if (!file.canRead() || !file.canWrite()) {
                System.out.println("Unable to fix file permissions!");
                filePermissionValid = false;
            } else {
                System.out.println("File exsists and has Correct file permissions!  ");
                filePermissionValid = true;
            }
        }

        return filePermissionValid;
    }

    /**
     *
     * @param path
     * @return
     */
    public boolean createFile(Path path) {
        boolean completed = false;
        File file = new File(path.toString());
        try {
            file.createNewFile();
            System.out.println("File was created!");
            completed = true;
        } catch (IOException ex) {
            System.err.println("Failed to create File!" + ex.getMessage());
        }
        return completed;

    }

    /**
     *
     * @param folderPath
     * @return
     */
    public boolean createFolder(Path folderPath) {
        boolean folderCreated = false;
        File file = new File(folderPath.toString());
        try {
            Files.createDirectories(folderPath);
            System.out.println("Directory was created!");
            folderCreated = true;
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
        }
        return folderCreated;
    }

}
