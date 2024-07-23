package Multithreading;

public class TestMultiThread3 {
    public static void main(String[] args) {
        Runnable r1=()->System.out.println(Thread.currentThread().getName());
        Runnable r2=()->System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(r1,"t1");
        Thread t2=new Thread(r2,"t2");
        t1.start();
        t2.start();
        System.out.println(Thread.activeCount());
    }
}
