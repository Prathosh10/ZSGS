import java.util.Scanner;

public class BottleSong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbersInWords = {"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        System.out.println("Enter starting bottle number : ");
        int start = sc.nextInt();
        System.out.println("Enter ending number : ");
        int end = sc.nextInt();

        StringBuilder song = new StringBuilder();

        for (int i = end; i >= start; i--) {
            String lineOneAndTwo = "";
            lineOneAndTwo += numbersInWords[i] + " green bottle" + (i != 1 ? "s hanging on the wall, \n" : " hanging on the wall, \n");
            lineOneAndTwo += lineOneAndTwo;
            String lineThree = "And if one green bottle should accidentally fall, \n";

            String lineFour = "There'll be " + numbersInWords[i - 1].toLowerCase() + " green bottle" + (i != 1 ? "s hanging on the wall. \n" : " hanging on the wall. \n");
            song.append(lineOneAndTwo);
            song.append(lineThree);
            song.append(lineFour);
            song.append("\n");
        }

        System.out.println(song);

    }
}
