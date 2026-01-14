from typing import List


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        numbers.sort()
        left = 0
        right = len(numbers)-1
        while left < right:
            sum = numbers[left]+numbers[right]
            if sum==target:
                return [left+1, right+1]
            if sum < target:
                left+=1
            else:
                right-=1



if __name__=="__main__":
    s = Solution()
    numbers = [2, 7, 11, 15]
    target = 9
    values = s.twoSum(numbers, target)
    print(values)