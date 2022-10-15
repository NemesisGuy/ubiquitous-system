/*
 *     
 * 
 */
package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Peter B
 */
public class Dates {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        
        Dates dates = new Dates();
        System.out.println(dates.getFormattedStartDate());
        System.out.println(dates.getFormattedEndDate());        
        
    }

    /**
     *
     * @return
     */
    public String getFormattedCurrentDate() {
        LocalDate startingDate = LocalDate.now();
        return startingDate.toString();
        
    }

    /**
     *
     * @return
     */
    public String getFormattedStartDate() {
        LocalDate startingDate = LocalDate.now();
        return startingDate.toString();
        
    }
    
    /**
     *
     * @return
     */
    public String getFormattedEndDate() {
        LocalDate startingDate = LocalDate.now();
        LocalDate endingDate = startingDate.plusDays(7);
        return endingDate.toString();
        
    }
}
