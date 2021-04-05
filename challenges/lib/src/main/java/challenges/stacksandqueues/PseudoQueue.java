package challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    Stack<T> stackIn = new Stack<>();
    Stack<T> stackOut = new Stack<>();

    public void enqueue(T value) {
        stackIn.push(value);
    }

    public T dequeue() {
        if (stackOut.isEmpty()){
            if (stackIn.isEmpty()) throw new NoSuchElementException();
            while (!stackIn.isEmpty()) stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stackIn=" + stackIn +
                ", stackOut=" + stackOut +
                '}';
    }
}
