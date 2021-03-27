package linkedList;

public class LinkedList {
    Node head; //head
    Node tail; //head
    int length; //track the length of the list

    public LinkedList() {
        length = 0;
    }

    class Node {
        String value;
        Node next;

        Node(String input) {
            value = input;
        }
    }

    public void insert(String value) {
        //create new node
        Node newNode = new Node(value);
        length++;

        //simply set tail and head if the first node
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        //else attach to the head and update.
        newNode.next = head;
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
        result = result + _RecursiveToString(head, result);
        result = result + "NULL";
        return result;
    }

    public String _RecursiveToString(Node currentNode, String result) {
        if (currentNode != null)
            result = String.format("{ %s } -> ", currentNode.value) + _RecursiveToString(currentNode.next, result);
        return result;
    }
}

