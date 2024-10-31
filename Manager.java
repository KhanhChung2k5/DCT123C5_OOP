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
        return getSalary() * salaryCoefficient; // Calculate salary based on the coefficient
    }


    @Override
    public String toString() {
        return "Manager{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", department='" + department + '\'' +
                ", salaryCoefficient=" + salaryCoefficient +
                '}';
    }

    public void toInfo(){
        System.out.println("Manager information");
        System.out.println("ID:" + getId());
        System.out.println("Name: " + getName());
        System.out.println("email: " + getEmail()   );
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Department: " + department);
        System.out.println("Salary Coefficient: " + salaryCoefficient);
    }
}
