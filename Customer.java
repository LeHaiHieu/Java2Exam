package org.example.CustomerRelationshipManagement;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
    private String Name;
    private String phoneNumber;
    private String Email;

    public Customer(String Name, String phoneNumber, String Email) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
    }
    public String getName(){
        return Name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return Email;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Customer> customerHashMap = new HashMap<>();
        while (true){
            System.err.println("Select an option: ");
            System.err.println("1.Add new customer ");
            System.err.println("2.Find by name ");
            System.err.println("3.Display all ");
            System.err.println("4.Exit ");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.err.println("Enter customer name: ");
                    String Name = scanner.nextLine();
                    System.err.println("Enter customer phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.err.println("Enter customer email: ");
                    String email = scanner.nextLine();
                    Customer customer = new Customer(Name, phoneNumber, email);
                    customerHashMap.put(Name, customer);
                    System.err.println("Customer added successfully!");
                    break;

                case 2:
                    System.err.println("Enter customer name: ");
                    String searchName = scanner.nextLine();
                    if (customerHashMap.containsKey(searchName)) {
                        Customer searchCustomer = customerHashMap.get(searchName);
                        System.err.println("Name: "+ searchCustomer.getName());
                        System.err.println("Phone number: "+ searchCustomer.getPhoneNumber());
                        System.err.println("Email: " + searchCustomer.getEmail());
                    } else {
                        System.err.println("Customer not found! ");
                    }
                    break;

                case 3:
                    System.err.println("All customers: ");
                    for (String key : customerHashMap.keySet()) {
                        Customer displayCustomer = customerHashMap.get(key);
                        System.err.println("Name: " + displayCustomer.getName());
                        System.err.println("Phone number:" + displayCustomer.getPhoneNumber());
                        System.err.println("Email:" + displayCustomer.getEmail());
                        System.err.println();
                    }
                    break;

                case 4:
                    System.err.println("Bye bye" + " " + "❤\uFE0F");
                    System.exit(0);
                default:
                    System.err.println("Invalid option");
                    break;
            }
        }
    }
}
