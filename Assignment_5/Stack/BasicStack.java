package Stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 10; i <= 50; i += 10) {
            stack.push(i);
        }

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
