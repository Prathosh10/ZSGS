import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String sentence = sc.nextLine();

        if (checkPangram(sentence)) {
            System.out.println("Yes, Given sentence is pangram");
        } else {
            System.out.println("No, Given sentence is not pangram");
        }

        // other solution
//        otherSolution(sentence);

    }

    private static boolean checkPangram(String s) {
        int[] alphabets = new int[26];
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                alphabets[ch - 'A']++;
        }
        System.out.println(Arrays.toString(alphabets));

        for (int i : alphabets) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void otherSolution(String sentence) {
        String sentance1 = sentence.toLowerCase();
        boolean check = true;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if (sentance1.indexOf(ch) == -1) {
                System.out.println("No, Given sentence is not pangram");
                check = false;
                break;
            }
        }

        if (check)
            System.out.println("Yes, Given sentence is pangram");
    }
}

/*
Test cases :
AaBbcdefghijklmnopqrstuvwxyz
abcfghijklmnopqrstuvwxyz
The quick brown fox jumps over the lazy dog
 */
