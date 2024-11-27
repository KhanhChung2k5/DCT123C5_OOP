package Project.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.Position;

import Project.Staff.Employee;
import Project.Staff.Manager;
import Project.Staff.Saler;
import Project.File.DataImport;

@SuppressWarnings("unused") //todo: debug fix add employee vao mang ko luu tru 
public class EmployeeManage {
    Scanner scanner = new Scanner(System.in);
    private List<Employee> employees = new ArrayList<>();

        public EmployeeManage(){
            this.employees = new ArrayList<>();
        }
        
        public List<Employee> displayEmployee(){
            return employees;
        }//chắc không dùng tới..
        
        public  void  addEmployee(Employee newEmployee){
            employees.add(newEmployee);
        }

        public Employee searchEmployee(String id){
            for (Employee employee : employees) {
                if (employee.getId() != null && employee.getId().equals(id)) {
                    return employee;
                }
            }
            return null;
        }

        public boolean DeleteEmployee(String id){
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

    public List<Employee> getEmployeesByPosition(String position) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getPosition() != null && employee.getPosition().equalsIgnoreCase(position)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    @SuppressWarnings("null")
    public void editEmployee(Employee employee){

        if (employee instanceof Saler){
            int choice=0;
            do {
                System.out.println("Please enter the ID of the Saler you would like to edit:");
                String searchIdToEdit = scanner.nextLine();
                scanner.nextLine();
                Employee editSaler  = searchEmployee(searchIdToEdit);
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
                Employee editManager = searchEmployee(searchIdToEdit);
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
