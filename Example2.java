package Multithreading;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
