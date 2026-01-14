from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        index_prev = 0;
        for i in range(1, len(nums)):
            if(nums[i] != nums[index_prev]):
                index_prev = index_prev + 1
                nums[index_prev] = nums[i]
        return index_prev+1;



if __name__ == '__main__':
    sol = Solution()
    nums = [1, 1, 2, 3, 3]
    size = sol.removeDuplicates(nums)
    print(size)



