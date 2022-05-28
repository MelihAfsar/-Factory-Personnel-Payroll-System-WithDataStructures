package SomeFunctions;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MELIH AFSAR
 */
public class DateFunction {
    public static String date() throws ParseException {
        Date presentTense = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        return df.format(presentTense);
    }
}