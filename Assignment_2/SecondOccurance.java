package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter array size : ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Give inputs for array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("input : ");
        int target = in.nextInt();
        int Occurance = 1;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (Occurance == 2 && arr[i] == target) {
                position = i;
            }
            if (arr[i] == target) {
                Occurance++;
            }
        }

        System.out.println(position);
    }
}
