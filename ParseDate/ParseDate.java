import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
           // Example: "09 heures du soir, 07 minutes et 23 secondes" -> Custom parsing
        String[] parts = stringDate.split(", ");
        int hours = Integer.parseInt(parts[0].split(" ")[0]);
        int minutes = Integer.parseInt(parts[1].split(" ")[0]);
        int seconds = Integer.parseInt(parts[2].split(" ")[0]);

        if (stringDate.contains("soir") && hours < 12) {
            hours += 12;
        }
        return LocalTime.of(hours, minutes, seconds);
    }

}
