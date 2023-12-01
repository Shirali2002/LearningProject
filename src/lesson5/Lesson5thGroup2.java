package src.lesson5;

import java.util.Scanner;

public class Lesson5thGroup2 {

    public static void main(String[] args) {

        // ctrl + alt + l

        xarici:
        for (int sira = 1; sira <= 4; sira++) {
            System.out.printf("%d | ", sira);

            // ctrl + /
            daxili:
            for (int yer = 1; yer <= 7; yer++) {
                if ((sira == 3 && yer == 5) ||
                        (sira == 4 && yer == 3) ||
                        (sira == 2 && yer == 2)) {
                    continue xarici;
                }
                // shift + alt
                System.out.printf("%d  ", yer);
            }
            System.out.println("\n");
        }
    }

//    public static void main(String[] args) {
//
//        for (int sira = 1; sira <= 4; sira++) {
//            System.out.printf("%d | ", sira);
//
//            for (int yer = 1; yer <= 7; yer++) {
//                if ((sira == 3 && yer == 5) ||
//                    (sira == 4 && yer == 3) ||
//                    (sira == 2 && yer == 2)) {
//                    continue;
//                }
//                System.out.printf("%d  ", yer);
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }

//    public static void main(String[] args) {
//
//        xariciFor:
//        for (int sira = 1; sira <= 4; sira++) {
//            System.out.printf("%d | ", sira);
//
//            daxiliFor:
//            for (int yer = 1; yer <= 7; yer++) {
//                if (sira == 3 && yer == 5) {
//                    break xariciFor;
//                }
//                System.out.printf("%d  ", yer);
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {
//        for (int sira = 1; sira <= 4; sira++) {
//            System.out.printf("%d | ", sira);
//
//            if (sira == 3) {
//                break;
//            }
//
//            for (int yer = 1; yer <= 7; yer++) {
//                System.out.printf("%d  ", yer);
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {
//        for (int sira = 1; sira <= 4; sira++) {
//            System.out.printf("%d | ", sira);
//            for (int yer = 1; yer <= 7; yer++) {
//                if (sira >=3 && yer == 5) {
//                    break;
//                }
//                System.out.printf("%d  ", yer);
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {
//        for (int sira = 1; sira <= 4; sira++) {
//            System.out.printf("%d | ", sira);
//            for (int yer = 1; yer <= 7; yer++) {
//                System.out.printf("%d  ", yer);
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {
//        for (int sira = 1; sira <= 4; sira++) {
//            for (int yer = 1; yer <= 7; yer++) {
//                System.out.printf("%d-%d  ", sira, yer);
//            }
//            System.out.println("\n");
//        }
//    }

//
//    public static void main(String[] args) {
//        for (;;) {
//            System.out.println("salam");
//        }
//    }

//    public static void main(String[] args) {
//        //   eded tanitmaq     sert      eded uzerinde emeliyyat
//        for (int count = 1; count <= 10; count+=2) {
//            System.out.println(count);
//        }
//    }

//    public static void main(String[] args) { // 1 2 3 4 5 6 7 8 9 10
//        int count = 1;
//        while (count <= 10) {
//            System.out.println(count);
//            count++;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//
//        do {
//            System.out.println(i);
//            i--;
//        } while (i>=0);
//
//        System.out.println("after while");
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("""
//                    Menyu:
//                        1. kabab
//                        2. kartoska
//                        3. burger
//                    """);
//            System.out.println("menyudan secim edin:");
//            int secim = sc.nextInt();
//            System.out.printf("%d secimini etdiniz\n", secim);
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//
//        while (i>=0) {
//            System.out.println(i);
//            i--;
//        }
//
//        System.out.println("after while");
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (x >= a && x <= b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }
//    }
}
