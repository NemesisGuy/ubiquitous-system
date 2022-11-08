/*
 *     
 * 
 */
package za.ac.cput.ubiquitous.system;

import java.util.ArrayList;
import utilities.Loan;
import za.ac.cput.crud.Book;
import za.ac.cput.crud.Read;
import za.ac.cput.crud.Update;
import za.ac.cput.crud.User;

/**
 *
 * @author Peter B
 */
public class test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Read read = new Read();
        read.readUserCurrentLaon("8");
        read.readLaonByBookId("0");
        //     Update update = new Update();
        //    Loan loan = new Loan("2", " ", " ", " ", " ", " ");
        //   update.updateLoan(loan);
        Book book = new Book();
        book.setBookId(1);

        //   Loan loan = read.readLatestLaonByBookId(book);
        //    System.err.println("due back on the : " + loan.getDueOnDate());
        //   User user = new User();
        //  user.setUserId("18");
        //  read.readUserLoansByUserId(user);
        ArrayList<Loan> loanList = new ArrayList<Loan>();
       // loanList = read.readUserLoansByUserIdAndBookId("8", "6");//UserID,BookID
        loanList = read.readUserLoansByUserId("8");//UserID,BookID
        // Loan loan = read.readUserLoanByUserIdAndBookId("8", "6");//UserID,BookID
        int loanCount = 0;
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (Loan loan : loanList) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Loan Number : " + ++loanCount);
            System.out.println("Loan ID : " + loan.getLoanId());
            System.out.println("User ID : " + loan.getUserId());
            System.out.println("Book ID : " + loan.getBookId());
            System.out.println("Loan Date : " + loan.getLoanFromDate());
            System.out.println("Due Date : " + loan.getDueOnDate());
            System.out.println("Return Date : " + loan.getReturnedDate());
            System.out.println("--------------------------------------------------------------------------");

        }

    }
}
