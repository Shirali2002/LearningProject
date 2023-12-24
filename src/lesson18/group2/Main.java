package src.lesson18.group2;

import src.lesson18.group2.exception.VsAcademyException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        while (true) {
//            Calculator calculator = new Calculator();
//            System.out.println("calculator yarandi");
//        }
//    }

    public static void main(String[] args) throws VsAcademyException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>18){
            System.out.println("ela, xos gelmisiniz");
        } else {
            throw new VsAcademyException("18 yasdan kicikdir");
        }
    }

//    public static void main(String[] args) {
//        try {
//            Calculator.exceptionAtanMethod();
//        } catch (FileNotFoundException ex){
//            System.out.println("methodumuz exceptin atdi ve catch oldu");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a-ni daxil edin");
//        int a = sc.nextInt();
//
//        System.out.println("b-ni daxil edin");
//        int b = sc.nextInt();
//
//        try {
//            int result = Calculator.divide(a, b);
//            System.out.printf("a/b=%d", result);
//        } catch (ArithmeticException ex) {
//            System.out.println("bolen 0 ola bilmez");
//        }
//    }

//    public static void main(String[] args) {
//        try {
////            int a = 100 / 0; // ArithmeticException
//            int[] arr = new int[5]; // ArrayIndexOutOfBoundsException
//            int i = arr[6];
//            System.out.println("try-in icerisi");
//        } catch (Throwable ex) {
//            System.out.println("RuntimeException catch-in icerisi");
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            // code
//            System.out.println("exceptiondan evvel");
//
////            int a = 100 / 0; // ArithmeticException
////
////            int[] arr = new int[5]; // ArrayIndexOutOfBoundsException
////            int i = arr[6];
//
//            System.out.println("try-in icerisi");
//        } catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException catch-in icerisi");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("ArrayIndexOutOfBoundsException catchin icerisi");
//        } finally {
//            System.out.println("app-imizi istifade etdiyinize gore tesekkur edirik.");
//        }
//    }

//    public static void main(String[] args) {
////        Throwable
////        int a = 100/0;
//
////        int[] arr = new int[5];
////        int i = arr[6];
//    }

}
