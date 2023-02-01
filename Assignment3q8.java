import java.util.LinkedList;
import java.util.Queue;

class Assignment3q8 {
    static class Stack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        Stack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        int pop() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.poll();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
