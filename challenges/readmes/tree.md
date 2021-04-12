# Tree
Create a BinaryTree and binarySearchTree class.

## Challenge
Identify and implement a efficient solution for Queues and Stacks. 

## Approach & Efficiency
Add and contains operations have a time of O(n) with an average of O(log n). All traversals have a time of O(Log n).

# challenges.tree.Node<T>
## values
    <T> value | The value stored in the Node
    Node<T> left | Pointer to the left node.
    Node<T> right | Pointer to the right node.
## Methods
    void

# challenges.tree.Tack<T>
## values
    void

## Methods

### breadthTraversal 
    args:
        void

    returns:
        List<T> | a list containing the elements within the tree in the appropriate order.
---

### preOrder 
    args:
        void

    returns:
        List<T> | a list containing the elements within the tree in the appropriate order.

---

### inOrder 
    args:
        void

    returns:
        List<T> | a list containing the elements within the tree in the appropriate order.

---

### postOrder 
    args:
        void

    returns:
        List<T> | a list containing the elements within the tree in the appropriate order.

---


# challenges.tree.BinarySearchTree <T> extends Tree
## values
    void

## Methods

### add 
    args:
        <T> value | The value you would like to add to the tree.

    returns:
        void

This takes any value as an argument and adds it to the tree in to appropriate position for future searches.

---

### contains 
    args:
        <T> value | The value you would like to check for existing within the tree.

    returns:
        Boolean | true if value is in the tree else false

Return a boolean letting you know if a specified value is within the tree.

---

Collaborated with Ed, Christian and Amelia on the board:

![Whiteboard](/assets/tree.PNG)