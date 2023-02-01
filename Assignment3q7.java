import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private int minElement;

    public MinStack() {
        stack = new Stack<>();
        minElement = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= minElement) {
            stack.push(minElement);
            minElement = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == minElement) {
            minElement = stack.pop();
        }
    }

    public int getMin() {
        return minElement;
    }
}

public class Assignment3q7 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println("The minimum element in the stack is: " + minStack.getMin());
    }
}
