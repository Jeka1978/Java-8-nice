package lab;

/**
 * Created by Jeka on 16/08/2015.
 */
public class Company {
    private String name;
    private int revenue;

    public Company(String name, int revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
