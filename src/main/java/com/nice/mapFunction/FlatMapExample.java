package com.nice.mapFunction;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class FlatMapExample {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(Employee.builder().salary(1000).salary(2000).salary(4000).build(),
                Employee.builder().salary(1000).salary(5000).build(),
                Employee.builder().salary(1000).build());

        IntStream salariesIntStream = employeeStream.flatMapToInt(employee -> employee.getSalaries().stream().mapToInt(value -> value));
        int sum = salariesIntStream.sum();
        System.out.println("sum = " + sum);





    }
}
