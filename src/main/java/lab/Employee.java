package lab;

import java.util.List;

/**
 * Created by Jeka on 16/08/2015.
 */
public class Employee {
    private String name;
    private Company company;
    private Insurance insurance;
    private List<String> childrenNames;

    public List<String> getChildrenNames() {
        return childrenNames;
    }

    public Employee(String name, List<String> childrenNames) {

        this.name = name;
        this.childrenNames = childrenNames;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Company company, Insurance insurance) {
        this.name = name;
        this.company = company;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company=" + company +
                ", insurance=" + insurance +
                '}';
    }
}
