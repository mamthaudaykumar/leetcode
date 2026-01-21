class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_length = 0
        left = 0

        seen_chars = {}

        for right in range(0, len(s)):
            char = s[right]
            if char in seen_chars:
                left = max(left, seen_chars[char]+1)

            seen_chars[char] = right
            max_length = max(max_length, right-left+1)

        return max_length


if __name__ == '__main__':
    s = Solution()
    val = "pwwkew"
    s.lengthOfLongestSubstring(val)