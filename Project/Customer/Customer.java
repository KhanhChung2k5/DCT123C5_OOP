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
        setPhoneNumber(phoneNumber); //* */ Use the setter method to validate the phone number
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

    @SuppressWarnings("resource")
    public void setPhoneNumber(String phoneNumber) {
        Scanner scanner = new Scanner(System.in);

        while (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
            System.out.println("Sai dinh dang vui long nhap lai:");
            phoneNumber = scanner.nextLine().trim();
        }
        this.phoneNumber = phoneNumber;
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
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("email: " + email);
        System.out.println("Phone number: " + phoneNumber) ;
        System.out.println("Address: " + address);
    }

}
