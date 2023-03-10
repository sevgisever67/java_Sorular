package DateTime;

import java.time.LocalDateTime;
import java.util.Locale;

public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime saat1 = java.time.LocalTime.of(8 ,14);
        System.out.println(saat1); //  14:15

        System.out.println(saat1.toNanoOfDay());
        System.out.println(saat1.getHour());
        saat1.plusMinutes(10);
        System.out.println(saat1.minusMinutes(1).withMinute(10));
        System.out.println(saat1.withMinute(0).withNano(0));
    }
}
