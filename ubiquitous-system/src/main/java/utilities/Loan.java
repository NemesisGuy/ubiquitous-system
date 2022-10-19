/*
 *     
 * 
 */
package utilities;

import za.ac.cput.crud.Book;
import za.ac.cput.crud.User;

/**
 *
 * @author Peter B Load object, used to work with loan data.
 */
public class Loan {

    private String loanId;
    private String userId;
    private String bookId;
    private String loanFromDate;
    private String dueOnDate;
    private String returnedDate;

    /**
     *
     * @param user
     * @param book
     */
    public Loan(User user, Book book) {
        userId = user.getUserId();
        bookId = String.valueOf(book.getBookId());
        Dates dates = new Dates();

        loanFromDate = dates.getFormattedStartDate();
        dueOnDate = dates.getFormattedEndDate();
    }

    /**
     *
     * @param loanId
     * @param userId
     * @param bookId
     * @param loanFromDate
     * @param dueOnDate
     * @param returnedDate
     */
    public Loan(String loanId, String userId, String bookId, String loanFromDate, String dueOnDate, String returnedDate) {
        this.loanId = loanId;
        this.userId = userId;
        this.bookId = bookId;
        this.loanFromDate = loanFromDate;
        this.dueOnDate = dueOnDate;
        this.returnedDate = returnedDate;
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
    public String getBookId() {
        return bookId;
    }

    /**
     *
     * @param bookId
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     *
     * @return
     */
    public String getLoanFromDate() {
        return loanFromDate;
    }

    /**
     *
     * @param loanFromDate
     */
    public void setLoanFromDate(String loanFromDate) {
        this.loanFromDate = loanFromDate;
    }

    /**
     *
     * @return
     */
    public String getDueOnDate() {
        return dueOnDate;
    }

    /**
     *
     * @param dueOnDate
     */
    public void setDueOnDate(String dueOnDate) {
        this.dueOnDate = dueOnDate;
    }

    /**
     *
     * @return
     */
    public String getReturnedDate() {
        return returnedDate;
    }

    /**
     *
     * @param returnedDate
     */
    public void setReturnedDate(String returnedDate) {
        this.returnedDate = returnedDate;
    }

    /**
     *
     * @return
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     *
     * @param loanId
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

}
