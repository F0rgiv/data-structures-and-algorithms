# Quick Sort

Quick sort works by selecting the the last index in a section of the array to be the "pivot" it then will check each element in the array and if it's less than the pivot height swap the element with the lowest index that it hasn't swapped yet. this results with everything to the left of the pivot being greater than itself to be to it's right and everything else to be to it's left. it then calls itself on the subset of the array that are to it's left and it's right until the length of the array that is being called is 1.

## Pseudocode

    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 2)
            // Sort the right
            QuickSort(arr, position, right)

    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left
        for i <- left to right do
            if arr[i] <= pivot
                Swap(arr, i, low++)
                
        // return the pivot index point
        return low

    ALGORITHM Swap(arr, i, low)
        DEFINE temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp

Let's walk through this with the example array [20,8,9,4,15,7,11]. Bellow is a visualization of how this will play out in the first pass Credit to @Ed Hou for the visual.

![Whiteboard](/assets/quicksort.PNG)

* First the pivot is set to the left most value ```11```
* We then check the first value ```20``` to see if it's less than of equal to the pivot. It isn't so we don't do anything.
* We then check the second value ```8``` to see if it's less than of equal to the pivot. It is so we swap it with the left most value.
* We then check the third value ```9``` to see if it's less than of equal to the pivot. It is so we swap it with the left most value that hasn't yet been swapped.
* We then check the fourth value ```4``` to see if it's less than of equal to the pivot. It is so we swap it with the left most value that hasn't yet been swapped.
* We then check the fifth value ```15``` to see if it's less than of equal to the pivot. It is so we swap it with the left most value that hasn't yet been swapped.
* We then check the sixth value ```15``` to see if it's less than of equal to the pivot. It isn't so we don't do anything.
* We then check the fifth value ```7``` to see if it's less than of equal to the pivot. It is so we swap it with the left most value that hasn't yet been swapped.
* finally we do this process with the last element in the subset of the array as the pivot is equal to itself we again swap it with the leftmost element that hasn't yet been swapped.
* We then begin this process again but only doing the subsets of the array to the left and the right of the index of the pivot from last time. In our case ```[8, 9, 4, 7]``` and ```[20, 11]```

## Efficiency

Time: O(n log(n)) as we will need to hit each element at least once and an additional time for each additional merge.
Space: O(log(n)) as no new space is needed