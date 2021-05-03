# Hashtables
challenges.tables.HashTable implimenats a simple hash table that can be used to store key value pairs.

## Challenge
Implement a Hashtable with the following methods:

* add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
* get: takes in the key and returns the value from the table.
* contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
This storage solution implements a hashtable that uses hashes to determine the index location that each element will be stored at.
this allows all operations to have an O(1) time with the table taking up O(n) space.

## API
### add
    args:
        String key | The key for the stored value.
        T value | The Value to be stored.
    returns:
        void

### get
    args:
        String key | The key for the stored value.
    returns:
        T value | The Value to be returned.

### contains
    args:
        String key | The key for the stored value.
    returns:
        boolean | Return true if the key is currently being used to store something otherwise it return false.