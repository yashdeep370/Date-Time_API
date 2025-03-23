import java.util.*;
public class gregorian {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        // System.out.println(cal.get(Calendar.YEAR));
        // System.out.println(cal.isLeapYear(2023));
        TimeZone tz = cal.getTimeZone();
        // System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
    }
}
