package queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(10);
        queue.insert(15);
        queue.insert(55);
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(100);
        queue.display();
    }
}
