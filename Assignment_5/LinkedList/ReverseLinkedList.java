package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> letters = new LinkedList<>();

        for (char ch = 'A'; ch <= 'E'; ch++) {
            letters.add(ch);
        }

        System.out.println(letters);
        reverse(letters);
        System.out.println(letters);
    }

    private static void reverse(LinkedList<Character> letters) {
        Stack<Character> stack = new Stack<>();

        Iterator itr = letters.iterator();

        while (itr.hasNext()) {
            stack.push((char)itr.next());
        }

        ListIterator lst = letters.listIterator();

        while (lst.hasNext()) {
            lst.next();
            lst.set(stack.pop());
        }
    }
}
