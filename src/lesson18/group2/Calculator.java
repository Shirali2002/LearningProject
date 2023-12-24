package src.lesson18.group2;

import src.lesson16.group1.casting.Car;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Calculator {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void exceptionAtanMethod() throws FileNotFoundException {
        throw new FileNotFoundException("methodumuz exception atdi");
    }

//    public static int divide(int a, int b) {
//        try {
//            return a / b;
//        } catch (ArithmeticException ex) {
//            System.out.println("bolen 0 ola bilmez!");
//            return 0;
//        }
//    }

}
