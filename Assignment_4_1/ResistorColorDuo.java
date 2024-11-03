import java.util.Map;
import java.util.Scanner;

public class ResistorColorDuo {
    public static void main(String[] args) {
        Map<String, Integer> colorMap = Map.ofEntries(
                Map.entry("black", 0),
                Map.entry("brown", 1),
                Map.entry("red", 2),
                Map.entry("orange", 3),
                Map.entry("yellow", 4),
                Map.entry("green", 5),
                Map.entry("blue", 6),
                Map.entry("violet", 7),
                Map.entry("grey", 8),
                Map.entry("white", 9)
        );

        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        sc.nextLine();

        String output = "";
        for (int i = 0; i < numberOfInputs; i++) {
            String color = sc.nextLine();
            if (colorMap.containsKey(color) && output.length() < 2) {
                output += colorMap.get(color);
            } else break;
        }

        System.out.println(output);
    }
}
