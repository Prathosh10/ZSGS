package ArrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        // convert arrayList to array
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        String[] fruArr = new String[fruits.size()];
        fruits.toArray(fruArr);

        for (String s : fruArr) {
            System.out.println(s);
        }
    }
}
