package Assignment_2;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give three inputs : ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
