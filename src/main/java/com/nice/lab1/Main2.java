package com.nice.lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class Main2 {
    public void aaaaaaaaaaaa(){}

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");


        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


      /*  for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);      //java 5
            System.out.println("s = " + s);
        }*/

       /* for (String string : strings) {
            System.out.println("string = " + string);  //java 6
        }*/

       strings.forEach(System.out::println);  //java 8
    }
}
