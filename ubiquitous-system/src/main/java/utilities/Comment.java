/*
 *     
 * 
 */
package utilities;

/**
 *
 * @author Peter B This is a Comment object used to move comment data around.
 */
public class Comment {

    /**
     *
     * @param commentId
     * @param userId
     * @param bookTitle
     * @param comment
     */
    public Comment(String commentId, String userId, String bookTitle, String comment) {
        this.commentId = commentId;
        this.userId = userId;
        this.bookTitle = bookTitle;
        this.comment = comment;
    }
    private String commentId, userId, bookTitle, comment, date;

    /**
     *
     * @return
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     *
     * @param commentId
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     *
     * @param bookTitle
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

}
