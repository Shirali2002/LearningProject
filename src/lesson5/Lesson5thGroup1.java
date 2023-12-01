package src.lesson5;

import java.util.Scanner;

public class Lesson5thGroup1 {


    public static void main(String[] args) {
        xarici:
        for (int i = 0; i < 3; i++) {

            System.out.println("xarici for ishledi");
            if (i==1) {
                continue;
            }

            daxili:
            for (int j = 0; j < 2; j++) {
                if (j==1) {
                    continue;
                }

                System.out.println("daxili for ishledi");
            }
        }
    }



//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("evvel for ishledi");
//
//            if (i == 3) {
//                continue;
//            }
//
//            System.out.println("sonra for ishledi");
//
//
//
//        }
//    }


//    public static void main(String[] args) {
//        xariciFor:
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("xarici for ishledi");
//
//            daxiliFor:
//            for (int j = 0; j < 2; j++) {
//                if (j==1) {
//                    break xariciFor;
//                }
//
//                System.out.println("daxili for ishledi");
//            }
//        }
//    }


//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//
//            System.out.println(i);
//
//            if (i == 7) {
//                break;
//            }
//
//                System.out.println("after break");
//        }
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("xarici for ishledi");
//
//            for (int j = 0; j < 2; j++) {
//                System.out.println("daxili for ishledi");
//            }
//
//        }
//    }

//    public static void main(String[] args) {
//
//        for (int start = 1; start <= 10; start++){
//            System.out.println(start);
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        for (int start = 1, end = 10; start <= end; start++){
//            System.out.println(start);
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        for (int start = 1; start <= 10; start++){
//            System.out.println(start);
//        }
//
//    }

//    public static void main(String[] args) {
//        int startPoint = 1;
//        int endPoint = 10;
//
//        while (startPoint <= endPoint) {
//            System.out.println(startPoint);
//            startPoint+=2;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean isUserAgilli = true;
//
//        do {
//            System.out.println("""
//                    Menyumuz:
//                        1. kabab
//                        2. kartoska
//                        3. burger
//                    """);
//
//            System.out.println("Bunlardan birini secin");
//            int secim = sc.nextInt();
//
//            if (secim < 1 || secim > 3) {
//                isUserAgilli = false;
//            }
//
//        } while (isUserAgilli);
//    }



//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("salam necesen?");
//        }
//    }

// public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt(); // 5
//
//        while (i > 0) {
//            System.out.printf("Dovr davam edir. 'i' ededi: %d\n", i);
//            i--;
//        }
//
//        System.out.println("dovr bitdi.");
//    }

}
