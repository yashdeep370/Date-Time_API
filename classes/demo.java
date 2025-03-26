
import java.time.*;


public class demo {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        // ZonedDateTime zdt = ZonedDateTime.now();
        // ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        // OffsetDateTime odt = OffsetDateTime.now();
        // MonthDay md = MonthDay.now();
        // System.out.println(zdt);
        
        // Period p = Period.of(1, 2, 3);
        // System.out.println(p.addTo(LocalDate.now()));
        
        Instant i = Instant.now();//greenwich time
        System.out.println(i);

    }    
}
