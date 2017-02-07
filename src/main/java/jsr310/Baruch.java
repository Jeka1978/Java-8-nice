package jsr310;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.LocalDate.*;

/**
 * Created by Jeka on 02/07/2015.
 */
public class Baruch {
    public static void main(String[] args) {
       /* LocalDate firstDay = now().with(firstDayOfYear());
        Stream.iterate(firstDay, d -> d.plusDays(1))
                .limit(firstDay.until(now().with(lastDayOfYear()), ChronoUnit.DAYS))
                .filter(yearDate -> yearDate.getDayOfWeek() == FRIDAY)
                .filter(yearDate -> yearDate.getDayOfMonth() == 13)
                .forEach(System.out::println);*/

        System.out.println(Stream.iterate("java", String::toUpperCase));
    }
}