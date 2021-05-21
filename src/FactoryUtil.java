import java.time.LocalDateTime;

public class FactoryUtil {

    public static LocalDateTime getDate() {
        int dayOfMonth = (int) (Math.random() * 28) + 1;
        int month = (int) (Math.random() * 12) + 1;
        int year = (int) (Math.random() * 22) + 2000;
        int hour = (int) (Math.random() * 24);
        int minutes = (int) (Math.random() * 60);
        int seconds = (int) (Math.random() * 60);
        return LocalDateTime.of(year, month, dayOfMonth, hour, minutes, seconds);
    }

}
