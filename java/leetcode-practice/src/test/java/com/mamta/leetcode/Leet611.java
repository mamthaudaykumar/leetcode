package com.mamta.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leet611 {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        for (int k = nums.length - 1; k >= 2; k--) {
            int left = 0, right = k - 1;

            while (left < right) {
                if (nums[left] + nums[right] > nums[k]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2,2,3,4};
        int tri = triangleNumber(nums);
        System.out.println(tri);
    }


}
