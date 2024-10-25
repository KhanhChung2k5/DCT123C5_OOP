package Project.Customer;

import java.util.Scanner;

public class Customer {
    public static Customer[] data;
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    // * Constructor */
    public Customer(String id, String name, String email, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        if (phoneNumber.length() == 10) {
            System.out.println("SDT phai co 10 so.");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lai sdt: ");
            this.phoneNumber = scanner.nextLine();
        } else {
            this.phoneNumber = phoneNumber;
        }
        this.address = address;
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

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            System.out.println("SDT phai co 10 so.");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lai sdt: ");
            this.phoneNumber = scanner.nextLine();
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void toInfo() {
        System.out.println("Customer Infomation");
        System.out.println("Name: ");
        System.out.println("Id: ");
        System.out.println("email: ");
        System.out.println("Phone number: ");
        System.out.println("Address: ");
    }

}
