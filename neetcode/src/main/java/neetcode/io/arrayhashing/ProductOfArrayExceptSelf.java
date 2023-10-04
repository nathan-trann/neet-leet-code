package neetcode.io.arrayhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] answer = productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums) + "\n" + "Output: " + Arrays.toString(answer));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= postfix;
            postfix *= nums[i];
        }


        return answer;
    }
}
