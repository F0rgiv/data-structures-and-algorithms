# fizzbuzz on a tree
Conduct “FizzBuzz” on a binary tree while traversing through it to create a new tree.

## Challenge
Create a method that takes in a tree of Integers and returns a new tree of the same shape but of Strings and with the some of the values changed according to the below rules:

* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

## Approach & Efficiency
This has a time and space of O(n).

# challenges.tree.Tree<T>

## Methods

### findMaximumValue 
    args:
        Tree<Integer> | The tree you wish to base the new one off of

    returns:
        Tree<String> | The new and transformed tree.

Creates a new tree of type String transforming the values according to the rules of fizzbuzz.

---

Collaborated with Ed and Christen on the board:

![Whiteboard](/assets/fizzbuzz.PNG)