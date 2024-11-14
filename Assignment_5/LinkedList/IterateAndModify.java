package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateAndModify {
    public static void main(String[] args) {
        LinkedList<String> nums = new LinkedList<>();
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add("five");

        ListIterator lst = nums.listIterator();

        while (lst.hasNext()) {
            String s = (String)lst.next();

            if (s.equals("three")) {
                lst.set("THREE");
            }
        }

        lst = nums.listIterator();
        while (lst.hasNext()) {
            String s = (String)lst.next();
            System.out.print(s + " ");
        }
    }
}
