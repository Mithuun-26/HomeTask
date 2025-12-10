package Inheritance_Task;
class Person {
    String name = "John Doe";
    int age = 30;
    void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    String jobTitle = "Software Developer";
    void showEmployeeDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Job Title : " + jobTitle);
    }
}
public class Task1 {

	public static void main(String[] args) {
		 Employee emp = new Employee();
	        System.out.println("Properties from Superclass:");
	        emp.showPersonDetails();   
	        System.out.println("\nProperties from Subclass:");
	        emp.showEmployeeDetails();
	}

}
