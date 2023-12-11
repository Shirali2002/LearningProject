package src.lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
//        int n = sc.nextInt();
//        int[] a = new int[n];
        int[] nums = {2, 4, 5, 6, 1, 8, 9, 2};
        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.print(max);
            } else if (nums[i] == max) {
                System.out.print(min);
            } else {
                System.out.print(nums[i]);
            }
            if (i < nums.length - 1) {
                System.out.print(" ");
            }

        }

    }


}
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        float[] arr = new float[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = scanner.nextFloat();
//        }
//
//
//        // 5 3 4 1 5 6 7
////        min = arrayin ilk elementidir  min = 5
//        float min = arr[0]; // 5
//        for (int i = 1; i < size; i++) {  // i = 1   i = 2  i = 3
//            if (arr[i] < min) {    // arr[i] = 3   3 < 5
//                // arr[i] = 4   4 < 3
//                //arr[i]=1     1 < 3
//                min = arr[i];     // min =  3 // min = 1
//            }
//        }
//        System.out.println(min * 2);