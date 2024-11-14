package LinkedList;

import java.util.LinkedList;

public class QueueBehaviour {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        System.out.println(names);
        names.removeFirst();
        names.removeFirst();
        System.out.println(names);

    }
}
