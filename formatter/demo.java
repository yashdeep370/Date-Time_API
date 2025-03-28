
import java.time.*;
import java.time.temporal.ChronoField;;




public class demo {
    public static void main(String[] args) {
        // ZonedDateTime now = ZonedDateTime.now();
        
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // System.out.println(formatter.format(now));
    
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.get(ChronoField.YEAR));
    }
}
