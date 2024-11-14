package ArrayList;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        // sort
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randVal = (int)((Math.random() * 100));
            nums.add(randVal);
        }

        System.out.println("Before sort : " + nums);

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }

        System.out.println("After sort : " + nums);
    }
}
