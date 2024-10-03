package Assignment_2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which multiplication table want ?");

        int number = in.nextInt();
        int i = 1;

        while (i <= 20) {
            System.out.printf("%3d x %d = %2d", i, number, i * number);
            System.out.println();
            i++;
        }
    }
}
