import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManage {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Laptop> laptops;

    public LaptopManage() {
        laptops = new ArrayList<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void displayLaptops() {
        for (Laptop laptop : laptops) {
            laptop.toInfo();
        }
    }



    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public Laptop searchLaptop(int idLaptop) {
        for (Laptop laptop : laptops) {
            if (laptop.getId() == idLaptop) {
                return laptop;
            }
        }
        return null;
    }

    public void deleteAllLaptops() {
        this.laptops.removeAll(this.laptops);
    }

    public void editLaptop() {
        System.out.println("Choose a laptop to edit (ID):");
        int searchIdToEdit = scanner.nextInt();
        scanner.nextLine();
        Laptop laptopToEdit = searchLaptop(searchIdToEdit);

        if (laptopToEdit == null) {
            System.out.println("Laptop with ID " + searchIdToEdit + " not found.");
            return;
        }

        int yourChoice;
        do {
            System.out.println("Choose a number to edit options:");
            System.out.println("1. ID");
            System.out.println("2. Name");
            System.out.println("3. Maker");
            System.out.println("4. Price");
            System.out.println("5. Type");
            System.out.println("6. Weight");
            System.out.println("7. Model");
            System.out.println("8. Warranty Period");
            System.out.println("9. Release Date");
            System.out.println("10. Processor");
            System.out.println("11. RAM");
            System.out.println("12. Storage");
            System.out.println("13. Graphics Card");
            System.out.println("14. Color");
            System.out.println("15. Battery Life");
            System.out.println("16. Screen Size");
            System.out.println("17. Adapter");
            System.out.println("18. Operating System");
            System.out.println("0. EXIT");

            yourChoice = scanner.nextInt();
            scanner.nextLine();

            switch (yourChoice) {
                case 1:
                    System.out.println("Change ID:");
                    int newId = scanner.nextInt();
                    laptopToEdit.setId(newId);
                    break;
                case 2:
                    System.out.println("Change Name:");
                    String newName = scanner.nextLine();
                    laptopToEdit.setName(newName);
                    break;
                case 3:
                    System.out.println("Change Maker:");
                    String newMaker = scanner.nextLine();
                    laptopToEdit.setMaker(newMaker);
                    break;
                case 4:
                    System.out.println("Change Price:");
                    double newPrice = scanner.nextDouble();
                    laptopToEdit.setPrice(newPrice);
                    break;
                case 5:
                    System.out.println("Change Type:");
                    String newType = scanner.nextLine();
                    laptopToEdit.setType(newType);
                    break;
                case 6:
                    System.out.println("Change Weight:");
                    double newWeight = scanner.nextDouble();
                    laptopToEdit.setWeight(newWeight);
                    break;
                case 7:
                    System.out.println("Change Model:");
                    String newModel = scanner.nextLine();
                    laptopToEdit.setModel(newModel);
                    break;
                case 8:
                    System.out.println("Change Warranty Period:");
                    int newWarrantyPeriod = scanner.nextInt();
                    laptopToEdit.setWarrantyPeriod(newWarrantyPeriod);
                    break;
                case 9:
                    System.out.println("Change Release Date:");
                    String newReleaseDate = scanner.nextLine();
                    laptopToEdit.setReleaseDate(newReleaseDate);
                    break;
                case 10:
                    System.out.println("Change Processor:");
                    String newProcessor = scanner.nextLine();
                    laptopToEdit.setProcessor(newProcessor);
                    break;
                case 11:
                    System.out.println("Change RAM:");
                    int newRAM = scanner.nextInt();
                    laptopToEdit.setRam(newRAM);
                    break;
                case 12:
                    System.out.println("Change Storage:");
                    int newStorage = scanner.nextInt();
                    laptopToEdit.setStorage(newStorage);
                    break;
                case 13:
                    System.out.println("Change Graphics Card:");
                    String newGraphicsCard = scanner.nextLine();
                    laptopToEdit.setGraphicsCard(newGraphicsCard);
                    break;
                case 14:
                    System.out.println("Change Color:");
                    String newColor = scanner.nextLine();
                    laptopToEdit.setColor(newColor);
                    break;
                case 15:
                    System.out.println("Change Battery Life:");
                    int newBatteryLife = scanner.nextInt();
                    laptopToEdit.setBatteryLife(newBatteryLife);
                    break;
                case 16:
                    System.out.println("Change Screen Size:");
                    double newScreenSize = scanner.nextDouble();
                    laptopToEdit.setScreenSize(newScreenSize);
                    break;
                case 17:
                    System.out.println("Change Adapter:");
                    double newAdapter = scanner.nextDouble();
                    laptopToEdit.setAdapter(newAdapter);
                    break;
                case 18:
                    System.out.println("Change Operating System:");
                    String newOperatingSystem = scanner.nextLine();
                    laptopToEdit.setOperatingSystem(newOperatingSystem);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (yourChoice != 0);
    }
    public void deleteLaptop(int id) {
        Laptop laptopToRemove = searchLaptop(id);
        if (laptopToRemove != null) {
            laptops.remove(laptopToRemove);
            System.out.println("Laptop with ID " + id + " has been deleted.");
        } else {
            System.out.println("Laptop with ID " + id + " not found.");
        }
    }
}
