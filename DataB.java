package Project.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Project.Customer.Customer;
import Project.Product.Laptop;
import Project.Staff.Saler;
import Project.Customer.Bill;

public class DataB {
    private List<Bill> bills = new ArrayList<>(); // Danh sách hóa đơn

    // Phương thức để nhập dữ liệu hóa đơn
    public void importBills() {
        try (BufferedReader br = new BufferedReader(
                new FileReader("bill.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 35) { // Điều chỉnh số lượng dữ liệu cần thiết
                    System.out.println("Dữ liệu không đầy đủ: " + line);
                    continue; // Bỏ qua dòng này nếu không đủ dữ liệu
                }
                try {
                    // Tạo đối tượng Customer từ dữ liệu
                    Customer customer = new Customer(data[0], data[1], data[2], data[3], data[4]);

                    // Tạo đối tượng Laptop từ dữ liệu
                    Laptop laptop = new Laptop(
                            data[5], // name
                            data[6], // id
                            data[7], // maker
                            Double.parseDouble(data[8]), // price
                            data[9], // type
                            Double.parseDouble(data[10]), // weight
                            data[11], // model
                            Integer.parseInt(data[12]), // warrantyPeriod
                            data[13], // releaseDate
                            data[14], // processor
                            Integer.parseInt(data[15]), // ram
                            Integer.parseInt(data[16]), // storage
                            data[17], // graphicsCard
                            data[18], // color
                            Integer.parseInt(data[19]), // batteryLife
                            Double.parseDouble(data[20]), // screenSize
                            data[21], // operatingSystem
                            Integer.parseInt(data[22]), // graphicsMemory
                            Double.parseDouble(data[23]) // adapter
                    );

                    // Tạo đối tượng Saler từ dữ liệu
                    Saler saler = new Saler(
                            data[24], // id
                            data[25], // name
                            data[26], // email
                            data[27], // phoneNumber
                            data[28], // position
                            Double.parseDouble(data[29]), // salary
                            Double.parseDouble(data[30]) // commissionRate
                    );

                    // Tạo đối tượng Bill từ dữ liệu
                    Bill bill = new Bill(
                            customer,
                            Customer.data[31], // Lấy số điện thoại từ đối tượng Customer
                            laptop,
                            saler,
                            data[32], // billId
                            data[33], // date
                            Double.parseDouble(data[34]) // totalAmount
                    );

                    bills.add(bill); // Thêm hóa đơn vào danh sách

                } catch (NumberFormatException e) {
                    System.out.println("Loi dinh dang o dong: " + line);
                } catch (Exception e) {
                    System.out.println("Loi khac: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức để lấy danh sách hóa đơn
    public List<Bill> getBills() {
        return bills;
    }
}
