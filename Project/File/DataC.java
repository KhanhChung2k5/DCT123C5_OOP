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

    // ? Constructor (HAS-A) sử dụng CustomerManage để thực hiện chức năng add
    // ? thông qua đối tượng customerManager
    public DataC(CustomerManage customerManager) {
        this.customersManager = customerManager;
    }

    // * */ Phương thức để nhập dữ liệu khách hàng
    public void importCustomers() {
        try (BufferedReader br = new BufferedReader(new FileReader("Project/File/customer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 5) {
                    System.out.println("...: " + line);
                    continue; // ? Bỏ qua dòng này nếu không đủ dữ liệu
                }
                // * */ Tạo đối tượng Customer từ dữ liệu
                Customer customer = new Customer(
                        data[0], // id
                        data[1], // name
                        data[2], // email
                        data[3], // phoneNumber
                        data[4] // address
                );

                customersManager.addCustomer(customer); //? Thêm Customer vào danh sách
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // * */ Phương thức để lấy danh sách khách hàng
    public List<Customer> getCustomers() {
        return customers;
    }
}
