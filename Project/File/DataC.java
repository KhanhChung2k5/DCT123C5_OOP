package Project.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Project.Customer.Customer;

public class DataC {
    private List<Customer> customers = new ArrayList<>(); // Danh sách khách hàng

    // Phương thức để nhập dữ liệu khách hàng
    public void importCustomers() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\DO_AN_OOP_JAVA\\DOAN\\Project\\File\\customer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) {
                    System.out.println("Dữ liệu không đầy đủ: " + line);
                    continue; // Bỏ qua dòng này nếu không đủ dữ liệu
                }
                Customer customer = new Customer(data[0], data[1], data[2], data[3], data[4]); // Tạo đối tượng Customer từ dữ liệu
                customers.add(customer); // Thêm khách hàng vào danh sách
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức để lấy danh sách khách hàng
    public List<Customer> getCustomers() {
        return customers;
    }
}
