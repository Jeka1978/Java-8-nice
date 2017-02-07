package jsr310;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Jeka on 29/06/2015.
 */
public class Main {
    public static void main(String[] args) {

        String str = "java";
        str.toUpperCase();

        ArrayList<LocalDate> localDates = new ArrayList<>();
        LocalDate start = LocalDate.of(2010, 1, 1);
        LocalDate end = LocalDate.of(2016, 1, 1);
        while (!start.equals(end)) {
            localDates.add(start);
            start = start.plusWeeks(1);
        }
        List<LocalDate> dates = localDates.stream().filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY).
                filter(localDate -> localDate.getDayOfMonth() == 13).collect(Collectors.toList());

        dates.forEach(System.out::println);

    }
}
