import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {

    public static void main(String args[]) {

        //create new java.util.Date object
        Date date = new Date();

    /*
     * To convert java.util.Date to String, use SimpleDateFormat class.
     */

    /*
     * crate new SimpleDateFormat instance with desired date format.
      * We are going to use yyyy-mm-dd hh:mm:ss here.
     */
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        //to convert Date to String, use format method of SimpleDateFormat class.
        String strDate = dateFormat.format(date);

        System.out.println("converted Date to String: " + strDate);

    }
}
