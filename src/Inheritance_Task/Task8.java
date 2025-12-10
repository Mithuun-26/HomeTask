package Inheritance_Task;
interface Parent1 {
    void methodA();
}
interface Child1 extends Parent1 {
    void methodB();
}
class DemoClass implements Child1 {
    @Override
    public void methodA() {
        System.out.println("Method A from Parent interface");
    }
    @Override
    public void methodB() {
        System.out.println("Method B from Child interface");
    }
}
public class Task8 {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.methodA();  
        obj.methodB();  
    }
}