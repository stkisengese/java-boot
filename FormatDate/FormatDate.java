import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
    public static String formatToFullText(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Le d MMMM de lan yyyy à HHhmmm et sss, Locale.FRENCH);
        return dateTime.format(formatter);
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(MMMM dd yy, Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(HH:mm:ss.SSSSSSS);
        return time.format(formatter);
    }
}

