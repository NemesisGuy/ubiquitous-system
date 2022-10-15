/*
 *     
 * 
 */
package za.ac.cput.googlebooksapi;

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

    /**
     *
     * @param bookId
     * @param title
     * @param subTitle
     * @param ISBN
     * @param authors
     * @param description
     * @param rating
     * @param imageLink
     */
    public Book(int bookId, String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.authors = authors;
        this.description = description;
        this.rating = rating;
        this.imageLink = imageLink;
       // this.frontCover = frontCover;
        this.subTitle = subTitle;
    }

    /**
     *
     */
    public Book() {
    }

    /**
     *
     * @return
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     *
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     *
     * @return
     */
    public String getAuthors() {
        return authors;
    }

    /**
     *
     * @param authors
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     */
    public String getImageLink() {
        return imageLink;
    }

    /**
     *
     * @param imageLink
     */
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    /**
     *
     * @return
     */
    public int getBookId() {
        return bookId;
    }

    /**
     *
     * @param bookId
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     *
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     *
     * @return
     */
    public Image getFrontCover() {
        return frontCover;
    }

    /**
     *
     * @param frontCover
     */
    public void setFrontCover(Image frontCover) {
        this.frontCover = frontCover;
    }

}
