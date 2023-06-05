import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class UtilityMethod {
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static Random rnd = new Random();
    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail(String domain){
        String email = randomString(5).concat(domain);
        return email;
    }
    public static String getCurrentDateWithUserDefinedFormat(String dateFormat) {
        Date date = new Date();
        SimpleDateFormat dFormat = new SimpleDateFormat(dateFormat);
        String output = dFormat.format(date).toString();
        return output;
    }

    public static String getPastDateWithDefinedFormat(String dateFormat){
        String date = null;
        DateTime dateTime = new DateTime();
            date = dateTime.minusDays(1).toDateTime(DateTimeZone.UTC).toString();
        return date;
    }
    public static String getFutureDateTier1WithDefinedFormat(String dateFormat) {
        String date = null;
        DateTime dateTime = new DateTime();
        date = dateTime.plusDays(4).toDateTime(DateTimeZone.UTC).toString();
        return date;
    }

    public static String getFutureDateTier2WithDefinedFormat(String dateFormat) {
        String date = null;
        DateTime dateTime = new DateTime();
        date = dateTime.plusDays(12).toDateTime(DateTimeZone.UTC).toString();
        return date;
    }

    public static String getFutureDateTier3WithDefinedFormat(String dateFormat) {
        String date = null;
        DateTime dateTime = new DateTime();
        date = dateTime.plusDays(25).toDateTime(DateTimeZone.UTC).toString();
        return date;
    }
}
