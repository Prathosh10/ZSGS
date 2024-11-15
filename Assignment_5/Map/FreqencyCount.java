package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqencyCount {
    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        System.out.println(freq);
    }
}
