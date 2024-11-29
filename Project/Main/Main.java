package Project.Main;

import java.util.List;
import java.util.Scanner;

import Project.ArrayList.CustomerManage;
import Project.ArrayList.EmployeeManage;
import Project.ArrayList.LaptopManage;
import Project.Customer.Bill;
import Project.Customer.Customer;
import Project.File.DataImport;
import Project.File.DataB;
import Project.File.DataC;
import Project.Product.Laptop;
import Project.Staff.Employee;
import Project.Staff.Manager;
import Project.Staff.Saler;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // todo: Khởi tạo đối tượng quản lý
        EmployeeManage employeeManager = new EmployeeManage();
        LaptopManage laptopManager = new LaptopManage();
        CustomerManage customerManager = new CustomerManage();

        // todo: Import dữ liệu từ file thông qua DataImport
        DataImport dataImport = new DataImport(employeeManager, laptopManager);
        dataImport.importProducts();
        dataImport.importStaff();

        DataC datac = new DataC(customerManager);
        datac.importCustomers();

        DataB dataB = new DataB();
        dataB.importBills();

        //todo: Lấy danh sách hóa đơn từ DataB
        List<Bill> bills = dataB.getBills();


        //todo: Hiển thị danh sách hóa đơn
        System.out.println("Danh sach hoa don da nhap:");
        if (bills.isEmpty()) {
            System.out.println("Không có hóa đơn nào.");
        }
        

        List<Laptop> laptops = laptopManager.displayLaptops();
        List<Employee> employees = employeeManager.displayEmployee();
        List<Customer> customers = customerManager.displayCustomers();

        
        //todo: kiem tra cac file xem cac file co bi loi hay chua co du lieu hay khong
        if (laptops.isEmpty()) {
            System.out.println("Khong co du lieu san pham duoc doc tu file.");
        }
        if (employees.isEmpty()) {
            System.out.println("Khong co nhan vien nao duoc doc tu file.");
        } 
        if (customers.isEmpty()){
            System.out.println("Khong co du lieu duoc doc tu file.");
        }
       
        int choiceLaptopOrEmployee = 0;
        do {

            //todo: thiet ke MENU de lua chon cac thao tac muon thuc hien

            System.out.println("\n--- Quan ly Laptop va nhan vien cua cua hang ---");
            System.out.println("1. Quan ly Laptop");
            System.out.println("2. Quan ly Saler");
            System.out.println("3. Quan ly Manager");
            System.out.println("4. Quan ly khach hang");
            System.out.println("5. Hien thi Bill");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choiceLaptopOrEmployee = scanner.nextInt();
            scanner.nextLine();

            switch (choiceLaptopOrEmployee) {
                case 1:
                    //todo: quan ly laptop

                    manageLaptops(scanner, laptopManager);
                    break;
                case 2:
                    //todo: quan ly Saler

                    manageSaler(scanner, employeeManager);
                    break;
                case 3:
                    //todo: quan ly Mannager

                    manageManager(scanner, employeeManager);
                    break;
                case 4:
                    //todo: quan ly khach hang
                    managerCustomer(scanner, customerManager);
                    
                case 5:

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Thao tac khong hop le, vui long thuc hien lai.");
            }
        } while (choiceLaptopOrEmployee != 0);

        scanner.close();
    }

    private static void manageLaptops(Scanner scanner, LaptopManage laptopManager) {
        int choice;
        do {
            //todo: thiet ke Menu de lua chon cac thao tac muon thuc hien trong quan ly Laptop

            System.out.println("\n--- Quan ly Laptop ---");
            System.out.println("1. Hien thi danh sach Laptop");
            System.out.println("2. Tim kiem Laptop");
            System.out.println("3. Xoa Laptop theo ID");
            System.out.println("4.Them Laptop moi ");
            System.out.println("5.Sua thong tin Laptop");
            System.out.println("0. Quay lai");
            System.out.print("Nhap thao tac muon thuc hien: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //todo: goi lai mang luu tru laptop de hien thi ra

                    List<Laptop> laptops = laptopManager.displayLaptops();
                    if (laptops.isEmpty()) {
                        System.out.println("Khong con san pham ton tai trong kho.");
                    } else {
                        for (Laptop laptop : laptops) {
                            System.out.println(laptop);
                        }
                    }
                    break;
                case 2:
                    //todo: Xu li viec tim kiem Laptop bang cach tim kiem them ID

                    System.out.print("Nhap ID Laptop can tim kiem: ");
                    int findId = scanner.nextInt();
                    
                    //todo: goi lai ham co san trong LaptopManage de thuc hien viec tim kiem Laptop

                    Laptop foundLaptop = laptopManager.searchLaptop(findId);

                    //todo: neu  khac null tuc la ham da dung va ID do ton tai trong du lieu thi tra ve thong tin Laptop can tim kiem
                    if (foundLaptop != null) {
                        System.out.println("Thong tin Laptop:");
                        System.out.println(foundLaptop);
                    } else {

                        //todo: nguoc lai thi co nghia tra ve cua ham Search da la null tuc la khong ton tai Laptop voi ID do

                        System.out.println("Khong tim thay Laptop voi ID : " + findId + "  trong he thong");
                    }
                    break;
                case 3:
                    
                    //todo: tuong tu nhu ham tim kiem trong ham nay thuc hien chuc nang xoa Laptop theo ID trong ham nay su dung lai logic tim kiem ID cua ham Search truoc do

                    System.out.print("Nhap ID Laptop can xoa: ");
                    int deleteId = scanner.nextInt();
                    boolean isDeleted = laptopManager.deleteLaptop(deleteId);
                    if (isDeleted) {
                        System.out.println("Da xoa Laptop voi ID " + deleteId + " ra khoi he thong");
                    } else {
                        System.out.println("Khong tim thay Laptop voi ID : " + deleteId);
                    }
                    break;
                case 4:

                    //todo: thuc hien chuc nang them Laptop moi vao he thong va nhap lan luot tung thong so cua Laptop 

                    System.out.println("Nhap thong tin Laptop moi:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Xóa bộ đệm
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Hang san xuat: ");
                    String maker = scanner.nextLine();
                    System.out.print("Gia: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Loai: ");
                    String type = scanner.nextLine();
                    System.out.print("Can nang: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Thoi gian bao hanh (thang): ");
                    int warrantyPeriod = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ngay phat hanh: ");
                    String releaseDate = scanner.nextLine();
                    System.out.print("Processor: ");
                    String processor = scanner.nextLine();
                    System.out.print("RAM (GB): ");
                    int ram = scanner.nextInt();
                    System.out.print("Storage (GB): ");
                    int storage = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Card do hoa: ");
                    String graphicsCard = scanner.nextLine();
                    System.out.print("Mau sac: ");
                    String color = scanner.nextLine();
                    System.out.print("Thoi luong pin (gio): ");
                    int batteryLife = scanner.nextInt();
                    System.out.print("Kich thuoc man hinh (inch): ");
                    double screenSize = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("He dieu hanh: ");
                    String operatingSystem = scanner.nextLine();
                    System.out.print("Bo nho do hoa (GB): ");
                    int graphicsMemory = scanner.nextInt();
                    System.out.print("Cong suat Adapter (W): ");
                    double adapter = scanner.nextDouble();

                    //todo: tao doi duong laptop moi va them vao he thong 
                    Laptop newLaptop = new Laptop(name, id, maker, price, type, weight, model, warrantyPeriod,
                            releaseDate, processor, ram, storage, graphicsCard, color, batteryLife, screenSize,
                            operatingSystem, graphicsMemory, adapter);

                    //todo: add vao quan ly va tra ve thong bao da duoc them thanh cong

                    laptopManager.addLaptop(newLaptop);
                    System.out.println("Da them Laptop moi vao he thong.");
                    break;
                case 5:
                    //todo: goi lai ham editLaptop da duoc thiet ke truoc do trong File LaptopManage voi muc tieu la chinh sua cac thong so cua laptops

                    laptopManager.editLaptop();
                    break;
                case 0:
                    System.out.println("Quay lai MENU.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.Vui long hop le");
            }
        } while (choice != 0);
    }

    private static void manageSaler(Scanner scanner, EmployeeManage employeeManager) {
        int choice;
        do {
            //todo: hien thi Menu cac thao tac muon thuc hien va lua chon 

            System.out.println("\n--- Quan ly Saler ---");
            System.out.println("1. Hien thi danh sach Saler");
            System.out.println("2. Tim kiem Saler theo ID");
            System.out.println("3. Xoa Saler theo ID");
            System.out.println("4.Them Saler ");
            System.out.println("5.Chinh sua Saler");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    //todo: su dung ham getEmployeePosition voi key word la "Saler" de chi lay thong tin Saler
                    List<Employee> salers = employeeManager.getEmployeesByPosition("Saler");
                    if (salers.isEmpty()) {
                        System.out.println("Hien tai chua co nhan vien trong he thong.");
                    } else {
                        for (Employee saler : salers) {
                            System.out.println(saler);
                        }
                    }
                    break;
                case 2:

                    //todo: truyen vao ID Saler can tim va se goi lai ham searchEmployee co san de kiem tra xem Saler voi ID do co ton tai hay khong
                    System.out.print("Nhap ID Saler de tim : ");
                    String salerId = scanner.nextLine();
                    Employee foundSaler = employeeManager.searchEmployee(salerId);
                    if (foundSaler != null) {
                        //todo: check neu foundSaler khac null tuc la ham searchEmployee da dung thi ID Saler do co ton tai trong he thong va tra ve thong tin cua Saler dp
                        System.out.println("Thong tin Saler:");
                        System.out.println(foundSaler);
                    } else {
                        System.out.println("Khong tim thay Saler voi ID : " + salerId + " ton tai trong he thong");
                    }
                    break;
                case 3:
                    //todo: ta se dung ham deleteEmployee de xoa Saler voi ID do va trong ham Delete se co su dung ham searchEmployee de tim ID do xem co ton tai hay khong

                    System.out.print("Nhap ID Saler de xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleted = employeeManager.DeleteEmployee(deleteId);
                    if (isDeleted) {

                        //todo: neu ham nay dumg thi Saler ID do se xoa thanh cong nen se xuat ra tb Saler da duoc xoa thanh cong 

                        System.out.println("Da xoa Saler thanh cong.");
                    } else {
                        //todo: nguoc lai thi co nghia saler voi ID do khong ton tai trong he thong 
                        System.out.println("Khong tim thay Saler voi ID : " + deleteId + " trong he thong");
                    }
                    break;
                case 4:

                    //todo: nhap vao tung thong tin cua Saler de add vao he thong 

                    System.out.println("Nhap thong tin Saler moi:");
                    System.out.println("ID: ");
                    String newSalerId = scanner.nextLine();
                    System.out.println("Name: ");
                    String newSalerName = scanner.nextLine();
                    System.out.println("Email: ");
                    String newSalerEmail = scanner.nextLine();
                    System.out.println("Phone Number: ");
                    String newSalerPhone = scanner.nextLine();
                    System.out.println("Position: ");
                    String newSalerPosition = scanner.nextLine();
                    System.out.println("Salary: ");
                    double newSalerSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Sales Target: ");
                    int newSalerSalesTarget = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Product Sold: ");
                    int newSalerProductSold = scanner.nextInt();
                    scanner.nextLine();
                    Saler newSaler = new Saler(newSalerId, newSalerName, newSalerEmail, newSalerPhone, newSalerPosition,
                            newSalerSalary, newSalerSalesTarget, newSalerProductSold);

                            //todo: goi lai ham  addEmployee de add Saler moi vao de quan ly

                    employeeManager.addEmployee(newSaler);
                    System.out.println("Da them Saler vao thanh cong");
                    break;
                case 5:
                    
                    //todo: goi lai ham de thuc hien chinh sua cac thong tin cua Saler 

                    employeeManager.editSaler();

                case 0:
                    System.out.println("Quay lai menu chinh.");
                    break;
                default:
                    System.out.println("Thao tac khong hop le , vui long thu lai.");
            }
        } while (choice != 0);
    }

    private static void manageManager(Scanner scanner, EmployeeManage employeeManager) {
        int choice;
        do {
            //todo: Logic cua ham nay cung tuong tu nhu quan ly Saler nhung co mot vai bien khac nhau 

            System.out.println("\n--- Quan ly Manager ---");
            System.out.println("1. Hien thi danh sach Manager");
            System.out.println("2. Tim kiem Manager theo ID");
            System.out.println("3. Xoa Manager theo ID");
            System.out.println("4. Them Manager ");
            System.out.println("5.Sua thong tin Saler");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // todo: Hiển thị danh sách Manager
                    List<Employee> managers = employeeManager.getEmployeesByPosition("Manager");
                    if (managers.isEmpty()) {
                        System.out.println("Khong con Manager co trong he thong");
                    } else {
                        for (Employee manager : managers) {
                            System.out.println(manager);
                        }
                    }
                    break;
                case 2:
                    // todo: Tìm kiếm Manager theo ID
                    System.out.print("Nhap ID Manager can tim: ");
                    String managerId = scanner.nextLine();
                    Employee foundManager = employeeManager.searchEmployee(managerId);
                    if (foundManager != null) {
                        System.out.println("Thong tin Manager:");
                        System.out.println(foundManager);
                    } else {
                        System.out.println("Khong tim thay Manager voi ID : " + managerId + " trong he thong");
                    }
                    break;
                case 3:
                    // Xóa Manager theo ID
                    System.out.print("Nhap ID manager de xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleted = employeeManager.DeleteEmployee(deleteId);
                    if (isDeleted) {
                        System.out.println("Da xoa Manager voi ID " + isDeleted + " ra khoi he thong");
                    } else {
                        System.out.println("Khong tim thay Managre voi ID : " + deleteId + " trong he thong");
                    }
                    break;
                case 4:
                    System.out.println("Nhap thong tin cua Manager");
                    System.out.println("ID: ");
                    String newManagerId = scanner.nextLine();
                    System.out.println("Name: ");
                    String newManagerName = scanner.nextLine();
                    System.out.println("Email: ");
                    String newManagerEmail = scanner.nextLine();
                    System.out.println("Phone Number: ");
                    String newManagerPhone = scanner.nextLine();
                    System.out.println("Position: ");
                    String newManagerPosition = scanner.nextLine();
                    System.out.println("Salary: ");
                    double newManagerSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Department: ");
                    String newManagerDepartment = scanner.nextLine();
                    System.out.println("Salary Coefficient: ");
                    double newManagerSalaryCoefficient = scanner.nextDouble();
                    scanner.nextLine();
                    Manager newManager = new Manager(newManagerId, newManagerName, newManagerEmail, newManagerPhone,
                            newManagerPosition, newManagerSalary, newManagerDepartment, newManagerSalaryCoefficient);
                    employeeManager.addEmployee(newManager);
                    System.out.println("Da them Saler vao thanh cong");
                    break;
                
                case 5:
                    employeeManager.editManager();
                
                case 0:
                    System.out.println("Quay lai MENNU.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le , vui long thu lai.");
            }
        } while (choice != 0);
    }

    private static void managerCustomer(Scanner scanner, CustomerManage customerManager) {
        int choice;
        do {

            //todo: hien thi menu cac thao tac muon thuc hien trong quan ly Customer 

            System.out.println("\n--- Quan ly Khach Hang ---");
            System.out.println("1. Hien thi danh sach Khach Hang");
            System.out.println("2. Tim kiem Khach Hang theo ID");
            System.out.println("3. Xoa Khach Hang theo ID");
            System.out.println("4. Them Khach Hang");
            System.out.println("5. Sua thong tin Khach Hang");
            System.out.println("6. Xoa tat ca Khach Hang");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            //todo: Logic xu li cac ham cung se tuong tu nhu quan ly Saler va Manager

            switch (choice) {
                case 1:
                    List<Customer> customers = customerManager.displayCustomers();
                    if (customers.isEmpty()) {
                        System.out.println("Khong co khach hang nao trong he thong.");
                    } else {
                        for (Customer customer : customers) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhap ID khach hang can tim: ");
                    String customerId = scanner.nextLine();
                    Customer foundCustomer = customerManager.searchCustomer(customerId);
                    if (foundCustomer != null) {
                        System.out.println("Thong tin Khach Hang:");
                        System.out.println(foundCustomer);
                    } else {
                        System.out.println("Khong tim thay Khach Hang voi ID: " + customerId);
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID khach hang can xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleted = customerManager.deleteCustomer(deleteId);
                    if (isDeleted) {
                        System.out.println("Da xoa Khach Hang thanh cong.");
                    } else {
                        System.out.println("Khong tim thay Khach Hang voi ID: " + deleteId);
                    }
                    break;
                case 4:
                    System.out.print("Nhap ID khach hang: ");
                    String newCustomerId = scanner.nextLine();
                    System.out.print("Nhap ten khach hang: ");
                    String newCustomerName = scanner.nextLine();
                    System.out.print("Nhap email khach hang: ");
                    String newCustomerEmail = scanner.nextLine();
                    System.out.print("Nhap so dien thoai khach hang: ");
                    String newCustomerPhone = scanner.nextLine();
                    System.out.print("Nhap dia chi khach hang: ");
                    String newCustomerAddress = scanner.nextLine();

                    Customer newCustomer = new Customer(newCustomerId, newCustomerName, newCustomerEmail,
                            newCustomerPhone, newCustomerAddress);
                    customerManager.addCustomer(newCustomer);
                    break;
                case 5:
                    customerManager.editCustomer();
                    break;
                case 6:
                    customerManager.deleteAllCustomers();
                    break;
                case 0:
                    System.out.println("Quay lai menu chinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai.");
            }
        } while (choice != 0);
    }

}
