package pack.corejava.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting: " + now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTimeFormatter.format(now);
        System.out.println("After Formatting: " + formattedDateTime);
    }
}
