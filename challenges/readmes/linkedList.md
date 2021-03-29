# Singly Linked List
Impliments a challenges.linkedList Class within Java from scratch.

## Challenge
Impliments a challenges.linkedList Class within Java from scratch.

## Approach & Efficiency
Insertions take a constant time of O(1).
toString take a time of O(N).

# challenges.linkedList/LinkedList
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
### append
args:
* String value | the value you whitch to add to the LinkedList

returns:

This adds a new node with the given value to the end of the list. This has a cost of O(1).
### insertBefore
args:
* String value | the vlaue you would like to insert before that already exists within the linked list.
* String newValue | the value you whitch to add to the LinkedList

returns:

This will add a new node with the given newValue immediately before the first value node. This has a cost of O(n).
### insertAfter
args:
* String value | the vlaue you would like to insert after that already exists within the linked list.
* String newValue | the value you whitch to add to the LinkedList

returns:

This will add a new node with the given newValue immediately after the first value node. This has a cost of O(n).

## Solution Whiteboards
![Whiteboard](/assets/ll-d2.PNG)

## Whiteboard Collaborators
@Edward Hou, @Amelia Waggoner