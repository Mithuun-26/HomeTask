package Inheritance_Task;
abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("The animal is sleeping");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}
public class Task7 {

	public static void main(String[] args) {
		Dog myDog = new Dog();
        myDog.sound(); 
        myDog.sleep();

	}
}
