package LinkedList;

import java.util.LinkedList;

public class AddAndAccess {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
    }
}
