package src.lesson18.group2.thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("MyRunnable - " + i);
        }
    }
}
