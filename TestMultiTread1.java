package Multithreading;

public class TestMultiTread1 {
    public static void main(String[] args) {
        Employeer employeer=new Employeer();
        Thread t1=new Thread(employeer,"t1");
        t1.start();
        SeniorManager seniorManager=new SeniorManager();
        Thread t2=new Thread(seniorManager,"t2");
        t2.start();

    }
}
class Employeer implements Runnable {
    public void run(){
        System.out.println("welcome to Employee");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
class SeniorManager implements Runnable {
    public void run(){
        System.out.println("welcome to Manager");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}