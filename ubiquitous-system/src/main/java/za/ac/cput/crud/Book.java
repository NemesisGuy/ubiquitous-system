/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.awt.Image;

/**
 *
 * @author Peter Buckingham
 *
 * Book object, used to work with book data. Use as a POJO. To pass data to and from the database use the User Interface.
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
    // 

    /**
     *
     * Book constructor with no parameters
     */
    public Book() {
    }

    // 
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
    /**
     * Book constructor with parameters : bookId, title, subTitle, ISBN, authors, description, rating, imageLink Book constructor with signature : public Book(int bookId, String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink);
     *
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
    public Book(String title, String subTitle, String ISBN, String authors, String description, String rating, String imageLink) {
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
    public Book(String title, String subTitle, String authors, String description, String rating, String imageLink) {
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
     * @return subTitle of type String This method is used to get the subTitle of the book. This method returns the subTitle of the book.
     *
     */
    public String getSubTitle() {
        return subTitle;
    }
    //setSubTitle() method with parameter :   String subTitle

    /**
     *
     * @param subTitle the subTitle to setSubTitle This method is used to set the subTitle of the book. This method sets the subTitle of the book.
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    //getauthors() method with return type : String authors

    /**
     *
     * @return authors of type String This method is used to get the authors of the book. This method returns the authors of the book.
     */
    public String getAuthors() {
        return authors;
    }
    //setauthors() method with parameter :  String authors

    /**
     *
     * @param authors the authors to setauthors This method is used to set the authors of the book. This method sets the authors of the book.
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    //getdescription() method with return type : String description

    /**
     *
     * @return description of type String This method is used to get the description of the book. This method returns the description of the book.
     */
    public String getDescription() {
        return description;
    }
    //setdescription() method with parameter :  String description

    /**
     *
     * @param description the description to setdescription This method is used to set the description of the book. This method sets the description of the book.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    //getrating() method with return type : String rating

    /**
     *
     * @return rating of type String This method is used to get the rating of the book. This method returns the rating of the book.
     */
    public String getRating() {
        return rating;
    }
    //setrating() method with parameter :  String rating

    /**
     *
     * @param rating the rating to setrating This method is used to set the rating of the book. This method sets the rating of the book.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
    //getimageLink() method with return type : String imageLink

    /**
     *
     * @return imageLink of type String This method is used to get the imageLink of the book. This method returns the imageLink of the book.
     *
     */
    public String getImageLink() {
        return imageLink;
    }
    //setimageLink() method with parameter :  String imageLink

    /**
     *
     * @param imageLink the imageLink to setimageLink This method is used to set the imageLink of the book. This method sets the imageLink of the book.
     */
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    //getbookId() method with return type : int bookId

    /**
     *
     * @return bookId of type int This method is used to get the bookId of the book. This method returns the bookId of the book.
     */
    public int getBookId() {
        return bookId;
    }
    //setbookId() method with parameter :  int bookId

    /**
     *
     * @param bookId the bookId to setbookId This method is used to set the bookId of the book. This method takes the bookId of the book and sets it.
     *
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    //gettitle() method with return type : String title

    /**
     *
     * @return title of type String This method is used to get the title of the book. This method returns the title of the book.
     */
    public String getTitle() {
        return title;
    }
    //settitle() method with parameter :  String title

    /**
     *
     * @param title the title to settitle This method is used to set the title of the book. This method sets the title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    //getISBN() method with return type : String ISBN

    /**
     *
     * @return ISBN of type String This method is used to get the ISBN of the book. This method returns the ISBN of the book.
     */
    public String getISBN() {
        if (ISBN == null) //
        {
            ISBN = " ";   //
        }
        return ISBN;
    }
    //setISBN() method with parameter :  String ISBN

    /**
     *
     * @param ISBN set ISBN
     *
     * This method is used to set the ISBN of the book. This method sets the ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    //getfrontCover() method with return type : Image frontCover

    /**
     *
     * @return frontCover of type Image This method is used to get the frontCover of the book. This method returns the frontCover of the book.
     *
     */
    public Image getFrontCover() {
        return frontCover;
    }
    //setfrontCover() method with parameter :  Image frontCover

    /**
     *
     * @param frontCover set the frontCover with setfrontCover This method is used to set the frontCover of the book. This method sets the frontCover of the book.
     */
    public void setFrontCover(Image frontCover) {
        this.frontCover = frontCover;
    }

}
