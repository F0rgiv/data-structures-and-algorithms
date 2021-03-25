# BinarySearch 
int binarySearch(int[] arr, int target)
Search a sorted array for the wanted value


## Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
1: Confirm the array isn't empty
2: Set highi, mid and low indes values.
3: while high doesn't = low + 1 loop
4: if arr[mid] is what we are looking for return mid.
5: if arr[mid] is greater than what we are looking for set high to mid.
6: if arr[mid] is smaller than what we are looking for set low to mid.
7: check the high and low to ensure that target isn't there.
8: return -1

This should have an efficiency of O(log(n)) as each pass will cut in half the remaning posable values.

## Solution
![Whiteboard](/assets/search.PNG)

## Collaborators
@Edward Hou, @Amelia Waggoner