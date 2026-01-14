from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        max_water = 0
        while left < right:
            width = right-left
            area = min(height[left], height[right])*width
            max_water = max(area, max_water)

            if height[left] < height[right]:
                left += 1
            else:
                right-=1
        return max_water


if __name__ == "__main__":
    s = Solution()
    height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    print(s.maxArea(height))
    # Area Formula -> a =