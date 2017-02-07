package myStream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Jeka on 01/09/2015.
 */
public class PrimeNumbers {

    public static List<Integer> getWedNumbersOldSchool(int howMuch) {
        ArrayList<Integer> primes = new ArrayList<>();
        int candidate = 1;
        while (primes.size()<howMuch){
            boolean isPrime = false;
            while (!isPrime) {
                candidate++;
                isPrime = true;
                for (int i = 2; i <= Math.sqrt(candidate); i++) {
                    if (candidate % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            primes.add(candidate);
        }
        return primes;
    }


    public static Stream<Integer> getPrimeNumbersWithIteratorSpliterator() {
        Iterator<Integer> primeNumIterator = new Iterator<Integer>() {

            private int last=1;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                boolean isPrime = false;
                int candidate=last;
                while (!isPrime) {
                    candidate++;
                    isPrime=true;
                    for (int i = 2; i <= Math.sqrt(candidate); i++) {
                        if (candidate % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                last = candidate;
                return candidate;
            }

        };
        Spliterator<Integer> spliterator = Spliterators.spliterator(primeNumIterator, Integer.MAX_VALUE,
                 Spliterator.NONNULL | Spliterator.IMMUTABLE);

        return StreamSupport.stream(spliterator, true);
    }

    public static Stream<Integer> getWedNumbers() {
        return Stream.iterate(0, i -> i + 2);
    }

    public static Stream<Integer> getPrimeNumbersWithIterate(){
        return Stream.iterate(2,num -> {
            boolean isPrime = false;
            int candidate=num;
            while (!isPrime) {
                candidate++;
                isPrime=true;
                for (int i = 2; i <= Math.sqrt(candidate); i++) {
                    if (candidate % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            return candidate;
        });
    }

    public static Stream<Integer> getPrimeNumbersWithGenerate(){
       return Stream.generate(new Supplier<Integer>() {
           public Integer num = 1;

           @Override
           public Integer get() {
               num = nextPrimeNumber(++num);
               return num;
           }

           private Integer nextPrimeNumber(Integer num) {
               while (!isPrime(num)) {
                   num++;
               }
               return num;

           }

           private boolean isPrime(Integer num) {
               for (int i = 2; i <= Math.sqrt(num); i++) {
                   if (num % i == 0) {
                       return false;
                   }
               }
               return true;
           }


       });
    }


    public static void main(String[] args) {
        List<Integer> list = getPrimeNumbersWithIteratorSpliterator().parallel().limit(10).collect(Collectors.toList());

        System.out.println(list);
    }
}
