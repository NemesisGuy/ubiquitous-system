/*
 *
 */
package za.ac.cput.crud;

/**
 *
 * @author Peter Buckingham
 */
public class Runner {

    public static void main(String[] args) {
        addBookToDatabase();
        readBooksFromDataBase();
        updateBookInDatabase();
        readBooksFromDataBase();
        deleteBookFromDatabase();
        readBooksFromDataBase();

        addUserToDatabase();
        readUsersFromDataBase();
        updateUserInDatabase();
        deleteUserFromDatabase();

    }

    public static void updateBookInDatabase() {
        Update update = new Update();
        update.updateBook();

    }

    public static void addBookToDatabase() {
        Create create = new Create();
        create.createBook();///create a constructor that can build it with args mayb
    }

    public static void deleteBookFromDatabase() {
        Delete delete = new Delete();
        delete.deleteBook();
    }

    public static void readBooksFromDataBase() {
        Read read = new Read();
        read.readAllBooks();
    }


    public static void addUserToDatabase() {
        Create create = new Create();
        create.createUser();
    }

    public static void readUsersFromDataBase() {
        Read read = new Read();
        read.readAllUsers();
    }

    public static void updateUserInDatabase() {
        Update update = new Update();
        update.updateUser();
    }

    public static void deleteUserFromDatabase() {
        Delete delete = new Delete();
        delete.deleteUser();
    }
}
