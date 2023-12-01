package src.lesson6;

import java.util.Scanner;

public class Lesson6Practice {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean check = true;
//
//
//        while (n > 0) { // 999
//            int r = n % 10; // 9 %2 = 1
//
//            if (r % 2 != 0) {
//                check = false;
//                break;
//            }
//
//            n = n / 10; // 99
//        }
//
//        if (check) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int r1 = n / 1000;
//        int r2 = (n % 1000) / 100;
//        int r3 = (n % 100) / 10;
//        int r4 = n % 10;
//
//        if (r1 % 2 == 0 && r2 % 2 == 0 && r3 % 2 == 0 && r4 % 2 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //3 reqemlidir
//
//        n = Math.abs(n);
//
//        // 198
//        int reqem1 = n / 100; // 1
//        int reqem2 = n % 100 / 10; //9
//        int reqem3 = n % 10; // 8
//
//        System.out.println(reqem1);
//        System.out.println(reqem2);
//        System.out.println(reqem3);
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long x = sc.nextLong();
//
//        if (x >= 10) {
//            System.out.println((long) Math.pow(x, 3) + 5 * x);
//        } else {
//            System.out.println((long) Math.pow(x, 2) - 2 * x + 4);
//        }
//    }


//    public static void mesele8885ByMina(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        n--;
//
//        if (n % 2 == 0) {
//            n--;
//        }
//
//        System.out.println(n);
//    }
//
//    public static void mesele8885(String[] args) {
//        Scanner sc = new Scanner(System.in);// alt+enter
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {//2
//            System.out.println(n - 1);//2
//        } else {
//            System.out.println(n - 2);
//        }
//
////
////        if (n % 2 == 1 || n % 2 == -1) {
////            System.out.println(n - 2);
////        } else {
////            System.out.println(n - 1);
////        }
//    }

//    public static void mesele8531(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (n % a == 0 && n % b == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

}
