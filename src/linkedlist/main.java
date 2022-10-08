package linkedlist;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(66);
        list.displayLL();
        list.insertFirst(55);
        list.displayLL();
        list.insertFirst(65);
        list.displayLL();
        list.insertFirst(85);
        list.displayLL();
        list.insertFirst(85);
        list.displayLL();
        list.insertFirst(85);
        list.displayLL();
        list.insertLast(100);
        list.displayLL();
        list.insertAt(1,200);
        list.displayLL();
        list.deleteValues(85);
        list.displayLL();
        list.insertAtPosUsingRec(50, 5);
        list.displayLL();
        list.sortLL();
        list.displayLL();
        list.reverseLLRec();
        list.displayLL();
        list.reverseKGroup(3);
        list.displayLL();
        System.out.println("hello");
    }
}
