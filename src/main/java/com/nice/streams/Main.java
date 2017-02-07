package com.nice.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        Stream<String> stringStream = strings.stream().parallel().filter(s -> s.length() < 5).sorted().sequential();
        List<String> newList = stringStream.collect(Collectors.toList());



        newList.stream().forEach(System.out::println);
        System.out.println("888");
        newList.stream().forEach(System.out::println);

        System.out.println("************");
        strings.forEach(System.out::println);
    }
}
