package Project.Staff;

import java.util.Scanner;

public abstract class Employee {
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
        setPhoneNumber(phoneNumber); //* */ Use the setter to validate the phone number
        this.position = position;
        this.salary = salary;
    }

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
        while (phoneNumber.length() == 10) { 
            System.out.println("SDT phải có 10 số. Vui lòng nhập lại:");
            Scanner scanner = new Scanner(System.in); 
            phoneNumber = scanner.nextLine(); 
        }
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
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
