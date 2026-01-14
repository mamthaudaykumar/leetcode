package com.mamta.leetcode.twopointer;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Leet217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicateRefMap = new HashSet<>();
        boolean duplicate = false;
        for(int i =0; i<nums.length; i++) {
            if(duplicateRefMap.contains(nums[i])) {
                duplicate = true;
                break;
            }
            duplicateRefMap.add(nums[i]);
        }
        return duplicate;
    }

    @Test
    public void findDuplicate() {
        int arr[] = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}

