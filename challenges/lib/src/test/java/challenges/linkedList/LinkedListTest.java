package challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    //    Can successfully instantiate an empty linked list
    @Test
    public void LinkedListTestInstantiate() {
        LinkedList<String> ll = new LinkedList<>();
        assertEquals("should be empty", 0, ll.length);
    }

    //    Can properly insert into the linked list
    //    Can properly insert multiple nodes into the linked list
    //    The head property will properly point to the first node in the linked list
    @Test
    public void LinkedListTestInsert() {
        LinkedList<String> ll = new LinkedList<>();
        ll.insert("test1");
        ll.insert("test2");
        assertTrue("contains list1", ll.includes("test1"));
        assertFalse("does not contain list3", ll.includes("test3"));
        assertEquals("should be empty", 2, ll.length);
    }

    //    The head property will properly point to the first node in the linked list
    @Test
    public void LinkedListTestHead() {
        LinkedList<String> ll = new LinkedList<>();
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
        LinkedList<String> ll = new LinkedList<>();
        ll.insert("c");
        ll.insert("b");
        ll.insert("a");
        String expected = "{ a } -> { b } -> { c } -> NULL";
        assertEquals("To String should work as expected", expected, ll.toString());
    }

    @Test
    public void LinkedListTestRecursiveToString() {
        LinkedList<String> ll = new LinkedList<>();
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
        LinkedList<String> ll = new LinkedList<>();
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
        LinkedList<String> ll = new LinkedList<>();
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
        LinkedList<String> ll = new LinkedList<>();
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
        LinkedList<String> ll = new LinkedList<>();
        ll.insertBefore("c", "new");
    }

    @Test(expected = Exception.class)
    public void LinkedListTestInsertAfterException() throws Exception {
        LinkedList<String> ll = new LinkedList<>();
        ll.insertAfter("c", "new");
    }

    @Test
    public void LinkedListTestT() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(1);
    }

    @Test
    public void LinkedListTestGetIndex() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.append(3);
        ll.append(8);
        ll.append(2);
        System.out.println(ll);
        assertEquals("To String should work as expected", 1, (int) ll.getIndex(0));
        assertEquals("To String should work as expected", 3, (int) ll.getIndex(1));
        assertEquals("To String should work as expected", 2, (int) ll.getIndex(3));
    }

    @Test
    public void LinkedListTestKthFromEnd() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);

        //Where the linked list is of a size 1
        assertEquals("KthFromEnd should work as expected", 1, (int) ll.kthFromEnd(0));
        ll.append(3);
        ll.append(8);
        ll.append(2);

        //Where k and the length of the list are the same
        assertEquals("KthFromEnd should work as expected", 1, (int) ll.kthFromEnd(3));
        assertEquals("KthFromEnd should work as expected", 2, (int) ll.kthFromEnd(0));
        //Happy Path where k is not at the end, but somewhere in the middle of the linked list
        assertEquals("KthFromEnd should work as expected", 3, (int) ll.kthFromEnd(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void LinkedListTestKthFromEndNegativeException() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.kthFromEnd(-1);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void LinkedListTestKthFromEndToBigException() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.kthFromEnd(10);
    }

    @Test
    public void LinkedListTestZipLists() {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.append(1);
        ll1.append(3);
        ll1.append(2);
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.append(5);
        ll2.append(9);
        ll2.append(4);
        LinkedList result = LinkedList.zipLists(ll1,ll2);
        String expected = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> NULL";
        assertEquals("should properly zip",expected, result.toString());

        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.append(1);
        ll3.append(3);
        LinkedList<Integer> ll4 = new LinkedList<>();
        ll4.append(5);
        ll4.append(9);
        ll4.append(4);
        result = LinkedList.zipLists(ll3,ll4);
        expected = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 4 } -> NULL";
        assertEquals("should properly zip",expected, result.toString());

        LinkedList<Integer> ll5 = new LinkedList<>();
        ll5.append(1);
        ll5.append(3);
        ll5.append(2);
        LinkedList<Integer> ll6 = new LinkedList<>();
        ll6.append(5);
        ll6.append(9);
        result = LinkedList.zipLists(ll5,ll6);
        expected = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> NULL";
        assertEquals("should properly zip",expected, result.toString());
    }

}
