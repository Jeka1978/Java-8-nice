package reducer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Jeka on 31/08/2015.
 */
public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        Employee jack = new Employee("jack");
        jack.setCompanyName("google");
        Employee moshe = new Employee("Moshe");
        moshe.setCompanyName("google");

        Employee lena = new Employee("Lena");
        lena.setCompanyName("google");

        Employee stiv = new Employee("Stiv");
        stiv.setCompanyName("apple");

        Employee andrey = new Employee("Andrey");
        andrey.setCompanyName("apple");

        List<Employee> employees = Arrays.asList(jack, andrey, stiv, lena, moshe);

        Map<String, List<Employee>> companies = employees.stream().collect(Collectors.groupingBy(Employee::getCompanyName));
        System.out.println(companies);
        Map<String, Integer> map = companies.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()));
        map.entrySet().forEach(entry->{
            System.out.println("company: "+entry.getKey()+" number of workers: "+entry.getValue());
        });


    }
}
