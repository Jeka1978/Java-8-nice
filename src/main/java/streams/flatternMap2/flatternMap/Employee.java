package streams.flatternMap2.flatternMap;

import java.math.BigDecimal;

/**
 * Created by Jeka on 31/05/2015.
 */
public class Employee {
    private BigDecimal salary;

    public Employee(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee(int sum) {
        salary = new BigDecimal(sum);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
