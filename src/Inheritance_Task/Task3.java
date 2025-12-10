package Inheritance_Task;
class A {
    int a = 10;
    void showA() {
        System.out.println("Value from class A: " + a);
    }
}
class B extends A {
    int b = 20;
    void showB() {
        System.out.println("Value from class B: " + b);
    }
}
class C extends B {
    int c = 30;
    void showC() {
        System.out.println("Value from class C: " + c);
    }
}
public class Task3 {
	public static void main(String[] args) {
		 C obj = new C();  
	        obj.showA();  
	        obj.showB(); 
	        obj.showC();
	}
}
