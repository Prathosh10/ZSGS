package Hashing;

import java.util.HashMap;
import java.util.Map;

public class BasicOperation {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("Thirumalai", "A");
        students.put("Muthu", "A+");
        students.put("Muthu", "O");

        System.out.println(students);
        System.out.println(students.get("Muthu"));

    }
}

