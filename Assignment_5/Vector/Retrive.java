package Vector;

import java.util.Vector;

public class Retrive {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        for (int i = 10; i <= 50; i += 10) {
            nums.add(i);
        }
        System.out.println(nums.get(2));

        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }
}
