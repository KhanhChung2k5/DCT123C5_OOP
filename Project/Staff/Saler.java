package Project.Staff;

public class Saler extends Employee {
    private int salesTarget;
    private int productsSold;

    // * Constructor */
    public Saler(String id, String name, String email, String phoneNumber, String position, double salary,
            int salesTarget, int productsSold) {
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

    public int getProductsSold() {
        return productsSold;
    }

    public void setProductsSold(int productsSold) {
        this.productsSold = productsSold;
    }

    @Override
    public double calculateSalary() {
        return Employee.calculateSalaryByKPI(getSalary(), productsSold); // Calculate salary based on products sold
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("| %-22s | %-28d |\n", "Sales Target", salesTarget));
        sb.append(String.format("| %-22s | %-28d |\n", "Products Sold", productsSold));
        sb.append("+------------------------+------------------------------+");
        return sb.toString();
    }

    public void toInfo() {
        System.out.println("Saler information");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("email: " + getEmail());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Sales target: " + salesTarget); // update getSalerTarget vs getProductSold
        System.out.println("Products sold: " + productsSold); // ko co get ban dau
    }
}
