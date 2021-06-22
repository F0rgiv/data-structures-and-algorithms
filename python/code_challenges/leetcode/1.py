class Solution:
    # https://leetcode.com/problems/two-sum/
    # Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    # You may assume that each input would have exactly one solution, and you may not use the same element twice.
    # You can return the answer in any order.
    
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seenNums = {}
        
        i = 0
        while i < len(nums):
            
            #check if there is a solution
            for otherNum in seenNums.keys():
                if otherNum + nums[i] == target:
                    return [seenNums[otherNum], i]

            # add to dictonary
            seenNums[nums[i]] = i
            i += 1
        return 'none found'