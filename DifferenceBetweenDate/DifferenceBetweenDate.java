// package DifferenceBetweenDate;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        // Ensure result is positive
        if (localTime2.isBefore(localTime1)) {
            return Duration.between(localTime2, localTime1);
        }
        return Duration.between(localTime1, localTime2);
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        // Ensure result is positive
        if (date2.isBefore(date1)) {
            return Period.between(date2, date1);
        }
        return Period.between(date1, date2);
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // Ensure result is positive
        long hours = Duration.between(dateTime1, dateTime2).toHours();
        return Math.abs(hours);
    }
    
     public static void main(String[] args) {
        Duration duration = DifferenceBetweenDate.durationBetweenTime(LocalTime.of(12, 54, 32), LocalTime.of(21, 23, 53));
        System.out.println(duration.toHoursPart() + "H" + duration.toMinutesPart() + "M" + duration.toSecondsPart() + "S");
        Period period = DifferenceBetweenDate.periodBetweenDate(LocalDate.of(2020, 10, 13), LocalDate.of(2022, 5, 8));
        System.out.println(period.getYears() + "Y" + period.getMonths() + "M" + period.getDays() + "D");
        System.out.println(DifferenceBetweenDate.numberOfHoursBetweenDateTime(LocalDateTime.of(2022, 4, 12, 16, 18, 56), LocalDateTime.of(2022, 5, 10, 21, 54, 56)));
    }
}
