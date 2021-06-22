# Singly Linked List
Impliments a challenges.linkedList Class within Java from scratch.

## Challenge
Impliments a challenges.linkedList Class within Java from scratch.

## Approach & Efficiency
Insertions take a constant time of O(1).
toString take a time of O(N).

# challenges.linkedList/LinkedList<T>
## values

### length | int 
Equal to the current number of stored objects in the list. 

## Methods

### insert
args:
* <T> value | The value you wouild like to add to the list.

returns:
* void

Takes any value as an argument and adds a new node with that value to the head of the list. This has a cost of O(1).
### includes
args:
* <T> value | The value you wouild like to check against.

returns:
* boolean | true if found. false if not found.

takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list. This has a cost of O(n).
### toString
args:

returns:
* <T> | the string represent the list.

This takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL". This has a cost of O(n).
### append
args:
* <T> value | the value you which to add to the LinkedList

returns:

This adds a new node with the given value to the end of the list. This has a cost of O(1).
### insertBefore
args:
* <T> value | the value you would like to insert before that already exists within the linked list.
* <T> newValue | the value you which to add to the LinkedList

returns:

This will add a new node with the given newValue immediately before the first value node. This has a cost of O(n).
### insertAfter
args:
* <T> value | the value you would like to insert after that already exists within the linked list.
* <T> newValue | the value you which to add to the LinkedList

returns:

This will add a new node with the given newValue immediately after the first value node. This has a cost of O(n).

### getIndex
args:
* int index | The index you would like to retrieve the value from.

returns:
<T> | the value of the node at the given position.

This will add a new node with the given newValue immediately after the first value node. This has a cost of O(n).

### kthFromEnd
args:
* int k | the index from the end of the list you would like to get the value of. kthFromEnd(0) will return the last element
* String newValue | the value you which to add to the LinkedList

returns:
<T> | the value of the node at the given position.

This will add a new node with the given newValue immediately after the first value node. This has a cost of O(n).

### zipLists
args:
LinkedList linkedList1 | the first linked list you would like to zip
LinkedList linkedList2 | the second linked list you would like to zip

returns:
LinkedList | Zipped list.

This will a single linked list representing the two list provided merged into one. This has a cost of time O(n) and space O(1).

For example zipLists("{ 1 } -> { 3 } -> { 2 } -> NULL","{ 5 } -> { 9 } -> { 4 } -> NULL") would return "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> NULL"

## Solution Whiteboards
![Whiteboard](/assets/ll-d2.PNG)
![Whiteboard](/assets/linked-list-index.jpeg)

## Whiteboard Collaborators
@Edward Hou, @Amelia Waggoner