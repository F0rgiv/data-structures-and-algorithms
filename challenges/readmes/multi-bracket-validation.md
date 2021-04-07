# Animal shelter
Create a multiBracketValidation.

## Challenge
Create a function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:ll.

## Approach & Efficiency
Create an empty stack to track opening brackets

whenever an open bracket is reached add it to the stack

whenever a closing bracket is reached check that it's the same as the top opening one on the stack

throw an error if mismatched or stack is empty

once at the end of the iteration throw an error if there are still values in the stack

Efficiency:
Time: O(1)
Space: O(n)

## MultiBracketValidation
    args:
        String input | the String to validate.

    returns:
        bollean

This will take in a String and let you know if all opening brackets have corresponding brackets. It will return True unless one of the below cases is true:
* There is an unmatched opening bracket remaining at the end of the document.
* If a closing bracket arrived without corresponding opening.
* If the opening and closing brackets next to each other do not match.


## Solution
![Whiteboard](/assets/brackets.PNG)

## Colaborators
@Edward Hou, @Cristian Robles
