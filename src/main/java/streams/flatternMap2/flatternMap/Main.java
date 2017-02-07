package streams.flatternMap2.flatternMap;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Jeka on 31/05/2015.
 */
public class Main {
    public static void main(String[] args) {
        Company epam = new Company(Arrays.asList(new Employee(100), new Employee(200), new Employee(300)));
        Company google = new Company(Arrays.asList(new Employee(1000), new Employee(2000), new Employee(3000)));
        Company amdocs = new Company(Arrays.asList(new Employee(10000), new Employee(20000), new Employee(30000)));

        BigDecimal sum = epam.getEmployees().stream().map(Employee::getSalary).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("sum = " + sum);

        List<Company> companies = Arrays.asList(epam, google, amdocs);
        BigDecimal total = companies.stream().flatMap(company -> company.getEmployees().stream()).map(Employee::getSalary).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("total = " + total);
    }
}
