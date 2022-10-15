/*
 *     
 * 
 */
// You can perform a volumes search by sending an HTTP GET request to the following URI:
//https://www.googleapis.com/books/v1/volumes?q=search+terms 
//Here is an example of searching for Daniel Keyes' "Flowers for Algernon":
//GET https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=yourAPIKey
package za.ac.cput.googlebooksapi;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.books.model.Volumes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Peter Buckingham
 */
// Query format: "[<author|isbn|intitle>:]<query>"
public class BookSearch implements ActionListener {

    /**
     *
     */
    public JComboBox searchTypeJComboBox;

    /**
     *
     */
    public JButton searchButton;

    /**
     *
     */
    public JTextField searchTermJTextField;

    /**
     *
     */
    public String[] searchTerm = new String[2];

    /**
     *
     * @return
     */
    public String[] searchBooksAPI() {
        // String bookTitleSerchTerm = JOptionPane.showInputDialog(null,"Enter Book Title to search for : ","Book Search :", JOptionPane.INFORMATION_MESSAGE);
        // Query format: "[<author|isbn|intitle>:]<query>"
        String[] searchType = {"--title", "--author", "--isbn"};
        searchTypeJComboBox = new JComboBox(searchType);
        searchTypeJComboBox.setEditable(false);
        searchButton = new JButton("Search");
        searchButton.setActionCommand("searchButton");
        JLabel searchTermJLabel = new JLabel("Enter Book Title to search for : ");
        searchTermJTextField = new JTextField();

        // JPanel jPanel = new JPanel();
        //create a JOptionPane
        Object[] options = new Object[]{};
        JOptionPane bookTitleSearchTerm = new JOptionPane("Please select the type of search",
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                null, options, null);

        //action listerners
        searchButton.addActionListener(this);

//add combos to JOptionPane
        bookTitleSearchTerm.add(searchTypeJComboBox);
        bookTitleSearchTerm.add(searchTermJLabel);
        bookTitleSearchTerm.add(searchTermJTextField);
        bookTitleSearchTerm.add(searchButton);

        //create a JDialog and add JOptionPane to it 
        JDialog diag = new JDialog();
        diag.getContentPane().add(bookTitleSearchTerm);
        diag.pack();
        diag.setLocationRelativeTo(null);
        diag.setVisible(true);

        // if (personName == null) {
        //     return;
        // }bookSearchTerm
        return searchTerm;
    }

    private void getGoogleBooks(JsonFactory jsonFactory, String query) throws Exception {

    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("searchButton")) {
            String searchArray[] = {"", ""};

            System.out.println();
            String term = searchTermJTextField.getText();
            String type = searchTypeJComboBox.getSelectedItem().toString();
            System.out.println(term);
            System.out.println(type);
            //searchTerm[0] = "";
            searchArray[0] = type;
            searchArray[1] = term;

            BookListDisplay bookListDisplay = new BookListDisplay();
            Book book = new Book();
            BooksSample booksSample = new BooksSample();
            booksSample.setBook(book);

            try {
                Volumes v = booksSample.getGoogleBooksList(new GsonFactory(), booksSample.parseSearchQuery(searchArray));
                System.out.println("Volumes v was populated !! ");
                bookListDisplay.diplay(v);
            } catch (Exception ex) {
                Logger.getLogger(BookSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
