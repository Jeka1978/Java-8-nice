package streams;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jeka on 14/07/2015.
 */
public class Main4 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1900, 1, 1);
        LocalDate end = LocalDate.of(1980, 1, 1);
        long numberOfYears = ChronoUnit.YEARS.between(start, end);
        Map<Integer, Long> map = Stream.iterate(start, d -> d.plusYears(1)).limit(numberOfYears).flatMap(date -> Stream.iterate(date, d -> d.plusDays(1)).limit(365)).
                filter(d -> d.getDayOfWeek() == DayOfWeek.FRIDAY).filter(d -> d.getDayOfMonth() == 13).
                collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));

        System.out.println(map);

        Optional<Map.Entry<Integer, Long>> entry = map.entrySet().stream().collect(Collectors.maxBy((o1, o2) -> (int) (o1.getValue() - o2.getValue())));
        System.out.println(entry.get().getKey());

        Optional<Map.Entry<Integer, Long>> entry2 = map.entrySet().stream().max((o1, o2) -> Long.compare(o1.getValue(), o2.getValue()));
        System.out.println(entry2.get().getKey());

        List<Map.Entry<Integer, Long>> list = map.entrySet().stream().filter(x -> x.getValue() == entry.get().getValue()).collect(Collectors.toList());
        System.out.println("list = " + list);

        Map<Long, Long> map1 = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));
        System.out.println("map1 = " + map1);

//        Stream.iterate(start,d->d.plusDays(1)).limit(numberOfDays).filter(d->d.getDayOfWeek()== DayOfWeek.FRIDAY).filter(d->d.getDayOfMonth()==13).map(d->d.getYear())

    }
}
