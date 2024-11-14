package Vector;

import java.util.Arrays;
import java.util.Vector;

public class ArrayConversion {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        String[] arr = new String[colors.size()];
        colors.toArray(arr);

        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        Vector<String> copy = new Vector<>(Arrays.asList(arr));

        for (String s : copy) {
            System.out.print(s + " ");
        }

    }
}
