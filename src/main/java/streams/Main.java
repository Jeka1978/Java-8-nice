package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jeka on 27/05/2015.
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("jeka, baruch, niko");
        IntStream intStream = names.stream().flatMapToInt(s -> IntStream.of(s.length()));
        OptionalDouble avg = intStream.average();

        System.out.println();
    }
}
