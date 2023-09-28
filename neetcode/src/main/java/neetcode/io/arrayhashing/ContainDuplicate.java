package neetcode.io.arrayhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};

        if (containsDuplicate(nums)) {
            System.out.println("The array contains duplicate numbers");
        } else {
            System.out.println("No duplicate numbers found in the array");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i: nums) {
            if (!numSet.add(i)) {
                return true;
            }

            numSet.add(i);
        }

        return false;
    }
}
