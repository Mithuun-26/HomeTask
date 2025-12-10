package Inheritance_Task;
class Ani {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class D extends Ani {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Task2 {

	public static void main(String[] args) {
		Ani a = new Ani();  
        D d = new D();      
        System.out.println("Superclass output:");
        a.sound();
        System.out.println("Subclass output:");
        d.sound();
	}
}