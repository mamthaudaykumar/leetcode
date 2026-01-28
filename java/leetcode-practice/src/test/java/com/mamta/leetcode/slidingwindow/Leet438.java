package com.mamta.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leet438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramsIndex = new ArrayList<>();

        if (p.length() > s.length()) {
            return anagramsIndex;
        }

        int[] counts = new int[26];
        int[] countp = new int[26];

        // count characters in p
        for (int i = 0; i < p.length(); i++) {
            countp[p.charAt(i) - 'a']++;
        }

        int windowSize = p.length();

        // initialize first window in s
        for (int i = 0; i < windowSize; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        if (match(countp, counts)) {
            anagramsIndex.add(0);
        }

        // slide the window across s
        for (int i = windowSize; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;               // add new char
            counts[s.charAt(i - windowSize) - 'a']--;  // remove old char

            if (match(countp, counts)) {
                anagramsIndex.add(i - windowSize + 1);
            }
        }
        return anagramsIndex;
    }

    // helper function to check if two frequency arrays match
    public boolean match(int[] count1, int[] count2) {
        for (int j = 0; j < 26; j++) {
            if (count1[j] != count2[j]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void solution() {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p)); // ✅ Expected: [0, 6]
    }
}
