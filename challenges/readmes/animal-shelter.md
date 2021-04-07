# Animal shelter
Create a First-in, First out Animal Shelter where a user can specify either a cat or a dog.

## Challenge
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.

dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency
Create two queues on for the dogs and one for the cats.

if someone wants a cat dequeue from cats

if someone wants a dog dequeue from dogs

if someone want's with either peek both and return the one with the date furthest in the past.

Efficiency:
Time: O(1)
Space: O(1)

## enqueue
    args:
        <Dog or Cat> animal | the animal to be added to the shelter.

    returns:
        void

This takes a Dog or Cat as an argument and adds them into the AnimalShelter with an O(1) Time and Space performance.

## public dequeue(String
    throws:
        no animal to adopt error.

    args:
        String animal-type | "cat", "dog" or ""

    return:
        Dog or Cat

This will return either a Dog or a Cat object.
* If "dog" is passed it will return a dog.
* IF is not "dog" or "cat" then return null.
* If neither are specified it will return the animal that has been in the shelter for the longest amount of time.
* If there is not an animal fitting the requirements it will throw an error.

## Solution
![Whiteboard](/assets/AnimalShlter.PNG)

## Colaborators
@Edward Hou, @Andy Agulue, @Cristian Robles
