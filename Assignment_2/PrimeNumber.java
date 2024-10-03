package Assignment_2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Prime Numbers 1 to 30 :");

        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
