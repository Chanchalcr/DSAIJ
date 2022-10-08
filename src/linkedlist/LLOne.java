package linkedlist;

public class LLOne {

    private Node head,tail;
    private int size;

    public LLOne() {
        size = 0;
    }
    public void addLL(int val) {
        Node newNode = new Node(val);
        if(head == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;
    }
    public void displayLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
