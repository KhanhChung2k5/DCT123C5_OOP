package Project.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Project.ArrayList.CustomerManage;
import Project.Customer.Customer;

public class DataC {
    private List<Customer> customers = new ArrayList<>(); // Danh sách khách hàng
        private CustomerManage customersManager;
        public DataC(CustomerManage customerManager) {
            this.customersManager = customerManager;
    }

    // Phương thức để nhập dữ liệu khách hàng
    public void importCustomers() {
        try (BufferedReader br = new BufferedReader(new FileReader("Project/File/customer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) {
                    System.out.println("Dữ liệu không đầy đủ: " + line);
                    continue; //todo: Bỏ qua dòng này nếu không đủ dữ liệu
                }
                Customer customer = new Customer(data[0], data[1], data[2], data[3], data[4]); //todo: Tạo đối tượng Customer từ dữ liệu

                customersManager.addCustomer(customer); //todo: Thêm khách hàng mảng
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //todo: Phương thức để lấy danh sách khách hàng
    public List<Customer> getCustomers() {
        return customers;
    }
}
