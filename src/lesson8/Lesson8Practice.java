package src.lesson8;

import java.util.Scanner;

public class Lesson8Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uz = sc.nextInt();
        int[] arr = new int[uz];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        arr[minIndex] = max;
        arr[maxIndex] = min;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        //8088
//        int r1 = x / 1000;       //8
//        int r2 = x / 100 % 10;   //0
//        int r3 = x / 10 % 10;    //8
//        int r4 = x % 10;         //8
//
//
//        if (r1 != 0 && r2 != 0 && r3 != 0 && r4 != 0 &&
//                x % r1 == 0 && x % r2 == 0 && x % r3 == 0 && x % r4 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//
//        while (x > 0) {
//
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int number1 = x / 1000;
//        int number2 = x / 100 % 10;
//        int number3 = x / 10 % 10;
//        int number4 = x % 10;
//
//
//        if ((number1 == 3 && number2 == 7)
//                || (number2 == 3 && number3 == 7)
//                || (number3 == 3 && number4 == 7)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        boolean b = true;
//
//        while (a > 0) {
//            int i = a % 10;
//
//            if (i % 2 != 0) {
//                b = false;
//                break;
//
//            }
//            a = a / 10;
//        }
//        if (b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int boys = sc.nextInt();
//        int girls = sc.nextInt();
//        int count = sc.nextInt();
//
//        int rooms=(boys/count)+(girls/count);
//
//        if(boys%count!= 0){
//            rooms= rooms+1;
//
//        }
//
//        if(girls%count!=0){
//            rooms = rooms+1;
//        }
//
//        System.out.println(rooms);
//    }

//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int k = sc.nextInt();
//
//        int r = 0;
//
//        // oglanlar
//        if (n % k == 0) {
//            r += n / k;
//        } else {
//            r += n / k + 1;
//        }
//
//        // qizlar
//        if (m % k == 0) {
//            r += m / k;
//        } else {
//            r += m / k + 1;
//        }
//
//        System.out.println(r);
//    }

//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int k = sc.nextInt();
//        int y = (n / k + m / k);    // 6 12 3  -> 6
//                                    // 8 11 3  -> 5
//        System.out.println(y);
//    }
}
