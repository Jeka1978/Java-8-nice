package streams.primitives;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jeka on 23/08/2015.
 */
public class MyMath {


    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {


        Stream<Integer> stream = Stream.iterate(1, i -> 1).parallel().limit(100);
        int sum = getSum(stream);
        System.out.println(sum);


    }

    public static int getSum(Stream<Integer> stream) {
        Optional<Integer> optional = stream.reduce((x, y) -> x + y);
        return optional.get();
    }
}
