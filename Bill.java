package Project.Customer;

import Project.Product.Laptop;
import Project.Staff.Saler;

public class Bill {
    private Customer customer;
    private Laptop laptop;
    private Saler saler;
    private String billId;
    private String date;
    private double totalAmount;

    // * Constructor */
    public Bill(Customer customer, Laptop laptop, Saler saler, String billId, String date, double totalAmount) {
        this.customer = customer;
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
        return "Hóa đơn{" +
                "Khách hàng=" + customer +
                ", Laptop=" + laptop +
                ", Nhân viên bán hàng=" + saler +
                ", Mã hóa đơn='" + billId + '\'' +
                ", Ngày='" + date + '\'' +
                ", Tổng tiền=" + totalAmount +
                '}';
    }
}
