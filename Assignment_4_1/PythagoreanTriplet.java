import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();

        for (int i = 1; i < n / 3; i++) {
            for (int j = i + 1; j < n / 2; j++) {
                int rem = n - i - j;
                if (i + j + rem == n && ((i * i) + (j * j) == (rem * rem)) ) {
                    System.out.println(i + " " + j + " " + rem);
                }
            }
        }
    }
}