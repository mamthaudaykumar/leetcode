from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        initial_pointer = 0
        for i in range(0, len(nums)):
            if nums[i] !=0:
                nums[initial_pointer] = nums[i];
                initial_pointer += 1

        for i in range(initial_pointer, len(nums)):
            nums[i] = 0;





if __name__ == "__main__":
    sol =Solution()
    nums = [0, 1, 0, 3, 12]
    sol.moveZeroes(nums)
    print(nums)