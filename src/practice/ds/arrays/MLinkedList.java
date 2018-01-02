package practice.ds.arrays;

/**
 * Created by mahbubalam on 02.01.18.
 */
public class MLinkedList {

    private static class Node {
        private Integer element;
        private Node next;

        public Node(Integer e) {
            element = e;
            next = null;
        }

        public Node(Integer e, Node n) {
            element = e;
            next = n;
        }

        public Integer getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void addFirst(int e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast(int e) {
        Node node = new Node(e);
        if (isEmpty())
            head = tail;
        else
            tail.next = node;
        tail = node;
        size++;
    }

    public Integer removeFirst() {
        if (isEmpty()) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if (isEmpty())
            tail = null;
        return temp.element;
    }

    public void debug() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public boolean isEmpty() { return (size == 0); }

    public static void main(String[] args) {
        MLinkedList linkedList = new MLinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addLast(3);

        linkedList.debug();

        linkedList.removeFirst();
        linkedList.removeFirst();

        linkedList.debug();
        System.out.println(linkedList.head + " - " + linkedList.tail);

        linkedList.removeFirst();
        System.out.println(linkedList.head + " - " + linkedList.tail);
    }

}
