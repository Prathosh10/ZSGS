package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if ((stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')
                    || (stack.peek() == '(' && ch == ')')) {
                    stack.pop();
                } else {
                    res = "Not Balanced";
                }
            }
        }

        if (!res.equals("Not Balanced")) {
            res = "Balanced";
        }

        System.out.println(res);
    }
}
