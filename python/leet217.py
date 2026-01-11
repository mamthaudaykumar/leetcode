from operator import truediv
from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            if num in seen:
                return True
            seen.add(num)
        return False


if __name__ == "__main__":
    nums = [1, 2, 3, 4, 4]
    sol = Solution()
    has_duplicate = sol.containsDuplicate(nums)
    print(has_duplicate)


