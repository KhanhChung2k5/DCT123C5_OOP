package Project.Staff;

public class Manager extends Employee {
    private String department;
    private double salaryCoefficient;

    // * Constructor */
    public Manager(String id, String name, String email, String phoneNumber, String position, double salary,
            String department, double salaryCoefficient) {
        super(id, name, email, phoneNumber, position, salary);
        this.department = department;
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public double calculateSalary() {
        return Employee.calculateSalaryByCoefficient(getSalary(), salaryCoefficient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    sb.append("+------------------------+------------------------------+\n");
    sb.append("|         Field          |            Value            |\n");
    sb.append("+------------------------+------------------------------+\n");
    sb.append(String.format("| %-22s | %-28s |\n", "ID", getId()));
    sb.append(String.format("| %-22s | %-28s |\n", "Name", getName()));
    sb.append(String.format("| %-22s | %-28s |\n", "Email", getEmail()));
    sb.append(String.format("| %-22s | %-28s |\n", "Phone Number", getPhoneNumber()));
    sb.append(String.format("| %-22s | %-28s |\n", "Position", getPosition()));
    sb.append(String.format("| %-22s | %-28.2f |\n", "Salary", getSalary()));
    sb.append(String.format("| %-22s | %-28s |\n", "Department", department));
    sb.append(String.format("| %-22s | %-28.2f |\n", "Salary Coefficient", salaryCoefficient));
    sb.append(String.format("| %-22s | %-28.2f |\n", "Total Salary", calculateSalary()));
    sb.append("+------------------------+------------------------------+");
    return sb.toString();
    }

    public void toInfo() {
        System.out.println("Manager information");
        System.out.println("ID:" + getId());
        System.out.println("Name: " + getName());
        System.out.println("email: " + getEmail());
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Department: " + department);
        System.out.println("Salary Coefficient: " + salaryCoefficient);
    }
}
