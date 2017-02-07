package biglab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * Created by Jeka on 04/09/2015.
 */
public class SalesService {
    public static Employee findBestEmployee(List<Sale> sales) {
        Map<Employee, List<Sale>> map = sales.stream().collect(Collectors.groupingBy(Sale::getEmployee, Collectors.toList()));
        System.out.println(map);
        Map<Employee, Integer> map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().mapToInt(sale -> sale.getProduct().getPrice()).sum()));
//        Map<Employee, Integer> map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().map(sale -> sale.getProduct().getPrice()).reduce((integer, integer2) -> integer+integer2).get()));
        System.out.println(map1);
        Employee employee = map1.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
        System.out.println(employee);

        return employee;
    }
    public static List<Employee> findBestEmployees(List<Sale> sales) {
        Map<Employee, List<Sale>> map = sales.stream().collect(Collectors.groupingBy(Sale::getEmployee, Collectors.toList()));
        Map<Employee, Integer> map1 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream().mapToInt(sale -> sale.getProduct().getPrice()).sum()));
        int maxSalesPrice  = map1.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getValue();
        List<Employee> employees = map1.entrySet().stream().filter(employeeEntry -> employeeEntry.getValue() == maxSalesPrice).map(Map.Entry::getKey).collect(Collectors.toList());
        return employees;
    }

    public static void main(String[] args) {
        Product inteij = new Product("inteij", 700);
        Product laptop = new Product("laptop", 120);
        Product table = new Product("table", 100);
        Product bed = new Product("bed", 200);
        Product car = new Product("car", 500);
        Employee john = new Employee("John");
        Employee rivka = new Employee("Rivka");
        Employee jack = new Employee("Jack");
        ArrayList<Sale> sales = new ArrayList<>();
        sales.add(new Sale(table, jack));
        sales.add(new Sale(laptop, jack));
        sales.add(new Sale(table, jack));
        sales.add(new Sale(table, jack));
        sales.add(new Sale(bed, jack));
        sales.add(new Sale(bed, john));
        sales.add(new Sale(car, john));
        sales.add(new Sale(inteij, rivka));
        Employee bestEmployee = findBestEmployee(sales);
        System.out.println(findBestEmployees(sales));


    }
}
