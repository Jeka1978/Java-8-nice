package com.nice.mapFunction;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class CalcWordsInFile {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\temp\\yest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stream<String> lines = reader.lines();
       /* lines.forEach(System.out::println);*/

        Stream<String> words = lines.map(String::toLowerCase).flatMap(line -> Arrays.stream(line.split(" ")));
        long count = words.peek(System.out::println).filter(word -> word.equals("yesterday")).count();
        System.out.println("count = " + count);


        reader.close();
    }
}
