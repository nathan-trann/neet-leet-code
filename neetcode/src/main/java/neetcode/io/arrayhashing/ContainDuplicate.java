package neetcode.io.arrayhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public static void main(String[] args) {

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
