package Project.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import Project.Staff.Employee;
import Project.Staff.Manager;
import Project.Staff.Saler;
import Project.File.DataImport;

@SuppressWarnings("unused") //todo: debug fix add employee vao mang ko luu tru 
public class EmployeeManage {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Employee> listEmployee;

        public EmployeeManage(){
            this.listEmployee = new ArrayList<>();
        }
        public void displayEmployee(){
            for (Employee employee : this.listEmployee){
                employee.toString(); // doi tu toInfo sang to String //todo doi sang toInfo
            }
        }//chắc không dùng tới..
        public  void  addEmployee(Employee newEmployee){
            listEmployee.add(newEmployee);
        }

        public void DeleteEmployee(String Id){
            Employee findEmployee= SearchEmployee(Id);
            if (findEmployee != null) {
                listEmployee.remove(findEmployee);
                System.out.println("Laptop with ID " + Id + " has been deleted.");
            } else {
                System.out.println("Laptop with ID " + Id + " not found.");
            }
        }
        public Employee SearchEmployee(String Id){
            for (Employee employee : this.listEmployee) {
                if (employee.getId() == Id) {
                    return employee;
                }
            }
            return null;
        }
    public void deleteAllSaler() {
        for (int i = listEmployee.size() - 1; i >= 0; i--) {
            if (listEmployee.get(i) instanceof Saler) {
                listEmployee.remove(i);
            }
        }
    }
    public void deleteAllManage() {
        for (int i = listEmployee.size() - 1; i >= 0; i--) {
            if (listEmployee.get(i) instanceof Manager) {
                listEmployee.remove(i);
            }
        }
    }

    @SuppressWarnings("null")
    public void editEmployee(Employee employee){

        if (employee instanceof Saler){
            int choice=0;
            do {
                System.out.println("Please enter the ID of the Saler you would like to edit:");
                String searchIdToEdit = scanner.nextLine();
                scanner.nextLine();
                Employee editSaler  = SearchEmployee(searchIdToEdit);
                if (editSaler != null){
                    System.out.println("Not Found");
                    return;
                }
                System.out.println("Chose number to edit options");
                System.out.println("1. Id");
                System.out.println("2. Name");
                System.out.println("3. Email");
                System.out.println("4. Phone Number");
                System.out.println("5. Position");
                System.out.println("6. Salary");
                System.out.println("7. Sales Target");
                System.out.println("8. Products Sold");
                System.out.println("0. Back");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 0: // ADD THEM CASE 0 de back
                        System.out.println("Back");
                        break;
                    case 1:
                        System.out.println("Change ID:");
                        String newId = scanner.nextLine();
                        editSaler.setId(newId);
                        break;
                    case 2:
                        System.out.println("Change Name:");
                        String newName = scanner.nextLine();
                        editSaler.setName(newName);
                        System.out.println("Name updated successfully.");
                        break;

                    case 3:
                        System.out.println("Change Email:");
                        String newEmail = scanner.nextLine();
                        editSaler.setEmail(newEmail);
                        System.out.println("Email updated successfully.");
                        break;

                    case 4:
                        System.out.println("Change Phone Number:");
                        String newPhoneNumber = scanner.nextLine();
                        editSaler.setPhoneNumber(newPhoneNumber);
                        System.out.println("Phone Number updated successfully.");
                        break;

                    case 5:
                        System.out.println("Change Position:");
                        String newPosition = scanner.nextLine();
                        editSaler.setPosition(newPosition);
                        System.out.println("Position updated successfully.");
                        break;

                    case 6:
                        System.out.println("Change Salary:");
                        double newSalary = Double.parseDouble(scanner.nextLine());
                        editSaler.setSalary(newSalary);
                        System.out.println("Salary updated successfully.");
                        break;

                    case 7:
                        System.out.println("Change Sales Target:");
                        int newSalesTarget = Integer.parseInt(scanner.nextLine());
                        ((Saler)editSaler).setSalesTarget(newSalesTarget);
                        System.out.println("Sales Target updated successfully.");
                        break;

                    case 8:
                        System.out.println("Change Products Sold:");
                        int newProductsSold = Integer.parseInt(scanner.nextLine());
                        ((Saler)editSaler).setProductsSold(newProductsSold);
                        System.out.println("Products Sold updated successfully.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            }
            while(choice!=0);
        }else if (employee instanceof Manager) {
            int choice = 0;
            do {
                System.out.println("Please enter the ID of the Manager you would like to edit:");
                String searchIdToEdit = scanner.nextLine();
                Employee editManager = SearchEmployee(searchIdToEdit);
                if (editManager == null) {
                    System.out.println("Not Found");
                    return;
                }
                System.out.println("Chose number to edit options");
                System.out.println("1. Id");
                System.out.println("2. Name");
                System.out.println("3. Email");
                System.out.println("4. Phone Number");
                System.out.println("5. Position");
                System.out.println("6. Salary");
                System.out.println("7. Department");
                System.out.println("8. Salary Coefficient");
                System.out.println("0. Back");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Change ID:");
                        String newId = scanner.nextLine();
                        editManager.setId(newId);
                        break;
                    case 2:
                        System.out.println("Change Name:");
                        String newName = scanner.nextLine();
                        editManager.setName(newName);
                        System.out.println("Name updated successfully.");
                        break;
                    case 3:
                        System.out.println("Change Email:");
                        String newEmail = scanner.nextLine();
                        editManager.setEmail(newEmail);
                        System.out.println("Email updated successfully.");
                        break;
                    case 4:
                        System.out.println("Change Phone Number:");
                        String newPhoneNumber = scanner.nextLine();
                        editManager.setPhoneNumber(newPhoneNumber);
                        System.out.println("Phone Number updated successfully.");
                        break;
                    case 5:
                        System.out.println("Change Position:");
                        String newPosition = scanner.nextLine();
                        editManager.setPosition(newPosition);
                        System.out.println("Position updated successfully.");
                        break;
                    case 6:
                        System.out.println("Change Salary:");
                        double newSalary = Double.parseDouble(scanner.nextLine());
                        editManager.setSalary(newSalary);
                        System.out.println("Salary updated successfully.");
                        break;
                    case 7:
                        System.out.println("Change Department:");
                        String newDepartment = scanner.nextLine();
                        ((Manager) editManager).setDepartment(newDepartment);
                        System.out.println("Department updated successfully.");
                        break;
                    case 8:
                        System.out.println("Change Salary Coefficient:");
                        double newSalaryCoefficient = Double.parseDouble(scanner.nextLine());
                        ((Manager) editManager).setSalaryCoefficient(newSalaryCoefficient);
                        System.out.println("Salary Coefficient updated successfully.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 0);
        }
    }

}
