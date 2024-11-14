package Vector;

import java.util.ListIterator;
import java.util.Vector;

public class InsertRemove {
    public static void main(String[] args) {
        Vector<Character> characters = new Vector<>();

        for (char ch = 'A'; ch <= 'E'; ch++) {
            characters.add(ch);
        }

        ListIterator lst = characters.listIterator();

        while (lst.hasNext()) {
            lst.next();
            int index = lst.nextIndex();

            if (index == 2) {
                lst.add('X');
            }
        }
        System.out.println(characters);

       characters.remove(0);

        System.out.println(characters);
    }
}
