package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack<Integer> stack = new Stack<>();
        //Can successfully push onto a stack
        //Can successfully push multiple values onto a stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        String expected = "Stack{top=Node{value=4, next=Node{value=3, next=Node{value=2, next=Node{value=1, next=null}}}}}";
        assertEquals("Stack should contain 4 elements", expected, stack.toString());
    }

    @Test
    public void pop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        //Can successfully pop off the stack
        //Can successfully empty a stack after multiple pops
        assertEquals("should return 2", 2, (int) stack.pop());
        assertEquals("should return 1", 1, (int) stack.pop());
        //Calling pop or peek on empty stack raises exception
        assertThrows(RuntimeException.class, stack::peek);
    }

    @Test
    public void peek() {
        Stack<Integer> stack = new Stack<>();
        //Calling pop or peek on empty stack raises exception
        assertThrows(RuntimeException.class, stack::peek);
        //Can successfully peek the next item on the stack
        stack.push(1);
        assertEquals("should return 1", 1, (int) stack.peek());
        stack.push(2);
        assertEquals("should return 2", 2, (int) stack.peek());
    }

    @Test
    public void isEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertTrue("Stack is currently empty", stack.isEmpty());
        stack.push(1);
        assertFalse("Stack is not currently empty", stack.isEmpty());
    }
}