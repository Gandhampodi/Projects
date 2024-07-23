package Multithreading;

public class TestMultiThread2 {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            public void run() {
                System.out.println("Welcome to USA");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
            }
        };
        Runnable runnable2 = new Runnable(){
            public void run() {
                System.out.println("Welcome to USA");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
            }
        };
        Thread thread1 = new Thread(runnable1,"t1");
        Thread thread2 = new Thread(runnable2,"t2");
        thread1.start();
        thread2.start();

    }
}
