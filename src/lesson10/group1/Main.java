package src.lesson10.group1;

public class Main {

    public static void main(String[] args) {
        Calculator bmw = new Calculator();
        bmw.name = "calc";
        bmw.reng = "qara";

        Calculator mercedes = new Calculator("Calculator", "qirmizi");

        System.out.println(bmw.reng);
        System.out.println(mercedes.reng);
    }

//    public static void main(String[] args) {
////        Car car = new Car();
//        Car car = new Car("qirmizi", 3000, 2012, 123123);
//        System.out.println(car.reng);
//        System.out.println(car.motor);
//        System.out.println(car.il);
//        System.out.println(car.getKilometraj());
//    }

//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        int cem = calculator.topla(5, 3);
//        System.out.println(cem);
//    }

//    public static void main(String[] args) {
//        Car car = new Car();
//        car.kilometraj = 123131;
//        car.reng = "qirmizi";
//        car.beyinVersiyasi = "qirmizi";
//        int kilometraj = car.getKilometraj();
//        System.out.println(kilometraj);
//    }

//    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.reng = "qirmizi";
//        car1.motor = 4000;
//        car1.il = 2002;
//
//
//        Car car2 = new Car();
//        car2.reng = "Qara";
//        car2.motor = 2500;
//        car2.il = 2010;
//
//        System.out.println(car1.reng);
//        System.out.println(car2.reng);
//    }

//    public static void main(String[] args) {
//        Car car1 = new Car();
//        System.out.println(car1.reng);
//        System.out.println(car1.motor);
//        System.out.println(car1.il);
//
//        car1.drive();
////        car1.tormoz();
//    }
}
