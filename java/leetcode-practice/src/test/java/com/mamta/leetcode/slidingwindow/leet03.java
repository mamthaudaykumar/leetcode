package com.mamta.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class leet03 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
       int left = 0;
       int maxLength = 0;

       for(int right=0; right<s.length(); right++) {

           Character c = s.charAt(right);

           if(map.containsKey(c)) {
               left = Math.max(left, map.get(c)+1);
           }

           map.put(c, right);
           maxLength = Math.max(maxLength, right-left+1);
       }
       return maxLength;
    }

    @Test
    public void solution() {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
