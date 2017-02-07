package com.nice.streams;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        strings.parallelStream().sequential().forEach(s -> {
            System.out.println(s);
            throw new RuntimeException("problem!");
        });


    }
}
