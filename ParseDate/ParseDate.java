import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    
    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        try {
            // Try parsing as French first
            DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
            try {
                return LocalDate.parse(stringDate, frenchFormatter);
            } catch (DateTimeParseException e) {
                // If French fails, try English
                DateTimeFormatter englishFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.ENGLISH);
                return LocalDate.parse(stringDate, englishFormatter);
            }
        } catch (DateTimeParseException e) {
            return null;
        }
    }


    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }

        try {
            // Replace " and " with ", " for consistent splitting
            String normalized = stringDate.replace(" and ", ", ");
            String[] parts = normalized.split(", ");

            // Extract hour
            String hourPart = parts[0];
            int hour = Integer.parseInt(hourPart.split(" ")[0]);

            // Extract minute
            String minutePart = parts[1];
            int minute = Integer.parseInt(minutePart.split(" ")[0]);

            // Extract second
            String secondPart = parts[2];
            int second = Integer.parseInt(secondPart.split(" ")[0]);

            // Adjust for "soir" (PM) or "morning" (AM)
            if (hourPart.contains("soir") || hourPart.contains("PM") || hourPart.contains("evening")) {
                hour += 12;
            }

            return LocalTime.of(hour, minute, second);
        } catch (Exception e) {
            return null;
        }
    }

}
