public class Saler extends Employee {
    private int salesTarget;
    private int productsSold;

    // * Constructor */
    public Saler(String id, String name, String email, String phoneNumber, String position, double salary,
            int salesTarget,int productsSold) {
        super(id, name, email, phoneNumber, position, salary);
        this.salesTarget = salesTarget;
        this.productsSold = productsSold;
    }

    public int getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(int salesTarget) {
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

    public void toInfo(){
        System.out.println("Saler information");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("email: " + getEmail());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Sales target: " + salesTarget);
        System.out.println("Products sold: " + productsSold);
    }
}
