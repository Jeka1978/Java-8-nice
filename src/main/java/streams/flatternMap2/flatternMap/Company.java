package streams.flatternMap2.flatternMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeka on 31/05/2015.
 */
public class Company {
    private List<Employee> employees = new ArrayList<>();

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


}
