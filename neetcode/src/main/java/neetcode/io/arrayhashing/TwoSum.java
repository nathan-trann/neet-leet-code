package neetcode.io.arrayhashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {1851, 2124, 2305, 2402, 2437, 5200, 6874, 7602, 9955, 10467, 12302, 13092,
                14483, 15809, 16702, 17679, 18073, 18782, 19785, 20284, 20483, 21769, 22226, 24763, 25602,
                25684, 26038, 27421, 28582, 30782, 30884, 31125, 33438, 34574, 35295, 38025, 39083, 41238,
                41874, 43469, 44122, 45933, 46450, 47330, 48234, 48979, 52587, 52602, 52768, 53053, 54613,
                54850, 55826, 55989, 56799, 57790, 59184, 59983, 63787, 64236, 64865, 64881, 65126, 65155,
                65437, 65797, 66944, 68737, 69731, 71220, 71558, 72457, 77078, 78168, 79252, 79950, 81043,
                81264, 81883, 82157, 83253, 83753, 84200, 85549, 85575, 85869, 86094, 87094, 87625, 87799,
                88765, 91095, 93756, 94179, 94200, 95075, 96422, 97495, 98821, 98918};

        int target = 137545;

        System.out.println("The answer is: " + Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {i, numToIndex.get(target - nums[i])};
            }

            numToIndex.put(nums[i], i);
        }

        return new int[] {};
    }
}
