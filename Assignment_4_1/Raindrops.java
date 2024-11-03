import java.util.Scanner;

public class Raindrops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String res = "";
        if (n % 3 == 0) {
            res += "Pling ";
        }
        if (n % 5 == 0) {
            res += "Plang ";
        }
        if (n % 7 == 0) {
            res += "Plong";
        }
        if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0){
            res += "34";
        }

        System.out.println(res);

    }
}
