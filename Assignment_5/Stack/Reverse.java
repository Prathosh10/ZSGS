package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
        }
        System.out.println("orginal string : " + s);

        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }
        System.out.println("reverse : " + rev);
    }
}
