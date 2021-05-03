package challenges.tables;

public class LinkedListMap<T> {
    Node<HashLinkedListKV<T>> head; //head

    public void insertOrUpdate(String key, T value) {
        //update if key is present
        Node<HashLinkedListKV<T>> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.key == key) {
                currentNode.value.value = value;
                return;
            }
            currentNode = currentNode.next;
        }

        //create new node
        Node<HashLinkedListKV<T>> newNode = new Node<HashLinkedListKV<T>>(
                new HashLinkedListKV<T>(key, value),
                this.head);
        head = newNode;
    }

    public T getByKey(String key) {
        Node<HashLinkedListKV<T>> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.key == key) return currentNode.value.value;
            currentNode = currentNode.next;
        }
        return null;
    }

    public boolean containsByKey(String key) {
        Node<HashLinkedListKV<T>> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.key == key) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    static class HashLinkedListKV<T> {
        String key;
        T value;

        public HashLinkedListKV(String key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    static class Node<T> {
        T value;
        Node<T> next;

        Node(T input, Node<T> next) {
            this.value = input;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
