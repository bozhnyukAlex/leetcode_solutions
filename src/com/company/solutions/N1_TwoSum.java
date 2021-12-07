package com.company.solutions;

import java.util.HashMap;
import java.util.Map;
public class N1_TwoSum {
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Must be exactly one solution!");
    }
    // O(n) time, O(n) space
    public int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sec = target - nums[i];
            if (map.containsKey(sec) && map.get(sec) != i) {
                return new int[] {i, map.get(sec)};
            }
        }
        throw new IllegalArgumentException("Must be exactly one solution!");
    }
}
