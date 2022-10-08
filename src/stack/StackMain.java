package stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(44);
        stack.push(4);
        stack.push(3);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
