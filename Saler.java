package Project.Staff;

public class Saler extends Employee {
    private double salesTarget;
    private int productsSold;

    // * Constructor */
    public Saler(String id, String name, String email, String phoneNumber, String position, double salary,
            double salesTarget) {
        super(id, name, email, phoneNumber, position, salary);
        this.salesTarget = salesTarget;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (productsSold * 1_000_000); // Calculate salary based on products sold
    }

    @Override
    public String toString() {
        return "Saler{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", salesTarget=" + salesTarget +
                ", productsSold=" + productsSold +
                '}';
    }
}
