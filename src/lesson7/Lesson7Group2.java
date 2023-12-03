package src.lesson7;

import java.util.Scanner;

public class Lesson7Group2 {

//      {
//            {1 2},
//            {3 4},
//            {5 6}
//      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("icerideki arraylerin uzunlugunu daxil edin:");
        int b = sc.nextInt();

        System.out.println("umumi arrayin uzunlugunu daxil edin:");
        int a = sc.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d %d indeksli elementi daxil edin:\n", i, j);
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
//
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//    }

//    public static void main(String[] args) {
//        int[][] arr = new int[][]
//                {//      0  1  2
//                        {1, 2, 3}, // 0
//                        {4, 5, 6}, // 1
//                        {7, 8, 9}  // 2
//                };
//
//        int a = arr[1][2];
//        System.out.println(a);
//    }

//    public static void main(String[] args) {
//        int[] array1 = new int[]{1, 2, 3, 4, 5}; // { 1, 2, 3, 4, 5 }
//        int[] array2 = new int[array1.length];   // { 1, 2, 3 ,4 ,5 }
//
//        for (int i = 0; i < array1.length; i++) { // 0 -> 4
//            array2[i] = array1[i]; // array2[1] = array1[1];
//        }
//
//        // cap hissesi basladi
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3, 4, 5};
//        arr[6] = 1; // -> ArrayIndexOutOfBoundsException
//
//        System.out.println(arr[5]); // -> ArrayIndexOutOfBoundsException
//    }

//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3, 4, 5}; // 5
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
    //girisde verilen  3 5 -7 7 5 -9 -4
    //netice           3 5 -7 -9 5 7 -4

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("arrayin uzunlugunu daxil edin:");
//        int uz = sc.nextInt();
//
//        int[] arr = new int[uz];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d indeksli elementi daxil edin:\n", i);
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println();
//
//    }

//    public static void main(String[] args) {
//        //                      0  1  2  3  4
//        int[] arr1 = new int[] {1, 2, 3, 4, 5}; // uzunluq = 5
//
//        int[] arr2 = new int[5]; // 0 0 0 0 0
//        arr2[0] = 1; // 1 0 0 0 0
//        arr2[1] = 2; // 1 2 0 0 0
//        arr2[2] = 3; // 1 2 3 0 0
//        arr2[3] = 4; // 1 2 3 4 0
//        arr2[4] = 5; // 1 2 3 4 5
//    }

//    public static void main(String[] args) {
//        int[] sagirdler = new int[10];
//
//        System.out.println();
//    }

}
