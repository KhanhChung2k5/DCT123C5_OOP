package Project.Main;

import java.util.List;
import java.util.Scanner;

import Project.ArrayList.EmployeeManage;
import Project.ArrayList.LaptopManage;
import Project.File.DataImport;
import Project.Product.Laptop;
import Project.Staff.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //todo: Khởi tạo đối tượng quản lý
        EmployeeManage employeeManager = new EmployeeManage();
        LaptopManage laptopManager = new LaptopManage();

        //todo: Import dữ liệu từ file thông qua DataImport
        DataImport dataImport = new DataImport(employeeManager, laptopManager);
        dataImport.importProducts();
        dataImport.importStaff();

        //todo: Lấy danh sách đã import để sử dụng
        List<Laptop> laptops = laptopManager.displayLaptops();
        List<Employee> employees = employeeManager.displayEmployee();

        if (laptops.isEmpty()) {
            System.out.println("Khong co du lieu san pham duoc doc tu file.");
        } else {
            System.out.println("Danh sách laptop da duoc them vao he thong");
        }

        if (employees.isEmpty()) {
            System.out.println("Khong co nhan vien nao duoc doc tu file.");
        } else {
            System.out.println("Danh sach nhan vien da duoc them vao he thong");
        }

        int choiceLaptopOrEmployee = 0;
        do {
            System.out.println("\n--- Quan ly Laptop va nhan vien cua cua hang ---");
            System.out.println("1. Quan ly Laptop");
            System.out.println("2. Quan ly Saler");
            System.out.println("3. Quan ly Manager");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choiceLaptopOrEmployee = scanner.nextInt();
            scanner.nextLine();

            switch (choiceLaptopOrEmployee) {
                case 1:
                    manageLaptops(scanner, laptopManager);
                    break;
                case 2:
                    manageSaler(scanner, employeeManager);
                    break;
                case 3:
                    manageManager(scanner, employeeManager);
                    break;
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
            System.out.println("\n--- Quan ly Laptop ---");
            System.out.println("1. Hien thi danh sach Laptop");
            System.out.println("2. Tim kiem Laptop");
            System.out.println("3. Xoa Laptop theo ID");
            System.out.println("0. Quay lai");
            System.out.print("Nhap thao tac muon thuc hien: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
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
                    System.out.print("Nhap ID Laptop can tim kiem: ");
                    int findId = scanner.nextInt();
                    Laptop foundLaptop = laptopManager.searchLaptop(findId);
                    if (foundLaptop != null) {
                        System.out.println("Thong tin Laptop:");
                        System.out.println(foundLaptop);
                    } else {
                        System.out.println("Khong tim thay Laptop voi ID : " + findId + "  trong he thong");
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID Laptop can xoa: ");
                    int deleteId = scanner.nextInt();
                    boolean isDeleted = laptopManager.deleteLaptop(deleteId);
                    if (isDeleted) {
                        System.out.println("Da xoa Laptop voi ID " + deleteId + " ra khoi he thong");
                    } else {
                        System.out.println("Khong tim thay Laptop voi ID : " + deleteId);
                    }
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
            System.out.println("\n--- Quan ly Saler ---");
            System.out.println("1. Hien thi danh sach Saler");
            System.out.println("2. Tim kiem Saler theo ID");
            System.out.println("3. Xoa Saler theo ID");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
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
                    System.out.print("Nhap ID Saler de tim : ");
                    String salerId = scanner.nextLine();
                    Employee foundSaler = employeeManager.searchEmployee(salerId);
                    if (foundSaler != null) {
                        System.out.println("Thong tin Saler:");
                        System.out.println(foundSaler);
                    } else {
                        System.out.println("Khong tim thay Saler voi ID : " + salerId + " ton tai trong he thong");
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID Saler de xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean isDeleted = employeeManager.DeleteEmployee(deleteId);
                    if (isDeleted) {
                        System.out.println("Da xoa Saler thanh cong.");
                    } else {
                        System.out.println("Khong tim thay Saler voi ID : " + deleteId + " trong he thong");
                    }
                    break;
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
            System.out.println("\n--- Quan ly Manager ---");
            System.out.println("1. Hien thi danh sach Manager");
            System.out.println("2. Tim kiem Manager theo ID");
            System.out.println("3. Xoa Manager theo ID");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 1:
                    //todo: Hiển thị danh sách Manager
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
                    //todo: Tìm kiếm Manager theo ID
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
                case 0:
                    System.out.println("Quay lai MENNU.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le , vui long thu lai.");
            }
        } while (choice != 0);
    }
    
}
