import java.util.HashMap;
import java.util.Map;

public class ResistorColors {
    public static void main(String[] args) {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] value = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 10; i++) {
            System.out.println(colors[i] + " : " + value[i]);
        }
    }
}
