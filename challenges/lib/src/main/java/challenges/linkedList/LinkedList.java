package challenges.linkedList;


public class LinkedList <T> {
    Node<T> head; //head
    Node<T> tail; //head
    int length; //track the length of the list

    public LinkedList() {
        length = 0;
    }

    public void insert(T value) {
        //create new node
        Node<T> newNode = new Node<>(value, this.head);
        length++;

        //simply set tail and head if the first node
        if (head == null) {
            tail = newNode;
        }
        head = newNode;
    }

    public boolean includes(T value) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean includesRecursive(T value) {
        return includesRecursive(this.head, value);
    }

    private boolean includesRecursive(Node<T> current, T Value) {
        if (current == null) return false;
        if (current.value.equals(Value)) return true;
        return includesRecursive(current.next, Value);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> currentNode = head;
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

    private String RecursiveToString(Node<T> currentNode, String result) {
        if (currentNode != null)
            result = String.format("{ %s } -> ", currentNode.value) + RecursiveToString(currentNode.next, result);
        return result;
    }

    public void append(T value) {
        //create new node
        Node<T> newNode = new Node<>(value, null);
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

    public void insertBefore(T index, T newValue) throws Exception {
        if (index.equals(this.head.value)) {
            insert(newValue);
            return;
        }
        insertBefore(this.head, index, newValue);
    }

    private void insertBefore(Node<T> current, T value, T newValue) throws Exception {
        if (current.next == null) throw new Exception("value not found");
        if (current.next.value.equals(value)) {
            Node<T> newNode = new Node<>(newValue, current.next);
            length++;
            current.next = newNode;
            return;
        }
        insertBefore(current.next, value, newValue);
    }

    public void insertAfter(T value, T newValue) throws Exception {
        insertAfter(this.head, value, newValue);
    }

    private void insertAfter(Node<T> current, T value, T newValue) throws Exception {
        if (current == null) throw new Exception("value not found");
        if (current.value.equals(value)) {
            Node<T> newNode = new Node<>(newValue, current.next);
            length++;

            current.next = newNode;
            //catch updating tail.
            if (current.equals(this.tail)) this.tail = newNode;
            return;
        }
        insertAfter(current.next, value, newValue);
    }

    public T getIndex(int index){
        if (index > length-1 || index < 0) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        int i = 0;
        while (i < index){
            current = current.next;
            i++;
        }
        return current.value;
    }

    public T kthFromEnd(int k){
        return getIndex(this.length - k - 1);
    }

    public static<T> LinkedList<T> zipLists(LinkedList<T> linkedList1, LinkedList<T> linkedList2){
        if(linkedList1 == null) return linkedList2;

        //link and return the two lists
        zipLists(linkedList1.head,linkedList2.head);
        linkedList1.length = linkedList1.length + linkedList2.length; //don't like this should update length to be private.
        //return the updated list
        return linkedList1;
    }

    private static<T> void zipLists(Node<T> curr1, Node<T> curr2){
        if (curr2 == null) return;
        zipLists(curr2, curr1.next);
        curr1.next = curr2;
    }

    private static<T> void zipLists2(Node<T> curr1, Node<T> curr2){
        Node<T> temp1 = curr1.next;
        if (curr2 == null) return;
        curr1.next = curr2;
        Node<T> temp2 = curr2.next;
        if (temp1 == null) return;
        curr2.next = temp1;
        curr1 = temp1;
        curr2 = temp2;
        zipLists(curr1,curr2);
    }
}

class Node <T>{
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

