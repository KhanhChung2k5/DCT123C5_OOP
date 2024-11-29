package Project.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.Position;

import Project.Staff.Employee;
import Project.Staff.Manager;
import Project.Staff.Saler;
import Project.File.DataImport;

@SuppressWarnings("unused")
public class EmployeeManage {
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employees = new ArrayList<>();

    public EmployeeManage() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> displayEmployee() {
        return employees;
    }

    // todo: ham them nhan vien
    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    // todo: ham tim kiem nhan vien
    public Employee searchEmployee(String id) {
        for (Employee employee : employees) {
            if (employee.getId() != null && employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    // todo: ham xoa nhan vien
    public boolean DeleteEmployee(String id) {
        Employee findEmployee = searchEmployee(id);
        if (findEmployee != null) {
            employees.remove(findEmployee);
            return true;
        }
        return false;
    }

    public void deleteAllSaler() {
        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i) instanceof Saler) {
                employees.remove(i);
            }
        }
    }

    public void deleteAllManage() {
        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i) instanceof Manager) {
                employees.remove(i);
            }
        }
    }

    // ? ham lay nhan vien theo vi tri cua Nhan vien la "Saler" or "Manager"
    public List<Employee> getEmployeesByPosition(String position) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition() != null && employee.getPosition().equalsIgnoreCase(position)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    // todo: ham chinh sua thong tin Saler
    public void editSaler() {
        System.out.println("Choose a Saler to edit (ID):");
        String searchIdToEdit = scanner.nextLine();
        Saler salerToEdit = null;

        // ? ham tim kiem Saler

        for (Employee employee : employees) {
            if (employee instanceof Saler && employee.getId().equalsIgnoreCase(searchIdToEdit)) {
                salerToEdit = (Saler) employee;
                break;
            }
        }

        if (salerToEdit == null) {
            System.out.println("Saler with ID " + searchIdToEdit + " not found.");
            return;
        }

        // * thuc hien chinh sua thong tin saler */
        int choice;
        do {
            System.out.println("\n--- Edit Saler Information ---");
            System.out.println("1. Sua ten");
            System.out.println("2. Sua Email");
            System.out.println("3. Sua so dien thoai");
            System.out.println("4. Sua vi tri");
            System.out.println("5. Sua Salary");
            System.out.println("6. Sua Sales Target");
            System.out.println("7. Sua Products Sold");
            System.out.println("0. Sua and Exit");
            System.out.print("Nhap lua chon muon thuc hien: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    salerToEdit.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nhap email moi: ");
                    salerToEdit.setEmail(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nhap so dien thoai moi: ");
                    salerToEdit.setPhoneNumber(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Nhap Position moi: ");
                    salerToEdit.setPosition(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Nhap Salary moi: ");
                    salerToEdit.setSalary(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Nhap Sales Target moi: ");
                    salerToEdit.setSalesTarget(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Nhap Product Sold moi: ");
                    salerToEdit.setProductsSold(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Luu thay doi va thoat ra.");
                    break;
                default:
                    System.out.println("Thao tac bi loi vui long thuc hien lai");
            }
        } while (choice != 0);
    }

    // * ham chinh sua thong tin Manager */

    public void editManager() {
        System.out.println("Chon Manager muon sua voi (ID):");
        String searchIdToEdit = scanner.nextLine();
        Manager managerToEdit = null;

        // * ham tim kiem Manager */

        for (Employee employee : employees) {
            if (employee instanceof Manager && employee.getId().equalsIgnoreCase(searchIdToEdit)) {
                managerToEdit = (Manager) employee;
                break;
            }
        }

        if (managerToEdit == null) {
            System.out.println("Manager voi ID " + searchIdToEdit + " khong ton tai.");
            return;
        }

        // ? Thực hiện chỉnh sửa thông tin Manager

        int choice;
        do {
            System.out.println("\n--- Chinh sua thong tin Manager ---");
            System.out.println("1. Sua Name");
            System.out.println("2. Sua Email");
            System.out.println("3. Sua Phone Number");
            System.out.println("4. Sua Position");
            System.out.println("5. Sua Salary");
            System.out.println("6. Sua Department");
            System.out.println("7. Sua Salary Coefficient");
            System.out.println("0. Luu thong tin thay doi va thoat ra");
            System.out.print("Nhap lua chon muon thuc hien: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    managerToEdit.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nhap email moi: ");
                    managerToEdit.setEmail(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nhap so dien thoai moi: ");
                    managerToEdit.setPhoneNumber(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Nhap Position moi: ");
                    managerToEdit.setPosition(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Nhap Salary moi: ");
                    managerToEdit.setSalary(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Nhap Department moi: ");
                    managerToEdit.setDepartment(scanner.nextLine());
                    break;
                case 7:
                    System.out.print("Nhap Salary Coefficient moi: ");
                    managerToEdit.setSalaryCoefficient(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Luu thay doi va thoat ra");
                    break;
                default:
                    System.out.println("Thao tac loi vui long thuc hien lai. ");
            }
        } while (choice != 0);
    }
}
