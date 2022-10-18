/*
 *     
 * 
 */
package za.ac.cput.settings;

/**
 *
 * @author Peter B nemesisnet.co.za
 */
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * write user documentation for the class
 *
 * @apiNote This class sets the time zone. It is used to set the time zone. This class is intended to be used to set the time zone. This class sets the time zone. It is used to set the time zone. This class is intended to be used to set the time zone.
 *
 * @author Admin
 */
public class TimeZones {

    private String[] ids;

    /**
     *
     * @return - Returns the time zone ids.
     */
    public String[] getIds() {
        return ids;
    }

    /**
     *
     * @param ids - The time zone ids.
     */
    public void setIds(String[] ids) {
        this.ids = ids;
    }

    /**
     *
     * @param args - The command line arguments for the application.
     */
    public static void main(String[] args) {
        //      ArrayList<Book> bookList = new ArrayList<Book>();
        String[] ids = TimeZone.getAvailableIDs();
        for (String id : ids) {
            System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
        }

        System.out.println("\nTotal TimeZone ID " + ids.length);

    }

    /**
     *
     * @param tz - The time zone.
     * @return - Returns the time zone.
     * @apiNote This method displays the time zone. It is used to display the time zone. This method is intended to be used to display the time zone.
     */
    private static String displayTimeZone(TimeZone tz) {

        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
                - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours > 0) {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        } else {
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }

        return result;

    }

}
