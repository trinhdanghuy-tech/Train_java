package javaontap.Lab4OOP.day;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class now {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
}
