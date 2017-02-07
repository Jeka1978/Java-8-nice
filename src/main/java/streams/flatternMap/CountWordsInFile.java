package streams.flatternMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * Created by Jeka on 02/09/2015.
 */
public class CountWordsInFile {

    public static Stream<Character> stringStream(String str) {
//        return Stream.iterate(str.charAt(0)->str.charAt(1))
        return null;
    }


    public static Set<String> count(File file) throws Exception {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        Stream<String> lines = reader.lines();
        Map<String, Long> map = lines.
                flatMap(s -> Arrays.stream(s.split(" "))).
                filter(s -> s.length() > 2).
                map(String::toLowerCase).
                collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()));
        Map.Entry<String, Long> maxEntry = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

        Map<String, Long> mostPopularWordsMap = map.entrySet().stream().filter(entry -> entry.getValue() == maxEntry.getValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        fileReader.close();
        reader.close();
        return mostPopularWordsMap.keySet();

    }

    public static void main(String[] args) throws Exception {


        System.out.println(count(new File("c:\\temp\\a.txt")));

    }
}
