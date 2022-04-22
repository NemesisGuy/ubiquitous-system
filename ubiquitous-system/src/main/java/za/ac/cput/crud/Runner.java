/*

********************
 */
package za.ac.cput.crud;

/**
 *
 * @author Peter Buckingham
 */
public class Runner {

    public static void main(String[] args) {
       // addBookToDatabase();
        Read read = new Read();
        read.readAllBooks();

    }

    public static void updateBookInDatabase() {
        Update update = new Update();
        update.updateBook();

    }

    public static void addBookToDatabase() {
        Create create = new Create();
        create.createBook();///create a constructor that can build it with args mayb
    }

}
