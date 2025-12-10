package Inheritance_Task;

import java.util.ArrayList;
import java.util.Scanner;

class Applicant {
    int id;
    String name;
    double experience;

    Applicant(int id, String name, double experience) {
        this.id = id;
        this.name = name;
        this.experience = experience;
    }
}
public class Task_JobApplicantShortlistingSystem {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Applicant> shortlisted = new ArrayList<>();
	        ArrayList<Applicant> rejected = new ArrayList<>();
	        System.out.print("Enter number of applicants: ");
	        int n = sc.nextInt();
	        sc.nextLine(); 
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Applicant " + (i + 1));
	            System.out.print("Enter Applicant ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Years of Experience: ");
	            double exp = sc.nextDouble();
	            Applicant a = new Applicant(id, name, exp);	            
	            if (exp >= 2) {
	                shortlisted.add(a);
	            } else {
	                rejected.add(a);
	            }
	        }	        
	        System.out.println("\n====== SHORTLISTED APPLICANTS ======");
	        if (shortlisted.isEmpty()) {
	            System.out.println("No applicants shortlisted.");
	        } else {
	            for (Applicant a : shortlisted) {
	                System.out.println("ID: " + a.id +
	                                   " | Name: " + a.name +
	                                   " | Experience: " + a.experience + " years");
	            }
	        }
	        System.out.println("\n====== REJECTED APPLICANTS ======");
	        if (rejected.isEmpty()) {
	            System.out.println("No applicants rejected.");
	        } else {
	            for (Applicant a : rejected) {
	                System.out.println("ID: " + a.id +
	                                   " | Name: " + a.name +
	                                   " | Experience: " + a.experience + " years");
	            }
	        }
	        sc.close();
	}
}