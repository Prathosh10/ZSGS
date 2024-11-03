import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class RNA_Transcription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'G') {
            System.out.println("C");
        } else if (ch == 'C') {
            System.out.println("G");
        } else if (ch == 'T') {
            System.out.println("A");
        } else if (ch == 'A') {
            System.out.println("U");
        }
    }
}
