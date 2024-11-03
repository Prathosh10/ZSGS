import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KG_Garden {
    public static void main(String[] args) {
//        Map<Character, String> plants = new HashMap<>(
//                Map.of('G' , "Grass", 'C' ,"Clover", 'R', "Radish", 'V', "Violet"));
        Map<String, Integer> students = new HashMap<>(
                    Map.of("Alice", 1, "Bob", 2, "Charlie", 3,  "David", 4, "Eve"
                            ,5, "Fred",6, "Ginny", 7, "Harriet", 8, "Ileana",
                            9, "Joseph", 10));
        students.put("Kincaid", 11);
        students.put("Larry", 12);

        String row1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
        String row2 = "VRCCCGCRRGVCGCRVVCVGCGCV";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name :");
        String studentName = sc.nextLine();
        int studentNum = (students.get(studentName) - 1) * 2;

        String temp = row1.substring(studentNum, studentNum + 2) + row2.substring(studentNum, studentNum + 2);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'G') {
                res.append("grass");
            } else if (temp.charAt(i) == 'C') {
                res.append("clover");
            } else if (temp.charAt(i) == 'R') {
                res.append("radishes");
            } else if (temp.charAt(i) == 'V') {
                res.append("violets");
            }

            if (i != 3) {
                res.append(", ");
            }
        }

        System.out.println(res);
    }
}
