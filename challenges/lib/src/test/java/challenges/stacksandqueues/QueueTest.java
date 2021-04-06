package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void enqueue() {
        Queue<Integer> queue = new Queue<>();
        //Can successfully enqueue onto a queue
        //Can successfully enqueue multiple values onto a queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        String expected = "Node{value=1, next=Node{value=2, next=Node{value=3, next=Node{value=4, next=null}}}}";
        assertEquals("Queue should contain 4 elements", expected, queue.toString());
    }

    @Test
    public void dequeue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        //Can successfully dequeue off the queue
        //Can successfully empty a queue after multiple dequeues
        assertEquals("should return 1", 1, (int) queue.dequeue());
        assertEquals("should return 2", 2, (int) queue.dequeue());
        //Calling dequeue on empty queue raises exception
        assertThrows(RuntimeException.class, queue::peek);
    }

    @Test
    public void peek() {
        Queue<Integer> queue = new Queue<>();
        //Calling peek on empty queue raises exception
        assertThrows(RuntimeException.class, queue::peek);
        //Can successfully peek the next item on the queue
        queue.enqueue(1);
        assertEquals("should return 1", 1, (int) queue.peek());
        queue.enqueue(2);
        assertEquals("should return 1", 1, (int) queue.peek());

    }

    @Test
    public void isEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue("Queue is currently empty", queue.isEmpty());
        queue.enqueue(1);
        assertFalse("Queue is not currently empty", queue.isEmpty());
    }
}