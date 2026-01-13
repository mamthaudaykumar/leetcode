package com.mamta.leetcode;

import org.junit.jupiter.api.Test;

public class Leet125 {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    @Test
    public void solution() {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isPalindrome(s);

        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
