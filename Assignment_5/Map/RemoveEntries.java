package Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveEntries {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Jhon", 85);
        students.put("Jane", 92);
        students.put("Tom", 76);
        students.put("Lucy", 89);
        students.put("Edward", 80);

        if (students.containsKey("Tom")) {
            students.remove("Tom");
        }

        System.out.println(students);
    }
}
