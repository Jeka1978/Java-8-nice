package com.nice.effectivelyFinal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");

        int x = 0;

        Collections.sort(strings,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(x);
                return 0;
            }
        });
    }
}
