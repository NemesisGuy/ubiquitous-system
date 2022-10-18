/*
 *     
 * 
 */
package utilities;

import java.time.LocalDate;

/**
 *
 * @author Peter B nemesisnet.co.za
 *
 */
public class Dates {
    //

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Dates dates = new Dates();
        System.out.println(dates.getFormattedStartDate());
        System.out.println(dates.getFormattedEndDate());

    }

    /**
     *
     * @return formatted start date as a string
     */
    public String getFormattedCurrentDate() {
        LocalDate startingDate = LocalDate.now();
        return startingDate.toString();

    }

    /**
     *
     * @return formatted start date as a string
     */
    public String getFormattedStartDate() {
        LocalDate startingDate = LocalDate.now();
        return startingDate.toString();

    }

    /**
     *
     * @return formatted end date as a string
     */
    public String getFormattedEndDate() {
        LocalDate startingDate = LocalDate.now();
        LocalDate endingDate = startingDate.plusDays(7);
        return endingDate.toString();

    }
}
