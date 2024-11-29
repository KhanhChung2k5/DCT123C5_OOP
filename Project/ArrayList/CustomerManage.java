package Project.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Project.Customer.Customer;

public class CustomerManage {
    private List<Customer> customers;
    private Scanner scanner;

    public CustomerManage() {
        this.customers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //todo: hien thi danh sach khach hang
    public List<Customer> displayCustomers() {
        return customers;
    }

    //todo: them khach hang 
    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    //todo:  tim kiem thong tin khach hang thong qua ID 

    public Customer searchCustomer(String id) {
        for (Customer customer : customers) {
            
            //* : check xem lay ID cua khach hang co bi loi null hay khong va trong cac ID co ID nao cung voi ID can tim kiem hay khong 

            if (customer.getId() != null && customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    //?? xoa khach hang theo ID khach hang su dung lai ham tim kiem de tim kiem xem ID khach hang can xoa co ton tai hay khong 

    public boolean deleteCustomer(String id) {
        Customer findCustomer = searchCustomer(id);
        if (findCustomer != null) {
            customers.remove(findCustomer);
            return true;
        }
        return false;
    }

    //* xoa tat ca cac khach hang  */
    public void deleteAllCustomers() {
        customers.clear();
        System.out.println("Tat ca khach hang da duoc xoa khoi danh sach.");
    }

    //? ham chinh sua tung phan cua thong tin khach hang 
    public void editCustomer() {
        System.out.print("Nhap ID khach hang can sua: ");
        String customerId = scanner.nextLine();

        //todo: thuc hien tim kiem ID khach hang can chinh sua xem co ton tai hay khong 

        Customer customer = searchCustomer(customerId);
        if (customer == null) {
            System.out.println("Khong tim thay khach hang voi ID: " + customerId);
            return;
        }

        // Hiển thị thông tin hiện tại của khách hàng
        System.out.println("Thong tin khach hang hien tai:");
        System.out.println(customer);

        int choice;
        do {

            //? hien  thi menu lua chon cac lua chon co the sua chua trong thong tin khach hang
            
            System.out.println("\n--- Sua thong tin Khach Hang ---");
            System.out.println("1. Sua ten");
            System.out.println("2. Sua email");
            System.out.println("3. Sua so dien thoai");
            System.out.println("4. Sua dia chi");
            System.out.println("0. Luu thay doi va quay lai");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    String newName = scanner.nextLine();
                    customer.setName(newName);
                    System.out.println("Ten da duoc cap nhat thanh: " + newName);
                    break;
                case 2:
                    System.out.print("Nhap email moi: ");
                    String newEmail = scanner.nextLine();
                    customer.setEmail(newEmail);
                    System.out.println("Email da duoc cap nhat thanh: " + newEmail);
                    break;
                case 3:
                    System.out.print("Nhap so dien thoai moi: ");
                    String newPhoneNumber = scanner.nextLine();
                    customer.setPhoneNumber(newPhoneNumber);
                    System.out.println("So dien thoai da duoc cap nhat thanh: " + newPhoneNumber);
                    break;
                case 4:
                    System.out.print("Nhap dia chi moi: ");
                    String newAddress = scanner.nextLine();
                    customer.setAddress(newAddress);
                    System.out.println("Dia chi da duoc cap nhat thanh: " + newAddress);
                    break;
                case 0:
                    System.out.println("Luu thay doi va quay lai menu chinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } while (choice != 0);
    }
}
