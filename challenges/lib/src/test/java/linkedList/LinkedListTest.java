package linkedList;

import challenges.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    //    Can successfully instantiate an empty linked list
    @Test
    public void LinkedListTestInstantiate() {
        LinkedList ll = new LinkedList();
        assertEquals("should be empty", 0, ll.length);
    }

    //    Can properly insert into the linked list
    //    Can properly insert multiple nodes into the linked list
    //    The head property will properly point to the first node in the linked list
    @Test
    public void LinkedListTestInsert() {
        LinkedList ll = new LinkedList();
        ll.insert("test1");
        ll.insert("test2");
        assertTrue("contains list1", ll.includes("test1"));
        assertFalse("does not contain list3", ll.includes("test3"));
        assertEquals("should be empty", 2, ll.length);
    }

    //    The head property will properly point to the first node in the linked list
    @Test
    public void LinkedListTestHead() {
        LinkedList ll = new LinkedList();
        ll.insert("c"); //is new head
        assertEquals("heads val should now be c", "c", ll.head.value);
        ll.insert("b"); //is new head
        assertEquals("heads val should now be b", "b", ll.head.value);
        ll.insert("c"); //is new head
        assertEquals("heads val should now be c", "c", ll.head.value);
    }

    //    Can properly return a collection of all the values that exist in the linked list
    @Test
    public void LinkedListTestToString() {
        LinkedList ll = new LinkedList();
        ll.insert("c");
        ll.insert("b");
        ll.insert("a");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.toString());
    }

    @Test
    public void LinkedListTestRecursiveToString() {
        LinkedList ll = new LinkedList();
        ll.insert("c");
        ll.insert("b");
        ll.insert("a");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
    }


}
