package Project.Customer;

import Project.Product.Laptop;
import Project.Staff.Saler;
//? import Project.Customer.Customer;

public class Bill {

    private Customer customer;
    private String phoneNumber; 
    private Laptop laptop;
    private Saler saler;
    private String billId;
    private String date;
    private double totalAmount;

    // * Constructor */
    public Bill(Customer customer, String phoneNumber, Laptop laptop, Saler saler, String billId, String date,
            double totalAmount) {
        super();
        this.customer = customer;
        this.phoneNumber = phoneNumber;
        this.laptop = laptop;
        this.saler = saler;
        this.billId = billId;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //todo: update Customer phoneNumber sang String phoneNumber 

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Bill: " +
                "Customer = " + customer +
                ", Customer Phonenumber = " + phoneNumber + 
                ", Laptop = " + laptop +
                ", Saler = " + saler +
                ", Bill ID = '" + billId + '\'' +
                ", Date = '" + date + '\'' +
                ", Total amount = " + totalAmount +
                '}';
    }

    public void toInfo() {
        System.out.println("Bill infomation: ");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer Phonenumber: " + customer.getPhoneNumber());
        System.out.println("Laptop: " + laptop.getModel());
        System.out.println("Saler: " + saler.getName());
        System.out.println("Bill ID: " + billId);
        System.out.println("Date: " + date);
        System.out.println("Total amount: " + totalAmount);
    }
}
