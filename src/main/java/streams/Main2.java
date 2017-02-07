package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by Jeka on 31/05/2015.
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "b", "X");
        OptionalDouble avg = names.stream()
                .flatMapToInt(s -> IntStream.of(s.length())).average();
        System.out.println("avg = " + avg);

    }
}
