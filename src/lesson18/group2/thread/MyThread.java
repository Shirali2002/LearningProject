package src.lesson18.group2.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("sleepden evvel");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("sleepden sonra");
        }
//    @Override
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("MyThread - " + i);
//        }
//    }
}
