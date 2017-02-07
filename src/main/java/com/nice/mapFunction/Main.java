package com.nice.mapFunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        Stream<Integer> integerStream = strings.stream().map(String::length);
        integerStream.forEach(System.out::println);
    }
}
