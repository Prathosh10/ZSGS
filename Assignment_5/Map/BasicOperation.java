package Map;

import java.util.HashMap;
import java.util.Map;

public class BasicOperation {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 30);
        students.put("Bob", 25);
        students.put("Charlie", 35);
        students.put("Diana", 28);
        students.put("Edward", 40);

        System.out.println("Age of charlie : " + students.get("Charlie"));
        System.out.println(students);
    }
}
