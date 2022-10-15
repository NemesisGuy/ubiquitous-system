/*
 *     
 * 
 */
package za.ac.cput.settings;

/**
 *
 * @author Peter B
 * nemesisnet.co.za
 */

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class TimeZones{
 private String[] ids;

    /**
     *
     * @return
     */
    public String[] getIds() {
        return ids;
    }

    /**
     *
     * @param ids
     */
    public void setIds(String[] ids) {
        this.ids = ids;
    }
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      //      ArrayList<Book> bookList = new ArrayList<Book>();
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
		}
		
		System.out.println("\nTotal TimeZone ID " + ids.length);

	}

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

