package src.lesson13.group2.overloading;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(3, 5);
        System.out.println(sum);
    }

//    public static void main(String[] args) {
//        Calculator.sum(2, 3);
//    }

//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        int sum = calculator.sum(5, 'A');
//
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        System.out.println(calculator.sum(6, 8));
//        System.out.println(calculator.sum(6, 8, 9));
//        System.out.println(calculator.sum(6, 8L));
//        System.out.println(calculator.sum(6F, 8F));
//        System.out.println(calculator.sum(6D, 8D));
//    }





}
