package linkedlist;

public class mainForDoublyLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(40);
        list.displayDLL();
        list.insertFirst(30);
        list.displayDLL();
        list.insertFirst(20);
        list.displayDLL();
        list.insertFirst(10);
        list.displayDLL();
        list.insertLast(50);
        list.displayDLL();
        list.insertAt(15, 1);
        list.displayDLL();
        list.insertAt(60,16);
        list.displayDLL();
    }
}
