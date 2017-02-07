package workshop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

/**
 * Created by Jeka on 05/07/2015.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2000, 1, 1);
        System.out.println(start.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println(start.until(start.with(TemporalAdjusters.lastDayOfYear())).get(ChronoUnit.DAYS));
        Stream.iterate(start, s -> s.plusDays(1)).limit(start.until(start.with(TemporalAdjusters.lastDayOfYear()), ChronoUnit.DAYS)).forEach(System.out::println);
    }



}
