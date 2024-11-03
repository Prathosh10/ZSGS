import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;

public class Grains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square : ");
        int square = sc.nextInt();
        BigInteger totalGrains = BigInteger.valueOf(0);
        BigInteger grainsInSquare = BigInteger.valueOf(0);

        for (int i = 0; i < 64; i++) {
            totalGrains = totalGrains.add(BigInteger.valueOf(2).pow(i));

            if (i == square) {
                grainsInSquare = grainsInSquare.add(BigInteger.valueOf(2).pow(i));
            }
        }

        System.out.println("Grains on a given square : " + grainsInSquare);
        System.out.println("Total Grains on chess board : " + totalGrains);

    }
}
