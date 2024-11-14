package Vector;

import java.util.Vector;

public class CheckElement {
    public static void main(String[] args) {
        final Vector<Double> nums = new Vector<>();

        for (int i = 0; i < 5; i++) {
            double random = (Math.random() * 20);
            nums.add(Double.parseDouble(String.format("%.1f", random)));
        }

        System.out.println(nums);
        if (nums.contains(10.5)) {
            System.out.println("10.5 is present");
        } else {
            System.out.println("10.5 is not present");
        }

        System.out.println("Vector size : " + nums.size());
        nums.add(10.7);
        System.out.println("Vector size : " + nums.size());

    }
}
