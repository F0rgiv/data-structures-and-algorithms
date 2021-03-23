# Insert and shift an array
Insert an int into the center of an array.

## Challenge
Create a new array that will hold the new int plus the same information as was in the passed array.

## Approach & Efficiency
1: create new array.
2: copy first half of elements into the new array
3: copy second half into new array inserting at i+1
4: insert the added value to the middle of the array
5: return the array

This should have an efficiency of O(n) as the amount of memory and operations that will need to be performed will grow with the passed array.

## Solution
![Whiteboard](/assets/ArrayShift.PNG)

## Collaborators
@Edward Hou, @Andy Agulue, @Amelia Waggoner
