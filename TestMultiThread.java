package Multithreading;

public class TestMultiThread {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sai");
        e1.start();
        Manager m1 = new Manager("Ayyappa");
        m1.start();
        System.out.println(Thread.activeCount());



    }
}
class   Employee extends Thread { // thread is a class
    public Employee(String TName) {
        super(TName);

    }
    public void run() {
        System.out.println("welcome Employee");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

    }


}
class  Manager extends Thread {
    public Manager(String TName) {
        super(TName);
    }
    public void run() {
        System.out.println("welcome manager");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

    }
}