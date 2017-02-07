package streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jeka on 14/07/2015.
 */
public class Main3 {
    public static void main(String[] args) {
        IntStream.iterate(1, n -> n + 1)
                .peek(n -> {
                    // doActionOn(n)
                   System.out.println(n);
                })
                .allMatch(n -> n < 9);

    }
}
