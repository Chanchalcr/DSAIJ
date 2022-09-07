package linkedlist;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst (int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast (int value) {
        Node newNode = new Node(value);
        if(tail == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size +=1;
    }

    public void insertAt(int pos, int val) {
        Node node = new Node(val);
        Node temp = head;
        if(tail == null || pos == 1 || pos == 0) {
            insertFirst(val);
            return;
        }
        if(pos > size) {
            insertLast(val);
            return;
        }
        pos -= 2;
        while(pos > 0) {
            temp = temp.next;
            pos--;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }
    //this function will delete the first node
    public int deleteFirst () {
        int val = head.value;
        head = head.next;
        size -= 1;
        return val;
    }
    //this function will delete the last node
    public int deleteLast () {
        Node i = head;
        while(i.next.next != null) {
            i = i.next;
        }
        int val = i.next.value;
        i.next = null;
        tail = i;
        size -= 1;
        return val;
    }
    //this function will delete the node on the given position
    public int deletePosition(int Position) {
        Node temp = head;
        if(Position == 1) {
            head = head.next;
        }
        int count = 1;
        while(count < Position-1) {
            temp = temp.next;
            count ++;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        size -= 1;
        return val;
    }
    //this function will delete the nodes with the given value
    public void deleteValues(int val) {
        Node i = head;
        Node j = head;
        while(i != null) {
            if(i.value == val) {
                if(i == head) {
                    head = head.next;
                    i = head;
                    j = head;
                } else {
                    j.next = i.next;
                    i = i.next;
                }
            } else {
                j = i;
                i = i.next;
            }
        }
    }

    public void displayLL () {
        Node i = head;
        while(i != null) {
            System.out.print(i.value + " -> ");
            i = i.next;
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
