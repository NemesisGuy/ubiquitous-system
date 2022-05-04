/*
 *     
 * 
 */
package za.ac.cput.googlebooksapi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Peter Buckingham
 */
public class BookDisplay {

    private Book book = new Book();
    private String tile;
    private String author;
    private String isbn;
    private String description;
    private String imageLink;
    private BufferedImage coverImage;

    public BookDisplay() {
    }

    public BookDisplay(Book book) {
        this.book = book;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public BufferedImage getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(BufferedImage coverImage) {
        this.coverImage = coverImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static void main(String[] args) throws IOException {
        //     String searchTerm = "8mile";
        BookDisplay bookDisplay = new BookDisplay();
        bookDisplay.displayBook();

        System.out.println("Isbn : " + bookDisplay.getIsbn());

    }

    public void displayBook() throws MalformedURLException, IOException {
        // String imageUrl = "https://covers.openlibrary.org/b/isbn/9781118957424-L.jpg";
        JFrame bookFrame = new JFrame("Libirary System - Book Details : ");
        JPanel bookPanel = new JPanel();
        
        //BorderLayout layout = new BorderLayout();
        GridLayout layout = new GridLayout(6, 2);
        JLabel bookTitle = new JLabel("Title: " + book.getTitle());
        JLabel bookSubTitle = new JLabel("Subtitle: " + book.getSubTitle());
        JLabel bookAuthor = new JLabel("Authors: " + book.getAuthors());
        JLabel bookRating = new JLabel("Rating : " + book.getRating() + "/5");
        JTextArea bookDescription = new JTextArea("Description: " + book.getDescription());
        JLabel bookISBN = new JLabel("ISBN: " + book.getISBN());
        bookDescription.setColumns(50);
        bookDescription.setRows(50);
        bookDescription.setEditable(false);
        
        bookDescription.setLineWrap(true);
        bookDescription.setWrapStyleWord(true);
        
        
        JScrollPane areaScrollPane = new JScrollPane(bookDescription);
        areaScrollPane.setVerticalScrollBarPolicy(
         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));   
        
        // bookDescription.setPreferredSize();
        String bookImageLink = book.getImageLink();
        bookImageLink = bookImageLink.substring(bookImageLink.lastIndexOf("http"), bookImageLink.length() - 2);
        // bookImageLink.lastIndexOf("http");
        //bookImageLink.lastIndexOf("http");
        JLabel bookCover = new JLabel();
        bookCover.setSize(500, 500);
        bookCover.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10),  new EtchedBorder()));

        URL url = new URL(bookImageLink);
        Image image = ImageIO.read(url);
        bookCover.setIcon(new ImageIcon(image));

        // BufferedImage myPicture = ImageIO.read(new File(bookImageLink));
        //JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        //add(picLabel);
        //image stuff
        //  BufferedImage myPicture = null;
        //  bookCover.setIcon(new ImageIcon(getCoverImage()));
        bookPanel.setLayout(layout);
        bookPanel.add(bookTitle);
        bookPanel.add(bookSubTitle);
        bookPanel.add(bookAuthor);
        bookPanel.add(bookISBN);
        bookPanel.add(bookRating);
        bookPanel.add(bookCover);
        bookPanel.add(areaScrollPane);
        
        bookPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10),  new EtchedBorder()));
        // bookPanel.add(picLabel);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        bookFrame.pack();
        bookFrame.setSize(screenSize.width / 2, screenSize.height / 2);
        bookFrame.setLocationRelativeTo(null);
        bookFrame.add(bookPanel);
        //bookFrame.pack();
        bookFrame.setName("Library System - Book Details : ");
        bookFrame.setVisible(true);
        bookFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
