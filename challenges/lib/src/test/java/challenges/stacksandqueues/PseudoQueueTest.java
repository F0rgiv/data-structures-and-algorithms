package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        //Can successfully enqueue onto a pseudoQueue
        //Can successfully enqueue multiple values onto a pseudoQueue
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        String expected = "PseudoQueue{stackIn=Stack{top=Node{value=4, next=Node{value=3, next=Node{value=2, next=Node{value=1, next=null}}}}}, stackOut=Stack{top=null}}";
        assertEquals("PseudoQueueTest should contain 4 elements in in stack and none in out", expected, pseudoQueue.toString());
    }

    @Test
    public void dequeue() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        //Can successfully dequeue off the pseudoQueue
        //Can successfully empty a pseudoQueue after multiple dequeues
        assertEquals("should return 1", 1, (int) pseudoQueue.dequeue());
        assertEquals("should return 2", 2, (int) pseudoQueue.dequeue());
        //Calling dequeue on empty pseudoQueue raises exception
        assertThrows(RuntimeException.class, pseudoQueue::dequeue);
    }
}