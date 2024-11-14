package ArrayList;

import java.util.ArrayList;

public class AddRetrive {
    public static void main(String[] args) {
        // retrive elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pine Apple");
        fruits.add("Water melon");

        System.out.println(fruits.get(2));
    }
}
