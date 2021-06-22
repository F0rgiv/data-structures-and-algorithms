package leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    /**
     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     You can return the answer in any order.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> readInts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (readInts.containsKey(target - nums[i])) return new int[]{i, readInts.get(target - nums[i])};
            readInts.put(nums[i], i);
        }
        return null;
    }
}
