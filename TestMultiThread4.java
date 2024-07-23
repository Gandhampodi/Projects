package Multithreading;

public class TestMultiThread4 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        }
    };
        Runnable r2=()-> {
            for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        }};
        Thread t1=new Thread(r1,"t1");
        Thread t2=new Thread(r2,"t2");

        t1.start();



        t2.start();

    }
}
/* 0-new
1-Running
2-blocked
3-waiting(join)
4-waiting(Specific time/sleep)
5-terminated
 */