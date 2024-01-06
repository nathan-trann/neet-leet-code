package neetcode.io.twopointers;

import java.util.Arrays;

public class TwoSumSortedArray {

    public static void main(String[] args) {
        // Given
        int[] numbers = new int[] {2,7,11,15};
        int target = 13;
        int[] expected = new int[] {1, 3};

        // When
        int[] actual = twoSum(numbers, target);

        // Assert
        System.out.println(Arrays.equals(expected, actual));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
                j++;
                return new int[] {i, j};
            }
        }

        return new int[2];
    }
}
