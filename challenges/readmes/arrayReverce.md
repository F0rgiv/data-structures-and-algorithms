# Reverse an Array
Creates a function called reverseArray which takes an array and then return that array in reverse.

## Challenge
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

## Approach & Efficiency
First approch was to create a new array and then populate it backwords iterating throught the passed array and then putting each element into the new ellement backwords.

Second approch was to do it in place. Advantage here was to limit memmory alocation.
Take an element from the end of the array and then storing it in a temp int, moving the first element to the end and then moving the temp one to the begining.

## Solution
![Whiteboard](/assets/arrayReverse.PNG)
