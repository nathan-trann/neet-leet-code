package neetcode.io.arrayhashing;

import java.util.*;

public class TopKFrequentElements {
    
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,1,2,3,1};
        String answer = Arrays.toString(topKFrequent(nums, 2));
        System.out.println("The answer is: " + answer);
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length];

        for (int num: nums) {
            map.merge(num, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int val: bucket[i]) {
                    res[index++] = val;
                    if (index == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
