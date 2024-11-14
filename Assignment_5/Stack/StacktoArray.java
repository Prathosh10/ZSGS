package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StacktoArray {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        for (double i = 1.1; i <= 5.5; i += 1.1) {
            stack.push(i);
        }
        System.out.println(stack);

        Double[] arr = new Double[stack.size()];
        stack.toArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
