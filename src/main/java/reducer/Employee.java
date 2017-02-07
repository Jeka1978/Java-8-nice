package reducer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static reducer.Gender.FEMALE;
import static reducer.Gender.MALE;

/**
 * Created by Jeka on 25/08/2015.
 */
public class Employee {
    private int salary;

    private String name;

    public Employee(Gender gender) {
        this.gender = gender;
    }

    public Employee(int salary, String name, Gender gender) {
        this.salary = salary;
        this.name = name;
        this.gender = gender;
    }

    public Employee(int salary, Gender gender) {
        this.salary = salary;
        this.gender = gender;
    }

    private Gender gender;

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee(String name) {

        this.name = name;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("salary=").append(salary);
        sb.append(", name='").append(name).append('\'');
        sb.append(", companyName='").append(companyName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee (10000,MALE));
        employees.add(new Employee (10000,FEMALE));
        employees.add(new Employee (5001,MALE));
        employees.add(new Employee (13000,MALE));
        employees.add( new Employee(13000,FEMALE));
        employees.add(new Employee (10000,MALE));
        employees.add( new Employee(15000,"John",FEMALE));
        employees.add( new Employee(15000,"Moshe",FEMALE));


        List<String> list = employees.stream().map(Employee::getName).filter(s -> Character.isUpperCase(s.charAt(0))).sorted().collect(Collectors.toList());


        Employee max = employees.stream().max(comparing(Employee::getSalary)).get();
        System.out.println(max);


        Map<Boolean, List<Employee>> map = employees.stream().collect(Collectors.partitioningBy(employee -> employee.getGender() == MALE));
        System.out.println(map.get(true).stream().map(Employee::getSalary).reduce(0,(a, b) ->a+b )>map.get(false).stream().map(Employee::getSalary).reduce(0, (a, b) -> a + b));


    }

    public Gender getGender() {
        return gender;
    }
}
