package Multithreading;

public class ThreadActiveCount {
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println(t1.activeCount());
    }
}
