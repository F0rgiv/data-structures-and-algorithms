package challenges.linkedList;

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

    //    Can successfully add a node to the end of the linked list
//    Can successfully add multiple nodes to the end of a linked list
    @Test
    public void LinkedListTestAppend() {
        LinkedList ll = new LinkedList();
        ll.append("a");
        ll.append("b");
        ll.append("c");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
    }

    //    Can successfully insert a node before a node located i the middle of a linked list
//    Can successfully insert a node before the first node of a linked list
    @Test
    public void LinkedListTestInsertBefore() throws Exception {
        LinkedList ll = new LinkedList();
        ll.insert("c");
        ll.insert("b");
        ll.insert("a");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
        ll.insertBefore("a", "new");
        expected = "{ new } -> { a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
        ll.insertBefore("b", "New Thing");
        expected = "{ new } -> { a } -> { New Thing } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
    }

    //    Can successfully insert after a node in the middle of the linked list
//    Can successfully insert a node after the last node of the linked list
    @Test
    public void LinkedListTestInsertAfter() throws Exception {
        LinkedList ll = new LinkedList();
        ll.insert("c");
        ll.insert("b");
        ll.insert("a");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
        ll.insertAfter("c", "new");
        expected = "{ a } -> { b } -> { c } -> { new } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
        ll.insertAfter("b", "New Thing");
        expected = "{ a } -> { b } -> { New Thing } -> { c } -> { new } -> NULL";
        assertEquals("To String should work as expected", expected, ll.RecursiveToString());
    }

    //Insert@ throws exception if index isn't found
    @Test(expected = Exception.class)
    public void LinkedListTestInsertBeforeException() throws Exception {
        LinkedList ll = new LinkedList();
        ll.insertBefore("c", "new");
    }

    @Test(expected = Exception.class)
    public void LinkedListTestInsertAfterException() throws Exception {
        LinkedList ll = new LinkedList();
        ll.insertAfter("c", "new");
    }
}
