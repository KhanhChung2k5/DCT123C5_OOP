package Project.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Project.Product.Laptop;
import Project.Product.Product;
import Project.Staff.Employee;
import Project.Staff.Manager;
import Project.Staff.Saler;
import Project.ArrayList.LaptopManage;
import Project.ArrayList.EmployeeManage;

@SuppressWarnings("unused")
public class DataImport {
    private EmployeeManage employeeManager;
    private LaptopManage laptopManager;

    public DataImport(EmployeeManage employeeManager, LaptopManage laptopManager) {
        this.employeeManager = employeeManager;
        this.laptopManager = laptopManager;
    }


    // edit_1: Thêm phương thức để nhập dữ liệu sản phẩm
    public void importProducts() {
        try (BufferedReader br = new BufferedReader(new FileReader("Project/File/product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 9) {
                    System.out.println("Du lieu khong day du: " + line);
                    continue; 
                }
                Laptop laptop = new Laptop(
                        data[0], // name
                        Integer.parseInt(data[1]), // id
                        data[2], // maker
                        Double.parseDouble(data[3]), // price
                        data[4], // type
                        Double.parseDouble(data[5]), // weight
                        data[6], // model
                        Integer.parseInt(data[7]), // warrantyPeriod
                        data[8], // releaseDate
                        data[9], // processor
                        Integer.parseInt(data[10]), // ram
                        Integer.parseInt(data[11]), // storage
                        data[12], // graphicsCard
                        data[13], // color
                        Integer.parseInt(data[14]), // batteryLife
                        Double.parseDouble(data[15]), // screenSize
                        data[16], // operatingSystem
                        Integer.parseInt(data[17]), // graphicsMemory
                        Double.parseDouble(data[18]) // adapter
                );
                laptopManager.addLaptop(laptop);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // edit_2: Thêm phương thức để nhập dữ liệu nhân viên
    public void importStaff() {
        try (BufferedReader br = new BufferedReader(new FileReader("Project/File/staff.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[4].equals("Saler")) {
                    Employee saler = new Saler(
                            data[0], // id
                            data[1], // name
                            data[2], // email
                            data[3], // phoneNumber
                            data[4], // position
                            Double.parseDouble(data[5]), // salary
                            Integer.parseInt(data[6]), // salesTarget (cần thêm tham số này)
                            Integer.parseInt(data[7]));
                    employeeManager.addEmployee(saler); // Thêm nhân viên vào danh sách
                } else {
                    Employee manager = new Manager(
                            data[0], // id
                            data[1], // name
                            data[2], // email
                            data[3], // phoneNumber
                            data[4], // position
                            Double.parseDouble(data[5]), // salary
                            data[6], // department
                            Double.parseDouble(data[7]) // salary Coefficient
                    );
                    employeeManager.addEmployee(manager); // Thêm nhân viên vào danh sách
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Laptop> getProducts() { // Phương thức để lấy danh sách sản phẩm
        return laptopManager.displayLaptops();
    }

    // Phương thức để lấy danh sách nhân viên
    public List<Employee> getEmployees() {
        return employeeManager.displayEmployee();
    }
}
