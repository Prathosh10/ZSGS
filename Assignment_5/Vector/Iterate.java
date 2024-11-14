package Vector;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Vector;

public class Iterate {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("fig");

        Enumeration e = fruits.elements();

         while (e.hasMoreElements()) {
             String s = (String)e.nextElement();
             System.out.print(s + " ");
         }

        ListIterator lst = fruits.listIterator();

         while (lst.hasNext()) {
             String s = (String) lst.next();

             if (s.equals("cherry")) {
                 lst.set("cocounut");
             }
         }
        System.out.println("\nAfter change : ");

        e = fruits.elements();
        while (e.hasMoreElements()) {
            String s = (String)e.nextElement();
            System.out.print(s + " ");
        }
    }
}
