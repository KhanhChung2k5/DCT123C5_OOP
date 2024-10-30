import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataImport {
    private List<Product> products = new ArrayList<>(); // Danh sách sản phẩm
    private List<Employee> employees = new ArrayList<>(); // Danh sách nhân viên

    // edit_1: Thêm phương thức để nhập dữ liệu sản phẩm
    public void importProducts() {
        try (BufferedReader br = new BufferedReader(new FileReader("product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 9) {
                    System.out.println("Du lieu khong day du: " + line);
                    continue; // Bỏ qua dòng này nếu không đủ dữ liệu
                }
                Product product = new Laptop(
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
                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // edit_2: Thêm phương thức để nhập dữ liệu nhân viên
    public void importStaff() {
        try (BufferedReader br = new BufferedReader(new FileReader("staff.txt"))) {
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
                        Integer.parseInt(data[7])
                    );
                    employees.add(saler); // Thêm nhân viên vào danh sách
                } else {
                    Employee manager = new Manager(
                        data[0], // id
                        data[1], // name
                        data[2], // email
                        data[3], // phoneNumber
                        data[4], // position
                        Double.parseDouble(data[5]), // salary
                        data[6],  // department
                        Double.parseDouble(data[7]) //salary Coefficient
                    );
                    employees.add(manager); // Thêm nhân viên vào danh sách
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getProducts() { // Phương thức để lấy danh sách sản phẩm
        return products;
    }

    // Phương thức để lấy danh sách nhân viên
    public List<Employee> getEmployees() {
        return employees; // Trả về danh sách nhân viên
    }
}
