package Inheritance_Task;
class Parent {
    int value;
    Parent(int val) {
        value = val;
        System.out.println("Parent constructor called. Value = " + value);
    }
}
class Child extends Parent {
    Child(int val) {
        super(val);  
        System.out.println("Child constructor called. Value = " + val);
    }
}
public class Task4 {

	public static void main(String[] args) {
		Child obj = new Child(50);
	}
}