package reducer;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by Jeka on 25/08/2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10));
        employees.add(new Employee(20));
        employees.add(new Employee(50));
        employees.add(new Employee(30));

        long count = employees.stream().map(Employee::getSalary).count();
        System.out.println(count);
        ArrayList<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee(8000, "Avishay"));
        employees2.add(new Employee(8000, "Avishay"));
        employees2.add(new Employee(15000, "Hirs"));
        employees2.add(new Employee(15000, "mirsh"));
        employees2.add(new Employee(5000, "mvirsh"));

     ImmutableList<Employee> list = employees2.stream().collect(collectingAndThen(toList(),ImmutableList::copyOf));

        printSeniority(employees2);
        System.out.println();


    }

    public static void printSeniority(List<Employee> employees) {
        Optional<String> str = employees.stream().map(Employee::getName).reduce((name1, name2) -> name1 + ", " + name2);
        System.out.println(str.get());

        String s = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(s);


        Map<Seniority, List<Employee>> map = employees.stream().collect(groupingBy(employee -> Seniority.whoAreYou(employee.getSalary())));
        Map<Seniority, Integer> map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()));

        System.out.println(map1);
//        Optional<Map.Entry<Seniority, List<Employee>>> optional = map.entrySet().stream().collect(Collectors.<Map.Entry<Seniority, List<Employee>>>maxBy((o1, o2) -> o1.getValue().size() - o2.getValue().size()));


//        System.out.println(optional.get().getKey());
    }


}
