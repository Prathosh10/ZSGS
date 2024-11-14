package ArrayList;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        // search
        ArrayList<Character> characters = new ArrayList<>();

        for (char ch = 'A'; ch <= 'J'; ch++) {
            characters.add(ch);
        }

        System.out.println(search(characters, 'C'));
        System.out.println(search(characters, 'c'));
    }

    private static int search(ArrayList<Character> characters, char ch) {
        for (int i = 0; i < characters.size(); i++) {
            if (characters.get(i) == ch) {
                return i;
            }
        }

        return -1;
    }
}
