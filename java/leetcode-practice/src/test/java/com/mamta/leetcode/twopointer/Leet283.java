package com.mamta.leetcode.twopointer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Leet283 {

    public void moveZeroes(int[] nums) {

    }

    @Test
    public void moveZeroesInput() {
        int[] nums = {0,1,0,3,12};

        int insertPosition = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[insertPosition] = num;
                insertPosition++;
            }
        }

        while(insertPosition < nums.length) {
            nums[insertPosition] = 0;
            insertPosition++;
        }

        System.out.println(Arrays.toString(nums));
//        int zeroCount = 0;
////        int[] numssolution = new int[nums.length];
//        List<Integer> numssolution = new ArrayList<>();
//        for(int i =0; i<nums.length; i++) {
//            if(nums[i] == 0) {
//                zeroCount++;
//            } else {
//                numssolution.add(nums[i]);
//            }
//        }
//
//        if(zeroCount > 0) {
//            int i =0;
//            while(i < zeroCount) {
//                numssolution.add(0);
//                ++i;
//            }
//        }
//        System.out.println(numssolution.toString());

    }


//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
//
//
//
//    Example 1:
//
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [0]

}
