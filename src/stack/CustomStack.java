package stack;

public class CustomStack {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Can not pop from an empty stack!!");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can not peek in an empty stack!!");
        }
        return data[ptr];
    }
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}