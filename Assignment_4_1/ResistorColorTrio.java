import java.util.Map;
import java.util.Scanner;

public class ResistorColorTrio {
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
        System.out.println("Enter three colors : ");
        String output = "";
        for (int i = 0; i < 3; i++) {
            String color = sc.nextLine();
            if (i == 2) {
                if (color.equals("black")) {
                    output += " ohms";
                } else if (color.equals("brown")) {
                    output += "0";
                    output += " ohms";
                } else if (color.equals("red")) {
                    output += "00";
                    output += " ohms";
                } else if (color.equals("orange")) {
                    output += " kilo-ohms";
                } else if (color.equals("yellow")) {
                    output += "0 kilo-ohms";
                } else if (color.equals("green")) {
                    output += " mega-ohms";
                }
            }
            else if (colorMap.containsKey(color) && output.length() < 2) {
                output += colorMap.get(color);
            }

        }


        System.out.println(output);
    }
}
