# Stacks and Queues
Create a Node Stack and Queue class to implement a Stack and Queue.

## Challenge
Identify and implement a efficient solution for Queues and Stacks. 

## Approach & Efficiency
all operations have a constant time of O(1) with the exception of to String witch is O(n).
All operations will take the space of O(1).

# challenges.stacksandqueues/Node<T>
## values
    <T> value | The value stored in the Node
    Node<T> next | Pointer to another node.

## Methods

# challenges.stacksandqueues/Stack<T>
## values

## Methods

### push 
    args:
        <T> value | The value you would like to add to the stack.

    returns:
        void

This takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.

---

### pop 
    args:

    returns:
        <T> | The value from the node.

Removes the node from the top of the stack, and returns the node’s value. This has a cost of O(1).

---

### peek 
    args:

    returns:
        <T> | The value from the node.

returns the value of the node located on top of the stack. This has a cost of O(1).

---

### isEmpty 
    args:

    returns:
        boolean | true if the array is empty else false.   

Returns a boolean indicating whether or not the stack is empty. This has a cost of O(1).

---

### toString
    args:

    returns:
        String | A string representing the object.

This will add a new node with the given newValue immediately before the first value node. This has a cost of O(n).


# challenges.stacksandqueues/Queue<T>
## values

## Methods

### enqueue 
    args:
        <T> value | The value you would like to add to the queue.

    returns:
        void

This takes any value as an argument and adds a new node with that value to the top of the queue with an O(1) Time performance.

---

### dequeue 
    args:

    returns:
        <T> | The value from the node.

Removes the node from the front of the queue and returns the node’s value. This has a cost of O(1).

---

### peek 
    args:

    returns:
        <T> | The value from the node.

returns the value of the node located on top of the queue. This has a cost of O(1).

---

### isEmpty 
    args:

    returns:
        boolean | true if the array is empty else false.   

Returns a boolean indicating whether or not the queue is empty. This has a cost of O(1).

---

### toString
    args:

    returns:
        String | A string representing the object.

This will add a new node with the given newValue immediately before the first value node. This has a cost of O(n).
