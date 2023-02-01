import java.util.Stack;

class Assignment3q6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Before reversal: " + stack);
        reverseStack(stack);
        System.out.println("After reversal: " + stack);
    }

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int item = popAndReturn(stack);
        reverseStack(stack);
        stack.push(item);
    }

    private static int popAndReturn(Stack<Integer> stack) {
        int item = stack.pop();
        if (stack.isEmpty()) {
            return item;
        } else {
            int last = popAndReturn(stack);
            stack.push(item);
            return last;
        }
    }
}
