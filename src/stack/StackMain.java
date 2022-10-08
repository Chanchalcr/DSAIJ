package stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//        stack.push(34);
//        stack.push(44);
//        stack.push(4);
//        stack.push(3);
//        stack.push(30);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack stack1 = new DynamicStack(5);
        stack1.push(34);
        stack1.push(44);
        stack1.push(4);
        stack1.push(3);
        stack1.push(30);
        stack1.push(50);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
