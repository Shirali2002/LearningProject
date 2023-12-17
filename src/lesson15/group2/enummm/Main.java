package src.lesson15.group2.enummm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Car.MERCEDES_BENZ);
        System.out.println(Car.MERCEDES_BENZ.nameAz);
    }

//    public static void main(String[] args) {
//        int ordinal = Car.HONDA.ordinal();
//        System.out.println(ordinal);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("masin modelini sec:");
//        String masinModeliString = sc.nextLine();
//
//        Car car = Car.valueOf(masinModeliString);
//
//        System.out.println(car);
//    }

//    public static void main(String[] args) {
//        Car[] values = Car.values();
//
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }
//    }

//    public static void main(String[] args) {
////        checkCar("BMW123");
//        checkCarByEnum(Car.MERCEDES_BENZ);
//    }
//
//    public static void checkCarByEnum(Car car) {
//
//        if (Car.BMW.equals(car)) {
//            System.out.println("BMW");
//        } else if (Car.MERCEDES_BENZ.equals(car)) {
//            System.out.println("MERCEDES_BENZ");
//        }
//
//    }
//
//    public static void checkCar(String car) {
//
//        if ("BMW".equals(car)) {
//            System.out.println("BMW");
//        } else if ("MERCEDES_BENZ".equals(car)) {
//            System.out.println("MERCEDES_BENZ");
//        }
//
//    }

}
