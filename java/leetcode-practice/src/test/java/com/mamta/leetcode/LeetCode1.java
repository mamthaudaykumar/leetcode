package com.mamta.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    @Test
    public void targetSum() {
        int target = 9;
        int[] nums = {2, 7, 11, 15};

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

        }
    }

