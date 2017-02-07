package biglab;

/**
 * Created by Jeka on 04/09/2015.
 */
public class Sale {
    private Product product;
    private Employee employee;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sale{");
        sb.append("product=").append(product);
        sb.append(", employee=").append(employee);
        sb.append('}');
        return sb.toString();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Sale(Product product, Employee employee) {

        this.product = product;
        this.employee = employee;
    }
}
