package src.lesson14;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicateLeetcode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        System.out.println(containsDuplicate(arr));;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
