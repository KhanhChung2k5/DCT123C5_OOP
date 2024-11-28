package Project.Staff;

// import java.util.ArrayList;
// import java.util.List;

import java.util.Scanner;

public abstract class Employee implements EmployeeToString {
    // NOTE -
    // private static List<Employee> employeeList = new ArrayList<>();

    // private static int employeeCount = 0; // * */ Static variable to count
    // employees
    private static int employeeCount = 0;
    private static int rewardPerProduct = 1_000_000;

    private String id;
    private String name;
    private String email;
    private String phoneNumber; // Đảm bảo phoneNumber có tối đa 10 số
    private String position;
    private double salary;

    // * Constructor */
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
        Scanner scanner = new Scanner(System.in);

        while (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
            System.out.println("Sai dinh dang vui long nhap lai:");
            phoneNumber = scanner.nextLine().trim();
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static double calculateSalaryByKPI(double basicSalary, int productSold) {
        return basicSalary + (productSold * rewardPerProduct);
    }

    public static double calculateSalaryByCoefficient(double basicSalary, double coefficient) {
        return basicSalary * coefficient;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Nếu cần reset số lượng nhân viên
    public static void resetEmployeeCount() {
        employeeCount = 0;
    }

    // *DA HINH */
    public abstract double calculateSalary();

    public abstract void toInfo();

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
        return sb.toString();
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        employeeCount--; // Giảm số lượng khi đối tượng bị thu hồi bởi Garbage Collector
    }

}