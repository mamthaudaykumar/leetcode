package com.mamta.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

public class Leet567 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i< s1.length(); i++) {
            count1[s1.charAt(i)-'a'] ++;
        }

        int windowSize = s1.length();

        for(int i=0; i<windowSize; i++) {
            count2[s2.charAt(i)-'a']++;
        }

        if (match(count1, count2)) {
            return true;
        }


        for(int i=windowSize; i<s2.length(); i++) {

            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i - windowSize) - 'a']--; // remove leftmost char

            if(match(count1, count2)) {
return true;
            }

        }
        return false;

    }


    public boolean match(int[] count1, int[] count2) {
        for(int i =0; i<26;i++) {
            if(count1[i] != count2[i]) {
return false;
            }
        }
        return true;

    }
    @Test
    public void solution() {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2)); // Expected: true
    }
}
