/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.awt.Image;

/**
 *
 * @author Peter Buckingham
 */
public class Book {

    private int bookId;
    private String title;
    private String subTitle;
    private String ISBN;
    private String authors;
    private String description;
    private String rating;
    private String imageLink;
    private Image frontCover;

    public Book(int bookId, String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.authors = authors;
        this.description = description;
        this.rating = rating;
        this.imageLink = imageLink;
        this.frontCover = frontCover;
        this.subTitle = subTitle;
    }
     public Book( String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink) {
       // this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.authors = authors;
        this.description = description;
        this.rating = rating;
        this.imageLink = imageLink;
        this.frontCover = frontCover;
        this.subTitle = subTitle;
    }
    public Book( String title, String subTitle, String authors, String description, String rating, String imageLink) {
       // this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.authors = authors;
        this.description = description;
        this.rating = rating;
        this.imageLink = imageLink;
        this.frontCover = frontCover;
        this.subTitle = subTitle;
    }

    public Book() {
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        if (ISBN == null)
        {
          ISBN = "book isbn getter set this";
        }
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Image getFrontCover() {
        return frontCover;
    }

    public void setFrontCover(Image frontCover) {
        this.frontCover = frontCover;
    }

}
