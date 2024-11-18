import java.util.Scanner;

import Project.ArrayList.LaptopManage;
import Project.Product.Laptop;
import Project.Staff.Manager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Laptop laptopA = new Laptop(
//                "Laptop A",         // Name
//                1,                  // ID
//                "Maker A",         // Maker
//                1000.0,            // Price
//                "Laptop",           // Type
//                2.5,               // Weight
//                "Model A",         // Model
//                24,                // Warranty Period
//                "2023-01-01",      // Release Date
//                "Intel i7",        // Processor
//                16,                // RAM
//                512,               // Storage
//                "NVIDIA GTX 1650", // Graphics Card
//                "Black",           // Color
//                5,                 // Battery Life
//                15.6,              // Screen Size
//                "Windows 10",      // Operating System
//                4                  // Adapter
//        );//test case
        Saler newSaler = null;//khoi tao
        Manager newManager = null;//khoi tao
        LaptopManage listLaptop = new LaptopManage();
        EmployeeManage listEmployee = new EmployeeManage();
        newSaler = new Saler("E001", "John Doe", "johndoe@example.com", "0123456789", "Manager", 10000.0, 1, 5);
        listEmployee.addEmployee(newSaler);
//        listLaptop.addLaptop(laptopA);//test case
        int choiceLaptopOrEmployee=0;
        do {
            System.out.println("Laptop or Saler or Manager");
            System.out.println("1. Laptop");
            System.out.println("2. Saler");
            System.out.println("3. Manager");
            choiceLaptopOrEmployee = scanner.nextInt();
            switch (choiceLaptopOrEmployee) {
                case 1:
                    // manage laptop
                    int choice;
                    do {
                        System.out.println("Welcome to the Laptop Manage");
                        System.out.println("1. Add Laptop");
                        System.out.println("2. Display Laptop");
                        System.out.println("3. Delete Laptop");
                        System.out.println("4. Search Laptop");
                        System.out.println("5. Edit Laptop");
                        System.out.println("6. Delete all Laptop");
                        System.out.println("0. Exit");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter Laptop Name: ");
                                String laptopName = scanner.nextLine();

                                System.out.println("Enter Laptop Id: ");
                                int laptopId = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Maker: ");
                                String laptopMaker = scanner.nextLine();

                                System.out.println("Enter Laptop Price: ");
                                double laptopPrice = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Type: ");
                                String laptopType = scanner.nextLine();

                                System.out.println("Enter Laptop Weight: ");
                                double laptopWeight = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Model: ");
                                String laptopModel = scanner.nextLine();

                                System.out.println("Enter Laptop Warranty Period (years): ");
                                int laptopWarrantyPeriod = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Release Date (e.g., 2022-12-31): ");
                                String laptopReleaseDate = scanner.nextLine();

                                System.out.println("Enter Laptop Processor: ");
                                String laptopProcessor = scanner.nextLine();

                                System.out.println("Enter Laptop RAM (GB): ");
                                int laptopRAM = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Storage (GB): ");
                                int laptopStorage = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Graphics Card: ");
                                String laptopGraphicsCard = scanner.nextLine();

                                System.out.println("Enter Laptop Color: ");
                                String laptopColor = scanner.nextLine();

                                System.out.println("Enter Laptop Battery Life (hours): ");
                                int laptopBatteryLife = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Screen Size (inches): ");
                                double laptopScreenSize = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Adapter (W): ");
                                double laptopAdapter = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Enter Laptop Operating System: ");
                                String laptopOperatingSystem = scanner.nextLine();

                                // Tạo đối tượng Laptop
                                Laptop laptop = new Laptop(laptopName, laptopId, laptopMaker, laptopPrice, laptopType, laptopWeight, laptopModel,
                                        laptopWarrantyPeriod, laptopReleaseDate, laptopProcessor, laptopRAM, laptopStorage,
                                        laptopGraphicsCard, laptopColor, laptopBatteryLife, laptopScreenSize, laptopOperatingSystem, laptopAdapter);
                                listLaptop.addLaptop(laptop);
                                break;
                            case 2:
                                listLaptop.displayLaptops();
                                break;
                            case 3:
                                System.out.println("Enter Laptop Id to delete: ");
                                int deleteId = scanner.nextInt();
                                listLaptop.deleteLaptop(deleteId);
                                break;
                            case 4:
                                System.out.print("Enter Laptop ID to find: ");
                                int findId = scanner.nextInt();
                                Laptop foundLaptop = listLaptop.searchLaptop(findId);
                                if (foundLaptop != null) {
                                    foundLaptop.toInfo(); // Hiển thị thông tin của laptop
                                } else {
                                    System.out.println("Laptop with ID " + findId + " not found.");
                                }
                                break;
                            case 5:
                                listLaptop.editLaptop();
                                break;
                            case 6:
                                listLaptop.deleteAllLaptops();
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (choice != 0);

                case 2:
                    int choice2 =0;
                    do {
                        System.out.println("Welcome to the Employee Manage");
                        System.out.println("1. Add Saler");
                        System.out.println("2. Display Saler");
                        System.out.println("3. Delete Saler");
                        System.out.println("4. Search Saler");
                        System.out.println("5. Edit Saler");
                        System.out.println("6. Delete all Saler");
                        System.out.println("0. Exit");
                        choice2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice2) {
                            case 1:
                                System.out.println("Enter Seller ID: ");
                                String employeeId = scanner.nextLine(); // Sửa lại thành kiểu String để khớp với constructor

                                System.out.println("Enter Seller Name: ");
                                String employeeName = scanner.nextLine();

                                System.out.println("Enter Seller Email: ");
                                String employeeEmail = scanner.nextLine();

                                System.out.println("Enter Seller Phone Number: ");
                                String employeePhoneNumber = scanner.nextLine();

                                System.out.println("Enter Seller Position: ");
                                String employeePosition = scanner.nextLine();

                                System.out.println("Enter Seller Salary: ");
                                double employeeSalary = scanner.nextDouble();
                                scanner.nextLine(); // Consume newline

                                System.out.println("Enter Seller Sales Target: ");
                                int salesTarget = scanner.nextInt();
                                scanner.nextLine(); // Consume newline

                                System.out.println("Enter Seller Products Sold: ");
                                int productsSold = scanner.nextInt();
                                scanner.nextLine(); // Consume newline

                                newSaler = new Saler(employeeId, employeeName, employeeEmail, employeePhoneNumber, employeePosition,employeeSalary,salesTarget,productsSold);
                                listEmployee.addEmployee(newSaler);
                                System.out.println("Employee added successfully.");
                                break;
                                case 2:
                                    System.out.println("Infor Saler ");
                                    newSaler.toInfo();
                                    break;
                                case 3:
                                    System.out.println("Delete Saler ");
                                    String IdSalerToDelete= scanner.nextLine();
                                    listEmployee.DeleteEmployee(IdSalerToDelete);
                                    break;

                                case 4:
                                    System.out.println("Sarch Saler ");
                                    String IdSalerToFind= scanner.nextLine();
                                    listEmployee.SearchEmployee(IdSalerToFind);
                                    break;
                                case 5:
                                    System.out.println("Edit Saler ");
                                    listEmployee.editEmployee(newSaler);
                                    break;
                                case 6:
                                    System.out.println("Delete all Saler");
                                    listEmployee.deleteAllSaler();
                        }

                    }
                    while (choice2 != 0);

                case 3:
                    int choice3 =0;
                    do {
                        System.out.println("Welcome to the Employee Manage");
                        System.out.println("1. Add Manager");
                        System.out.println("2. Display Manager");
                        System.out.println("3. Delete Manager");
                        System.out.println("4. Search Manager");
                        System.out.println("5. Edit Manager");
                        System.out.println("6. Delete all Manager");
                        System.out.println("0. Exit");
                        int choice4 = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice4) {
                            case 1:
                                System.out.println("Enter Manager ID: ");
                                String managerId = scanner.nextLine();
                                System.out.println("Enter Manager Name: ");
                                String managerName = scanner.nextLine();
                                System.out.println("Enter Manager Email: ");
                                String managerEmail = scanner.nextLine();
                                System.out.println("Enter Manager Phone Number: ");
                                String managerPhoneNumber = scanner.nextLine();
                                System.out.println("Enter Manager Position: ");
                                String managerPosition = scanner.nextLine();
                                System.out.println("Enter Manager Salary: ");
                                double managerSalary = scanner.nextDouble();
                                scanner.nextLine(); // Consume newline
                                System.out.println("Enter Manager Department: ");
                                String managerDepartment = scanner.nextLine();
                                System.out.println("Enter Manager Salary Coefficient: ");
                                double managerSalaryCoefficient = scanner.nextDouble();
                                scanner.nextLine();
                                newManager = new Manager(managerId,managerName,managerEmail,managerPhoneNumber,managerPosition,managerSalary,managerDepartment,managerSalaryCoefficient);
                                listEmployee.addEmployee(newManager);
                                break;
                            case 2:
                                System.out.println("Infor Manager ");
                                newManager.toInfo();
                                break;
                            case 3:
                                System.out.println("Delete Manager ");
                                String IdManagerToDelete= scanner.nextLine();
                                listEmployee.DeleteEmployee(IdManagerToDelete);
                                break;
                            case 4:
                                System.out.println("Sarch Manager ");
                                String IdManagerToFind= scanner.nextLine();
                                listEmployee.SearchEmployee(IdManagerToFind);
                                break;
                            case 5:
                                System.out.println("Edit Manager ");
                                listEmployee.editEmployee(newManager);
                                break;
                            case 6:
                                System.out.println("Delete all Manage");
                                listEmployee.deleteAllManage();
                        }
                    }
                    while (choice3 != 0);

            }


        }while (choiceLaptopOrEmployee!=0);
        scanner.close();
    }
}
