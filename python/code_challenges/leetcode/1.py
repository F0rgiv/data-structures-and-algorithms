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
        result = []
        for num in nums:
            tmp = tmp+num
            result.append(tmp)
        return result
