# Insertion sort

Insertion sort is a simple sorting algorithm that works by moving from the beginning of the list and comparing each value
to the one before. if it finds that two values should be swapped (a 2 comes before a 1) then it would swap those two
values and continue comparing the value that was moved down to the one on the left until it's in the right place.

## Pseudocode

    InsertionSort(int[] arr)
    
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp

Let's walk through this with the example array [8,4,23,42,16,15].

### pass1

![Whiteboard](/assets/insert-sort/pass1.PNG)

On pass one i will be set to 1 and j to 0 since the array at index 1 is greater than at index 0 index 1 or j+1 will get the value of 8 and as j is now less than 1 we will go to the next iteration.

### pass2

![Whiteboard](/assets/insert-sort/pass2.PNG)

on this pass i will be 2 and j 1. as the values at that index are in order nothing will change.

### pass3

![Whiteboard](/assets/insert-sort/pass3.PNG)

On this pass again the values are already in order so we will simply continue.

### pass4

![Whiteboard](/assets/insert-sort/pass4.PNG)

On this pass temp will be set to the value at index 4(16) and j will be set to 3. as these are out of order index 4(j+1) will be set to the value at j(42) and j changed to be 2. Again the values are out of order so we will change the value at index 3(j+1) to the value at j(23) and j will be changed to be 1. and now as j and j+1 are in order we will continue.

### pass5

![Whiteboard](/assets/insert-sort/pass5.PNG)

again the items are out of order so we will essentially swap the values at j and j+1 continuing to reduce the value of j until temp is in the correct location.

## Efficiency

Time: O(n^2) as we may potentially have to hit every element n times.
Space: O(1) as no new space is needed