package Project.Staff;

// import java.util.ArrayList;
// import java.util.List;

import java.util.Scanner;

public abstract class Employee {
    // NOTE -
    // private static List<Employee> employeeList = new ArrayList<>();

    // private static int employeeCount = 0; // * */ Static variable to count
    // employees
    private static int rewardPerProduct = 1_000_000;

    private String id;
    private String name;
    private String email;
    private String phoneNumber; // Đảm bảo phoneNumber có tối đa 10 số
    private String position;
    private double salary;

    // * Constructor */
    @SuppressWarnings("resource")
    public Employee(String id, String name, String email, String phoneNumber, String position, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        setPhoneNumber(phoneNumber); // * */ Use the setter to validate the phone number
        this.position = position;
        this.salary = salary;
        // employeeCount++;
    }

    // public static int getEmployeeCount() {
    // return employeeCount;
    // }
    // NOTE -
    // public static void addEmployee(Employee employee) {
    // employeeList.add(employee);
    // }

    // public static void removeEmployee(Employee employee) {
    // employeeList.remove(employee);
    // employeeCount--; // Decrement employee count when an employee is removed
    // }

    // public static List<Employee> getEmployees() {
    // return new ArrayList<>(employeeList); // Return a copy of the employee list
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @SuppressWarnings("resource")
    public void setPhoneNumber(String phoneNumber) {
        while (!phoneNumber.matches("\\d{10}")) {
            System.out.println("SDT phai co 10 so. Vui long nhap lai:");
            Scanner scanner = new Scanner(System.in);
            phoneNumber = scanner.nextLine();
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public static double calculateSalaryByKPI(double basicSalary, int productSold) {
        return basicSalary + (productSold * rewardPerProduct);
    }

    public static double calculateSalaryByCoefficient(double basicSalary, double coefficient) {
        return basicSalary * coefficient;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // *DA HINH */
    public abstract double calculateSalary();

    public abstract void toInfo();

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}