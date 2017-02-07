package com.nice.lab1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        DuplicateCalcService calcService = new DuplicateCalcService();

        int counter = calcService.calcDuplicates("java", strings, (t1, t2) -> {
            System.out.println("I'm working");
            return t1.equalsIgnoreCase(t2);
        });
        System.out.println("counter = " + counter);

    }
}
