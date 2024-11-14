package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }

        nums.remove(2);
        nums.removeLast();

        ListIterator lst = nums.listIterator();
        while (lst.hasNext()) {
            int n = (int)lst.next();
            System.out.print(n + " ");
        }
    }
}
