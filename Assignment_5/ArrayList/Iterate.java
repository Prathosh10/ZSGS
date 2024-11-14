package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        // iterate and remove
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 10; i <= 50; i += 10) {
            nums.add(i);
        }

        Iterator<Integer> itr = nums.iterator();

        while (itr.hasNext()) {
            int val = itr.next();

            if (val > 30) {
                itr.remove();
            }
        }

        System.out.println(nums);
    }
}
