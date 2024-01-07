package neetcode.io.twopointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        // Given
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, -1, 2));
        expected.add(List.of(-1, 0, 1));

        // When
        List<List<Integer>> actual = threeSum(nums);

        // Assert
        System.out.println(expected.equals(actual));
    }


    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int target = nums[i] + nums[left] + nums[right];
                    if (target > 0) {
                        right--;
                    } else if (target < 0) {
                        left++;
                    } else {
                        List<Integer> list = List.of(nums[i], nums[left], nums[right]);
                        results.add(list);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    }
                }
            }
        }

        return results;
    }
}
