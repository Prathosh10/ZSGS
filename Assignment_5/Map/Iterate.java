package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 2);
        fruits.put("apple", 5);
        fruits.put("Cherry", 7);
        fruits.put("Date", 3);
        fruits.put("Mango", 4);

        Iterator itr = fruits.entrySet().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
