package streams;

import streams.flatternMap.Employee;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by Jeka on 17/07/2015.
 */
public class Main5 {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(1100, 1, 1);
        LocalDate end = LocalDate.of(1980, 1, 1);
        long days = ChronoUnit.DAYS.between(start, end);





        Map<Integer, Long> map = LongStream.range(0, days).mapToObj(start::plusDays).
                filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY).
                filter(date -> date.getDayOfMonth() == 13).
                collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));

        Map.Entry<Integer, Long> maxEntry = map.entrySet().stream().max((o1, o2) -> Long.compare(o1.getValue(), o2.getValue())).get();
        System.out.println(maxEntry);

        System.out.println(map);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("***************");
        Map<Integer, Long> map1 = map.entrySet().stream().filter(entry -> entry.getValue() == maxEntry.getValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("map1 = " + map1);  //all winners here

//        Stream.iterate(start, d -> d.plusDays(1)).forEach(System.out::println);
    }
}
