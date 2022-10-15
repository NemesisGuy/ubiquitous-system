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
 // Book constructor with no parameters

    /**
     *
     */
    public Book() {
    }
    // Book constructor with parameters : bookId, title, subTitle, ISBN, authors, description, rating, imageLink
    // Book constructor with signature : public Book(int bookId, String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink);

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
        this.frontCover = frontCover;
        this.subTitle = subTitle;
    }
    // Book constructor with parameters : title, subTitle, ISBN, authors, description, rating, imageLink
    // Book constructor with signature : public Book(String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink);

    /**
     *
     * @param title
     * @param subTitle
     * @param ISBN
     * @param authors
     * @param description
     * @param rating
     * @param imageLink
     */
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
    // Book constructor with parameters : title, subTitle, ISBN, authors, description, rating, imageLink/
    // Book constructor with signature : public Book(String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink);

    /**
     *
     * @param title
     * @param subTitle
     * @param authors
     * @param description
     * @param rating
     * @param imageLink
     */
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


    //getSubTitle() method with return type : String subtile
    // signature : public String getSubTitle();

    /**
     *
     * @return
     */

    public String getSubTitle() {
        return subTitle;
    }
    //setSubTitle() method with parameter :   String subTitle

    /**
     *
     * @param subTitle
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    //getauthors() method with return type : String authors

    /**
     *
     * @return
     */
    public String getAuthors() {
        return authors;
    }
    //setauthors() method with parameter :  String authors

    /**
     *
     * @param authors
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    //getdescription() method with return type : String description

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }
    //setdescription() method with parameter :  String description

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    //getrating() method with return type : String rating

    /**
     *
     * @return
     */
    public String getRating() {
        return rating;
    }
    //setrating() method with parameter :  String rating

    /**
     *
     * @param rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
    //getimageLink() method with return type : String imageLink

    /**
     *
     * @return
     */
    public String getImageLink() {
        return imageLink;
    }
    //setimageLink() method with parameter :  String imageLink

    /**
     *
     * @param imageLink
     */
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    //getbookId() method with return type : int bookId

    /**
     *
     * @return
     */
    public int getBookId() {
        return bookId;
    }
    //setbookId() method with parameter :  int bookId

    /**
     *
     * @param bookId
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    //gettitle() method with return type : String title

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }
    //settitle() method with parameter :  String title

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    //getISBN() method with return type : String ISBN

    /**
     *
     * @return
     */
    public String getISBN() {
        if (ISBN == null)   //
        {
          ISBN = "book isbn getter set this";   //
        }
        return ISBN;
    }
    //setISBN() method with parameter :  String ISBN

    /**
     *
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //getfrontCover() method with return type : Image frontCover

    /**
     *
     * @return
     */
    public Image getFrontCover() {
        return frontCover;
    }
    //setfrontCover() method with parameter :  Image frontCover

    /**
     *
     * @param frontCover
     */
    public void setFrontCover(Image frontCover) {
        this.frontCover = frontCover;
    }

}
