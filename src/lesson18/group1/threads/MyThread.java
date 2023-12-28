package src.lesson18.group1.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("salam" + i);
        }
    }
}
