
package infoacademy;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
public class Curs5 {
    public static void main(String[] args) {
        Year y1=Year.now();
        System.out.println(y1);
        System.out.println(y1.plusYears(10));
        
        YearMonth ym1 = YearMonth.now();
        System.out.println(ym1);
        System.out.println(ym1.plusYears(2).plusMonths(3));
        System.out.println(ym1.withYear(3004).lengthOfYear());
        
        LocalDate ld1 = LocalDate.of(2000, Month.MARCH, 23);
        Month m = ld1.getMonth();
        System.out.println(m);
        Locale RO = new Locale("ro", "RO'");
        System.out.println(m.getDisplayName(TextStyle.FULL, RO));
        
        DayOfWeek dow1 = ld1.getDayOfWeek();
        System.out.println(dow1.getDisplayName(TextStyle.FULL, RO));
        
        Duration d1 = Duration.ofDays(4);
        
        Period p1 = Period.ofDays(4);
        System.out.println(ld1.plus(p1));
        
        
        
        System.out.println(ld1);
    //    System.out.println(ld1.format(DateTimeFormatter.ofPattern("d M Y"), RO));
    }
    
}
