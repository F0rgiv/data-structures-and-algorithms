# Tree Intersection
return a set of values that are within both passed trees. 

## Challenge
Write a function called tree_intersection that takes two binary tree parameters.
Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Approach & Efficiency
This has a time of O(n) as wee will only need to iterate threw one tree twice and the other once.

## treeIntersection(BinarySearchTree<T> tree1, BinarySearchTree<T> tree2)
    args:
        BinarySearchTree<T> tree1 | The first tree to check
        BinarySearchTree<T> tree2 | The second tree to check

    returns:
        Set<T> | The set of euneque values within the tree.