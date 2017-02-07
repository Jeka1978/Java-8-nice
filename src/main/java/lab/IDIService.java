package lab;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

/**
 * Created by Jeka on 16/08/2015.
 */
public class IDIService {

    public void printIDIClients2(List<Employee> employees) {
        Stream<Employee> s1 = employees.stream();
        Stream<Employee> s2 = s1.filter(employee -> employee.getInsurance() == Insurance.IDI);
        Stream<Company> s3 = s2.map(Employee::getCompany);
        Stream<Company> s4 = s3.sorted(comparing(Company::getRevenue));
        Stream<Object> s5 = s4.map(company -> {
            throw new RuntimeException("PROBLEM");
        });
        Stream<Object> s6 = s5.distinct();
        s6.forEach(System.out::println);



    }

    public void printIDIClients(List<Employee> employees) {

        Employee emp1 = new Employee("Nisan");
        Employee emp2 = new Employee("Eldad");



        Collection<Employee> data = new ArrayList<>();

       data.parallelStream()
               .forEach(employee -> processEmployee(employee));


        Set<Company> companies = new HashSet<>();
        for (Employee employee : employees) {
            if (employee.getInsurance() == Insurance.IDI) {
                companies.add(employee.getCompany());
            }
        }
        ArrayList<Company> sorted = new ArrayList<>(companies);
        Collections.sort(sorted, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return Integer.compare(o1.getRevenue(), o2.getRevenue());
            }
        });
        for (Company company : sorted) {
            System.out.println(company.getName());
        }
    }

    private void processEmployee(Employee employee) {

    }


    public static void main(String[] args) {
        Company google = new Company("Google", 10);
        Company ebay = new Company("Ebay", 7);
        Company jFrog = new Company("JFrog", 2);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jack", jFrog, Insurance.IDI));
        employees.add(new Employee("Bob", google, Insurance.IDI));
        employees.add(new Employee("Marina", ebay, Insurance.AIG));
        employees.add(new Employee("Alex", ebay, Insurance.AIG));
        employees.add(new Employee("Baruch", jFrog, Insurance.IDI));
        employees.add(new Employee("Shlomi", jFrog, Insurance.AIG));
        employees.add(new Employee("Or", ebay, Insurance.IDI));
        employees.add(new Employee("Sam", google, Insurance.AIG));
        employees.add(new Employee("Frodo", google, Insurance.AIG));

        IDIService service = new IDIService();
        service.printIDIClients2(employees);


    }
}
