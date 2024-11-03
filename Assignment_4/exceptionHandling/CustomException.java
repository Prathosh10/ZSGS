package exceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws OnlyCharacter{
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your name : ");
            String s = sc.nextLine();

            for (int i = 0; i < s.length(); i++) {
                if (!Character.isAlphabetic(s.charAt(i))) {
                    throw new OnlyCharacter();
                }
            }
        } catch (OnlyCharacter e) {
//            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }
}

class OnlyCharacter extends Exception {
    public String getMessage() {
        return "Numbers and Symbols not accept!";
    }
}

