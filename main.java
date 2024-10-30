import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptopA = new Laptop(
                "Laptop A",         // Name
                1,                  // ID
                "Maker A",         // Maker
                1000.0,            // Price
                "Laptop",           // Type
                2.5,               // Weight
                "Model A",         // Model
                24,                // Warranty Period
                "2023-01-01",      // Release Date
                "Intel i7",        // Processor
                16,                // RAM
                512,               // Storage
                "NVIDIA GTX 1650", // Graphics Card
                "Black",           // Color
                5,                 // Battery Life
                15.6,              // Screen Size
                "Windows 10",      // Operating System
                4                  // Adapter
        );//test case

        LaptopManage listLaptop = new LaptopManage();
        listLaptop.addLaptop(laptopA);//test case
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
        scanner.close();
    }
}
