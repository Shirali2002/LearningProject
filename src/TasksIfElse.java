package src;

import java.util.Scanner;

public class TasksIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


        if (x >= a && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

//    public static void main(String[] args) { //8371
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
