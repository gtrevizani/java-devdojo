package br.com.start._02_javacore._019_localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime time1 = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        System.out.println(date);
        System.out.println(time);
        System.out.println(time1);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
