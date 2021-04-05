# Stacks and Queues
Create a brand new PseudoQueue class that only uses two internal stacks for implementation.

## Challenge
Identify and implement a efficient solution for the PseudoQueue.

## Approach & Efficiency
Time: O(1) amortized, O(n) worst case per operation
Space: O(n) (depends on stack implementation)

# challenges.PseudoQueue/Queue<T>
## values

## Methods

### enqueue
    args:
        <T> value | The value you would like to add to the queue.

    returns:
        void

This takes any value as an argument and adds a new node with that value to the top of the queue with an O(1) Time performance.

### dequeue
    args:

    returns:
        <T> | The value from the node.

Removes the node from the front of the queue and returns the node’s value. This a time: O(1) amortized, O(n) worst case for a single operation

---

### toString
    args:

    returns:
        String | A string representing the object.

This will add a new node with the given newValue immediately before the first value node. This has a cost of O(n).
