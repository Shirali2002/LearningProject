package src.lesson18.group1.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        System.out.println(myThread1.getName());
        System.out.println(myThread2.getName());
//        myThread1.start();
//        myThread1.join();
//        myThread2.start();
    }

//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("basladi");
//        Thread.sleep(5000); //5 -> 5000
//        System.out.println("bitdi");
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("salam" + i);
//        }
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("salam" + i);
//        }
//    }

//    public static void main(String[] args) {
//        MyRunnable myRunnable1 = new MyRunnable();
//        Thread thread1 = new Thread(myRunnable1);
//
//        MyRunnable myRunnable2 = new MyRunnable();
//        Thread thread2 = new Thread(myRunnable2);
//
//        thread1.start();
//        thread2.start();
//
//    }


//    public static void main(String[] args) {
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();
//
//        myThread1.start();
//        myThread2.start();
//    }

}
