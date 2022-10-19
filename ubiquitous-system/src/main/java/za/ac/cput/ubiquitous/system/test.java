/*
 *     
 * 
 */
package za.ac.cput.ubiquitous.system;

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
        Update update = new Update();
        Loan loan = new Loan("2", " ", " ", " ", " ", " ");
        //   update.updateLoan(loan);
        Book b = new Book();
        b.setBookId(0);

        //   Loan l = read.readLatestLaonByBookId(b);
        //    System.err.println("due back on the : " + l.getDueOnDate());
        User u = new User();
        u.setUserId("18");
        read.readUserLoanByUserId(u);

        Loan l = read.readUserLoanByBookTitle("8", "6");
        System.out.println(l.getLoanId());;

    }
}
