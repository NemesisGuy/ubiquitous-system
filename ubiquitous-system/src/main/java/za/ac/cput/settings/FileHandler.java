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
     * @param from - The path of the file to be copied
     * @param to - The path of the file to be copied
     * @apiNote This method copies a file from one location to another. The file is copied from the "from" parameter to the "to" parameter.
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
     * @param folderPath - The path of the folder to be created
     * @param path - The path of the folder to be created
     * @return - Returns true if the folder was created successfully, otherwise returns false.
     * @apiNote This method creates a folder at the location specified by the "path" parameter. The folder is created at the location specified by the "path" parameter.
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
     * @param path - The path of the file to be created
     * @return Boolean - Returns true if the file was created successfully, otherwise returns false.
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
     * @param path - The path of the file to be created
     * @return Boolean - Returns true if the file was created successfully, otherwise returns false.
     * @apiNote This method creates a file at the location specified by the "path" parameter. The file is created at the location specified by the "path" parameter. If the file already exists, the method returns false. If the file does not exist, the method creates the file and returns true. Otherwise returns false.
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
     * @param path - The path of the file to be created
     * @return Boolean - Returns true if the file was created successfully, otherwise returns false.
     * @apiNote This method creates a file at the location specified by the "path" parameter. The file is created at the location specified by the "path" parameter. The method returns true if the file was created successfully, otherwise returns false.
     *
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
     * @param folderPath - The path of the folder to be created
     * @return Boolean - Returns true if the folder was created successfully, otherwise returns false. Returns true if the folder was created successfully, otherwise returns false.
     * @apiNote This method creates a folder at the location specified by the "folderPath" parameter. The folder is created at the location specified by the "folderPath" parameter. The
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
