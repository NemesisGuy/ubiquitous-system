/*
 *
 */
package za.ac.cput.ubiquitous.system;

import za.ac.cput.crud.Create;
import za.ac.cput.crud.Delete;
import za.ac.cput.crud.Read;
import za.ac.cput.crud.Update;

/**
 * @author Peter Buckingham
 */
public class RunnerTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        addBookToDatabase();
        readBooksFromDatabase();
        updateBookInDatabase();
        readBooksFromDatabase();
        deleteBookFromDatabase();
        readBooksFromDatabase();
        addUserToDatabase();
        readUsersFromDatabase();
        updateUserInDatabase();
        deleteUserFromDatabase();
        readBookByNameFromDatabase();

    }

    /**
     *
     */
    public static void updateBookInDatabase() {
        Update update = new Update();
        update.updateBook();

    }

    /**
     *
     */
    public static void addBookToDatabase() {
        Create create = new Create();
        //    create.createBook();///create a constructor that can build it with args mayb
    }

    /**
     *
     */
    public static void deleteBookFromDatabase() {
        Delete delete = new Delete();
        delete.deleteBook();
    }

    /**
     *
     */
    public static void readBooksFromDatabase() {
        Read read = new Read();
        read.readAllBooks();
    }

    /**
     *
     */
    public static void addUserToDatabase() {
        Create create = new Create();
        //   create.createUser();
    }

    /**
     *
     */
    public static void readUsersFromDatabase() {
        Read read = new Read();
        read.readAllUsers();
    }

    /**
     *
     */
    public static void updateUserInDatabase() {
        Update update = new Update();
        update.updateUser();
    }

    /**
     *
     */
    public static void deleteUserFromDatabase() {
        Delete delete = new Delete();
        delete.deleteUser();
    }

    /**
     *
     */
    public static void readBookByNameFromDatabase() {
        Read read = new Read();
        read.readBookByTitle();
    }
}
