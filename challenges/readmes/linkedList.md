# Singly Linked List
Impliment a linkedList Class within Java from scratch.

## Challenge
Impliment a linkedList Class within Java from scratch.

## Approach & Efficiency
Insertions take a constant time of O(1).
toString take a time of O(N).

# linkedList/LinkedList
## values

### length | int 
Equal to the current number of stored objects in the list. 

## Methods

### insert
args:
* String value | The value you wouild like to add to the list.

returns:
* void

Takes any value as an argument and adds a new node with that value to the head of the list. This has a cost of O(1).
### includes
args:
* String value | The value you wouild like to check against.

returns:
* boolean | true if found. false if not found.

takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list. This has a cost of O(n).
### toString
args:

returns:
* String | the string represent the list.

This takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL". This has a cost of O(n).