import java.util.Stack;

class Assignment3q5 {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if (current == ')' && last == '(' || current == '}' && last == '{' || current == ']' && last == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((()))()()";
        boolean result1 = isBalanced(expression1);
        System.out.println("Input: " + expression1);
        System.out.println("Output: " + (result1 ? "Balanced" : "Not Balanced"));

        String expression2 = "())((())";
        boolean result2 = isBalanced(expression2);
        System.out.println("Input: " + expression2);
        System.out.println("Output: " + (result2 ? "Balanced" : "Not Balanced"));
    }
}
