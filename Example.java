package Multithreading;

public class Example implements Runnable {
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String[] agrs){
        Example example = new Example();
        Thread thread = new Thread(example);
        thread.start();
    }


}
