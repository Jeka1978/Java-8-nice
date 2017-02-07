package com.nice.reduceAndCollect;

import com.nice.mapFunction.Employee;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class MainForReduce {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "is", "a", "good","language");
        Optional<String> optional = stream.reduce((s1, s2) -> s1 +","+ s2);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }


        Stream<Person> personStream = Stream.of(new Person(12), new Person(18));
        int sum = personStream.mapToInt(Person::getAge).sum();
    }
}
