package com.mamta.leetcode;

import org.junit.jupiter.api.Test;

import static java.lang.Math.min;

public class Leet11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left<right) {
            int width = right - left;
            int area = min(height[right] , height[left]) * width;
            max = Math.max(area, max);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    @Test
    public void solution() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int capacity = maxArea(height);

        System.out.println("Capacity: " + capacity);
    }
}
