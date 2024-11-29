package Project.Customer;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String id, String name, String email, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //todo: cac phuong thuc get , set cho tung thuoc tinh
    
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
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Hiển thị thông tin khách hàng kèm hóa đơn
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+------------------------+------------------------------+\n");
        sb.append("|       Customer Info    |                            |\n");
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "ID", id));
        sb.append(String.format("| %-22s | %-28s |\n", "Name", name));
        sb.append(String.format("| %-22s | %-28s |\n", "Email", email));
        sb.append(String.format("| %-22s | %-28s |\n", "Phone Number", phoneNumber));
        sb.append(String.format("| %-22s | %-28s |\n", "Address", address));
        sb.append("+------------------------------------------------------+\n");
        return sb.toString();
    }
}
