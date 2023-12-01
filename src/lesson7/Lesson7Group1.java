package src.lesson7;

import java.util.Scanner;

public class Lesson7Group1 {

    public static void main(String[] args) {
        int[][][] arr = new int[][][]
        {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {3, 2, 1},
                        {6, 5, 4}
                },
                {
                        {1, 5, 2},
                        {3, 6, 4}
                }
        };

        for (int i = 0; i < arr.length; i++) { //2
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3}, // 0 index
//                {4, 5, 6} // 1 index
//        };
//
//        for (int i = 0; i < matrix.length; i++) { //2
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        int[][] matrix = new int[2][3];
//        matrix[0][0] = 1;
//        matrix[0][1] = 2;
//        matrix[0][2] = 3;
//
//        matrix[1][0] = 4;
//        matrix[1][1] = 5;
//        matrix[1][2] = 6;
//
//        int[][] matrix2 = new int[][] {
//                {1, 2, 3},//index 0
//                {4, 5, 6} //index 1
//        };
//    }

//    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 2, 3};
//        int[] arr2 = new int[]{4, 5, 6};
//
//        int[][] matrix = new int[2][3];
//        matrix[0] = arr1;
//        matrix[1] = arr2;
//
//        int[][] matrix2 = new int[][] {
//                {1, 2, 3},//index 0
//                {4, 5, 6} //index 1
//        };
//    }

//    public static void main(String[] args) {
//        int[][] matrix1 = {
//                {1, 2, 3}, // 0 index
//                {4, 5, 6}, // 1 index
//                {7, 8, 9}  // 2 index
//        };
//
//        int[] a = matrix1[2];
//
//        int index1 = matrix1[0][0];
//        int index6 = matrix1[1][2];
//    }

//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3, 4, 5};
//        // arr2
//        int[] arr2 = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i];
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("arrayin uzunlugunu daxil edin.");
//        int len = sc.nextInt();
//
//        int[] arr = new int[len];
//
//        for (int i = 0; i < len; i++) {
//            System.out.printf("%d indeksli elementi daxil edin:\n", i);
//            int a = sc.nextInt();
//            arr[i] = a;
//        }
//
//        // ekrana cap etmek
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print( arr[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print( arr[i] + " ");
//        }
//    }

//    public static void main(String[] args) {
//        int a = 4;
//        System.out.println(a);

//        int[] arr = new int[5];
//        System.out.println(arr); // -> [I@1b28cdfa
//    }

//    public static void main(String[] args) {
//        int[] arr = new int[5];
//
//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
//        // 0 0 0 0 0

//        String[] arr = new String[5];
//
//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
//        // null null null null null
//    }

//    public static void main(String[] args) {
//        String[] arr = new String[] {"salam", "sagol", "necesen"};
//        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
//    }

//    public static void main(String[] args) {
//        //                     0  1  2  3  4
//        int[] arr = new int[] {1, 2, 3, 4, 5};
//        System.out.println(arr[2]); // -> 3
////        System.out.println(arr[7]); // -> ArrayIndexOutOfBoundsException
//
//    }

//    public static void main(String[] args) {
//        int a1= 1;
//        int a2= 2;
//        int a3= 3;
//        int a4= 4;
//        int a5= 5;
//
//        int[] arr = new int[5]; // 0, 1, 2, 3, 4
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
////        arr[5] = 6; //-> ArrayIndexOutOfBoundsException
//
//        int[] arr2 = new int[] {1, 2, 3, 4, 5};
//        int[] arr3 = {1, 2, 3, 4, 5};
//    }

}
