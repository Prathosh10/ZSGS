import java.util.*;

public class Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence :");
        String word = sc.nextLine();
        String acronym = formAcronym(word);

        System.out.println(acronym);
    }

    private static String formAcronym(String word) {
        Set<String> omit = new HashSet<>(Arrays.asList("a", "an", "the", "and", "or", "but", "of", "in", "for", "on", "with"));
        String res = "";

        List<String> words = split(word);

        for (int i = 0; i < words.size(); i++) {
            if (!omit.contains(words.get(i).toLowerCase())) {
                res += words.get(i).toUpperCase().charAt(0);
            }
        }
        return res;
    }

    private static List<String> split(String s) {
//        String[] sp = s.split("[ \\-]+");
        List<String> words = new ArrayList<>();
        String temp = "";
        for  (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' || ch == '-' || i == s.length() - 1) {
                if (i == s.length() - 1)
                    temp += ch;
                words.add(temp);
                temp = "";
            } else {
                temp += ch;
            }
        }
        return words;
    }
}

/* Test cases :
As Soon As Possible
Liquid-crystal display
Thank George It's Friday!
Portable Network Graphics
World Health Organization
United Nations Educational, Scientific, and Cultural Organization
National Aeronautics and Space Administration
 */
