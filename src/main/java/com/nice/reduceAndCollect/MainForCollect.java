package com.nice.reduceAndCollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class MainForCollect {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = strings.stream().map(String::toLowerCase).collect(Collectors.toSet());
        System.out.println(set);
    }
}
