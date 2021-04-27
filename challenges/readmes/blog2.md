# Merge Sort

Merge Sort Works by cutting a list in half until it's down to just 1 elements in each list and then merging those together. 

## Pseudocode

    ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

Let's walk through this with the example array [8,4,23,42,16,15]. Billow is a visualization of how this will play out. With green arrays being the output of sorts. The dashed green line represents that the right side wne through the same logic as the left but was left out to keep the diagram more simple.

![Whiteboard](/assets/mergeSort.PNG)

* First the input array gets split into two. ```[8, 4, 23]``` and ```[42, 16, 15]```.
* We then call this function again passing in the left side ```[8, 4, 23]```.
    * Again we split the list resulting in ```[8]``` and ```[4, 23]```.
        * We then passing in the left side ```[8]``` which simply returns ```[8]``` as it's length is only 1.
        * We now pass in the right side ```[4, 23]```
            * We then passing in the left side ```[4]``` which simply returns ```[4]``` as it's length is only 1.
            * We then passing in the right side ```[23]``` which simply returns ```[23]``` as it's length is only 1.
            * We then merge the left and right ```[4]``` and ```[23]``` returning ```[4, 23]```
        * We then merge the left and right ```[8]``` and ```[4, 23]``` returning ```[8, 4, 23]```, notice we now have the left side in order.
* We then pass the right side in which will go through similar logic and eventually return ```[15,16,42]```
    * ......
* We then merger the left and right sides ```[4, 8, 23]``` and ```[15, 16, 42]``` as these are now in order this will return ```[4, 8, 15, 16, 32, 42]```

## Efficiency

Time: O(log(n)) as we will need to hit each element at least once and an additional time for each additional merge.
Space: O(1) as no new space is needed