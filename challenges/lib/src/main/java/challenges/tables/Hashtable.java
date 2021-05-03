package challenges.tables;

import challenges.linkedList.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hashtable<T> {
    ArrayList<LinkedListMap<T>> table;
    int size;

    public Hashtable() {
        this.table = new ArrayList<>(Collections.nCopies(11, new LinkedListMap<>()));
        this.size = 11;
    }

    public Hashtable(int size) {
        this.table = new ArrayList<>(Collections.nCopies(size, new LinkedListMap<>()));
        this.size = size;
    }

    void add(String key, T value){
        int hash = hash(key);
        this.table.get(hash).insertOrUpdate(key, value);
    }

    T get(String key){
        return this.table.get(hash(key)).getByKey(key);
    }

    boolean contains(String key){
        return this.table.get(hash(key)).containsByKey(key);
    }

    int hash(String key){
        int[] ints = key.chars().toArray();
        int[] biggerInts = new int[ints.length/2];
        int j = 0;
        for (int i = 0; i < ints.length - 1; i++) {
            biggerInts[j] = Integer.parseInt("" + ints[i] + ints[i+1]);
            i++;
            j++;
        }
        return Arrays.stream(biggerInts).sum() % size;
    }
}
