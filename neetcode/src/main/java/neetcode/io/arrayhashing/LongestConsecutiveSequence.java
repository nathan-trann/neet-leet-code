package neetcode.io.arrayhashing;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };

        System.out.println(longestConsecutiveSequence(nums));
    }

    public static int longestConsecutiveSequence(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int longest = 1;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                while (numSet.contains(num + 1)) {
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);
            }

            if (longest > nums.length / 2) {
                break;
            }
        }

        return longest;
    }
}
