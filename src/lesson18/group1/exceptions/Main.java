package src.lesson18.group1.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a ni daxil edin:");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin:");
        int b = sc.nextInt();

        try {
            int divide = a / b;
            System.out.printf("a/b=%d\n", divide);
        } catch (RuntimeException ex) {
            System.out.println("ArithmeticException bas verdi");
        }

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a ni daxil edin:");
//        int a = sc.nextInt();
//        System.out.println("b ni daxil edin:");
//        int b = sc.nextInt();
//
//        try {
//            int divide = a / b;
//            System.out.printf("a/b=%d\n", divide);
//        } catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException bas verdi");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("ArrayIndexOutOfBoundsException bas verdi");
//        } finally {
//            System.out.println("app-imizi istifade etdiyiniz ucun tesekkurler");
//        }
//
//    }

//    public static void main(String[] args) {
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("a ni daxil edin:");
//            int a = sc.nextInt();
//            System.out.println("b ni daxil edin:");
//            int b = sc.nextInt();
//
//            int divide = a / b;
//
//            System.out.printf("a/b=%d\n", divide);
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a ni daxil edin:");
//        int a = sc.nextInt();
//        System.out.println("b ni daxil edin:");
//        int b = sc.nextInt();
//
//        try {
//            int divide = a/b;
//            System.out.printf("a/b=%d", divide);
//        } catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException bas verdi");
//        }
//
//    }

}
