package challenges.linkedList;

public class LinkedList {
    Node head; //head
    Node tail; //head
    int length; //track the length of the list

    public LinkedList() {
        length = 0;
    }

    public void insert(String value) {
        //create new node
        Node newNode = new Node(value, this.head);
        length++;

        //simply set tail and head if the first node
        if (head == null) {
            tail = newNode;
        }
        head = newNode;
    }

    public boolean includes(String value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean includesRecursive(String value) {
        return includesRecursive(this.head, value);
    }

    private boolean includesRecursive(Node current, String Value) {
        if (current == null) return false;
        if (current.value.equals(Value)) return true;
        return includesRecursive(current, Value);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            result.append(String.format("{ %s } -> ", currentNode.value));
            currentNode = currentNode.next;
        }
        result.append("NULL");
        return result.toString();
    }

    public String RecursiveToString() {
        String result = "";
        result = result + RecursiveToString(head, result);
        result = result + "NULL";
        return result;
    }

    private String RecursiveToString(Node currentNode, String result) {
        if (currentNode != null)
            result = String.format("{ %s } -> ", currentNode.value) + RecursiveToString(currentNode.next, result);
        return result;
    }

    public void append(String value) {
        //create new node
        Node newNode = new Node(value, this.tail);
        length++;

        //simply set tail and head if the first node
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        //else attach to the tail and update.
        tail.next = newNode;
        tail = newNode;
    }

    public void insertBefore(String index, String newValue) throws Exception {
        if (index.equals(this.head.value)) {
            insert(newValue);
            return;
        }
        insertBefore(this.head, index, newValue);
    }

    private void insertBefore(Node current, String value, String newValue) throws Exception {
        if (current.next == null) throw new Exception("value not found");
        if (current.next.value.equals(value)) {
            Node newNode = new Node(newValue, current.next);
            length++;
            current.next = newNode;
            return;
        }
        insertBefore(current.next, value, newValue);
    }

    public void insertAfter(String value, String newValue) throws Exception {
        insertAfter(this.head, value, newValue);
    }

    private void insertAfter(Node current, String value, String newValue) throws Exception {
        if (current == null) throw new Exception("value not found");
        if (current.value.equals(value)) {
            Node newNode = new Node(newValue, current.next);
            length++;

            current.next = newNode;
            //catch updating tail.
            if (current.equals(this.tail)) this.tail = newNode;
            return;
        }
        insertAfter(current.next, value, newValue);
    }
}

class Node {
    String value;
    Node next;

    Node(String input, Node next) {
        this.value = input;
        this.next = next;
    }
}

