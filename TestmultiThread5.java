package Multithreading;

public class TestmultiThread5 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 1; i < 1000; i += 100) {

            }
        };
        Runnable r2 = () -> {
            for (int i = 1; i < 4000; i += 100) {


            }
        };
        Runnable r3 = () -> {
            for (int i = 1; i < 5000; i += 100) {


            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();

    }

    class BrickDairy {
        int brickCount = 0;

        public void incrementBrickCount() {
            brickCount += 100;
        }

    }
}