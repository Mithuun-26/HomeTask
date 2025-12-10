package Inheritance_Task;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    int id;
    String name;
    double salary;
    Customer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class Task_BankLoanEligibilityChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Customer> eligibleList = new ArrayList<>();
        ArrayList<Customer> notEligibleList = new ArrayList<>();
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1));
            System.out.print("Enter Customer ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Monthly Salary (₹): ");
            double salary = sc.nextDouble();
            Customer c = new Customer(id, name, salary);
            if (salary >= 25000) {
                eligibleList.add(c);
            } else {
                notEligibleList.add(c);
            }
        }
        System.out.println("\n====== ELIGIBLE CUSTOMERS FOR LOAN ======");
        if (eligibleList.isEmpty()) {
            System.out.println("No customer is eligible.");
        } else {
            for (Customer c : eligibleList) {
                System.out.println("ID: " + c.id +
                                   " | Name: " + c.name +
                                   " | Salary: ₹" + c.salary);
            }
        }       
        System.out.println("\n====== NOT ELIGIBLE CUSTOMERS ======");
        if (notEligibleList.isEmpty()) {
            System.out.println("All customers are eligible.");
        } else {
            for (Customer c : notEligibleList) {
                System.out.println("ID: " + c.id +
                                   " | Name: " + c.name +
                                   " | Salary: ₹" + c.salary);
            }
        }
        sc.close();
	}
}