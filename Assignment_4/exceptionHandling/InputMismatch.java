package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        System.out.println("Enter a phone number : ");
        Scanner sc = new Scanner(System.in);

        try {
            int number = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
