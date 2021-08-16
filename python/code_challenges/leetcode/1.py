from typing import List

class Solution:
    # https://leetcode.com/problems/two-sum/
    # Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    # You may assume that each input would have exactly one solution, and you may not use the same element twice.
    # You can return the answer in any order.

    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seenNums = {}

        i = 0
        while i < len(nums):

            # check if there is a solution
            for otherNum in seenNums.keys():
                if otherNum + nums[i] == target:
                    return [seenNums[otherNum], i]

            # add to dictonary
            seenNums[nums[i]] = i
            i += 1
        return 'none found'

    # https://leetcode.com/problems/longest-common-prefix/solution/
    # Write a function to find the longest common prefix string amongst an array of strings.
    # If there is no common prefix, return an empty string "".

    def getLongestPrefix(words):
        words = words.sort()
        result = ''
        MatchLeagth = 0
        i = 0
        while(i < len(words) - 1):
            if (words[i].slice(MatchLeagth + 1) == words[i+1].slice(MatchLeagth + 1)):
                result = words[i].slice(MatchLeagth + 1)
                MatchLeagth += 1
            else:
                continue
            i += 1
        return result

    # https://leetcode.com/problems/running-sum-of-1d-array/solution/
    def runningSum(self, nums: List[int]) -> List[int]:
        tmp = 0
        result = [] * len(nums)
        for num in nums:
            tmp = tmp+num
            result.append(tmp)
        return result


    # https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    def findMin(nums: List[int]) -> int:
        # perform search for lowest
        left: int = 0
        right: int = len(nums) - 1
        check: int = 0
        while check < len(nums) - 1:
            check = (int)(left + right / 2)
            if check == right:
                break
            if nums[check] > nums[check + 1]:
                return nums[check + 1]
            if nums[check] > nums[right]:
                right = check + 1
            else:
                left = check
        return nums[0]


    # https://leetcode.com/problems/island-perimeter/
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        solution = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                solution += self.getEdges(grid, i, j)
        return solution
    
    def getEdges(self, grid, i, j):
        solution = 0
        if grid[i][j] == 0:
             return solution
        if i-1 < 0 or grid[i-1][j] == 0:
            solution += 1
        if j-1 < 0 or grid[i][j-1] == 0:
            solution += 1
        if i+1 == len(grid) or grid[i+1][j] == 0:
            solution += 1
        if j+1 == len(grid[0]) or grid[i][j+1] == 0:
            solution += 1
        return solution


s = Solution
print(s.findMin(nums=[11,13,15,17]))
print(s.findMin(nums=[2,1]))

