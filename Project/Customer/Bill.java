package Project.Customer;

import Project.Product.Laptop;
import Project.Staff.Saler;

public class Bill {
    // todo Composition (tạo thuộc tính để lưu trữ đối tượng class khác) 
    // todo (Mốiquan hệ HAS-A)
    private Customer customer; // *Composition */
    private String phoneNumber; // ? update tu Customer sang
    private Laptop laptop; // *Composition */
    private Saler saler; // *Composition */
    private String billId;
    private String date;
    private double totalAmount;

    // * Constructor */
    public Bill(Customer customer, String phoneNumber, Laptop laptop, Saler saler, String billId, String date,
            double totalAmount) {
        // super(); 
        //* Composition (tạo thuộc tính để lưu trữ đối tượng class khác) */
        //* (Mối quan hệ HAS-A) */
        this.customer = customer;
        this.phoneNumber = customer.getPhoneNumber();
        this.laptop = laptop;
        this.saler = saler;
        this.billId = billId;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    // ?Trả về đối tượng Customer mà Bill tham chiếu / (Lấy thông tin Customer)
    public Customer getCustomer() {
        return customer;
    }

    // *Thiết lập đối tượng Customer */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = customer.getPhoneNumber();
    }

    // ? Trả về đối tượng Laptop
    public Laptop getLaptop() {
        return laptop;
    }

    // * */
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    // ? Trả về đối tượng Saler
    public Saler getSaler() {
        return saler;
    }

    // * */
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
        StringBuilder sb = new StringBuilder();
        sb.append("+------------------------+------------------------------+\n");
        sb.append("|         Field          |            Value             |\n");
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "Customer", customer.getName()));
        sb.append(String.format("| %-22s | %-28s |\n", "Customer Phonenumber", customer.getPhoneNumber()));
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "Laptop", laptop.getName()));
        sb.append(String.format("| %-22s | %-28s |\n", "Laptop", laptop.getModel()));
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "Saler", saler.getName()));
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "Bill ID", billId));
        sb.append(String.format("| %-22s | %-28s |\n", "Date", date));
        sb.append(String.format("| %-22s | %-28.2f |\n", "Total amount", totalAmount));
        sb.append("+------------------------+------------------------------+");
        return sb.toString();
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
