package Project.Staff;

public class Manager extends Employee {
    private String department;

    // * Constructor */
    public Manager(String id, String name, String email, String phoneNumber, String position, double salary, String department) {
        super(id, name, email, phoneNumber, position, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
                '}';
    }
}

