package Stack;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class PeekAndSearch {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");

        System.out.println(stack.peek());

        ListIterator itr = stack.listIterator();

        while (itr.hasNext()) {
            String s = (String) itr.next();

            if (s.equals("second")) {
                System.out.println(itr.nextIndex() - 1);
            }
        }
    }
}
