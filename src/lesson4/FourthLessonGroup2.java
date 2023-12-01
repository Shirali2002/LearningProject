package src.lesson4;

import java.util.Scanner;

public class FourthLessonGroup2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        String s = sc.nextLine();

        switch (a) {
            case 1: //a == 1
                System.out.println("cox pis");
                break;
            case 2: //a==2
                System.out.println("pis");
                break;
            case 3:
                System.out.println("orta");
                break;
            case 4:
                System.out.println("yaxsi");
                break;
            case 5:
                System.out.println("ela");
                break;
            default:
                System.out.println("bele bir deyerlendirme yoxdur. 1 ile 5 arasinda eded daxil edin");
        }



    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//
////        if (a >= 0) {
////            System.out.println("musbetdir");
////        } else {
////            System.out.println("menfidir");
////        }
//
//        String result = a >= 0 ? "musbetdir" : "menfidir";
//        System.out.println(result);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        int weight = sc.nextInt();
//
//        // 4 + 3 = 7
//        if (age >= 18) {
//            if (weight > 50) {
//                System.out.println("qan donoru ola bilersiniz.");
//            } else {
//                System.out.println("cekinizi artirdiqdan sonra qan donoru ola bilersiz");
//            }
//        }
//
//        // 4 + 3 + 4 + 3 = 14
//        if (age >= 18 && weight > 50) {
//            System.out.println("qan donoru ola bilersiniz.");
//        } else if (age >= 18 && weight < 50) {
//            System.out.println("cekinizi artirdiqdan sonra qan donoru ola bilersiz");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        int weight = sc.nextInt();
//
//        if (age >= 18) {
//            if (weight > 50) {
//                System.out.println("qan donoru ola bilersiniz.");
//            }
//            System.out.println("skjdnfsjk");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        // a == 0  ---> beraberdir
//        // a < 0   ---> menfidir
//        // a > 0   ---> musbetdir
//
//        if (a == 0) {
//            System.out.println("beraberdir");
//        } else if (a < -5) {
//            System.out.println("-5 den kicikdir");
//        } else if (a >= -5 && a < 0) {
//            System.out.println("-5 ile 0 arasindadir");
//        } else {
//            System.out.println("musbetdir");
//        }
//
//        System.out.println("iflerden sonraki hisse");
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(); // a<1 ve ya a>10
//
//        if (a < 1 || a > 10) {
//            System.out.println("OK");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();  // ==10
//        int b = sc.nextInt();  // ==20
//        int c = sc.nextInt();  // ==30
//
//        if (a == 10 && b == 20 && c == 30) {
//            System.out.println("OK");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();  // 1 <= a < 10
//
//        if (a >= 1 && a < 10) {
//            System.out.println("OK");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        if (a >= 0) {
//            System.out.println("a musbet ededdir");
//        } else {
//            System.out.println("a menfi ededdir");
//        }
//
//    }

//    public static void main(String[] args) {
//
//        int a = -5;
//
//        boolean b = a >= 0;
//
//        if (b) {
//            System.out.println("a ededi musbetdir.");
//        }
//    }

}
