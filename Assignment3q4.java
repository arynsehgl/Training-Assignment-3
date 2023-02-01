import java.util.Stack;

class Assignment3q4 {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((()))()()";
        String expression2 = "())((())";

        System.out.println("Expression 1: " + expression1);
        System.out.println("Balanced: " + isBalanced(expression1));

        System.out.println("\nExpression 2: " + expression2);
        System.out.println("Balanced: " + isBalanced(expression2));
    }
}
