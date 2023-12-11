package src.lesson11;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3, 4, 5, 6, 3};
        int val = 3;   //{2,2,4,5,6}
        int result = removeElement.removeElement(nums, val);
        System.out.println("Length of result" + result);
        for (int i = 0; i < result; i++) {
            System.out.println(nums[i]);

        }

    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}