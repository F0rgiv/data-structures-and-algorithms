# Insertion sort

Insertion sort is a simple sorting algorithm that works by moving from the begining of the list and comparing each value
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

![Whiteboard](assets\insert-sort\pass1.PNG)

blah

### pass1

![Whiteboard](assets\insert-sort\pass1.PNG)

blah