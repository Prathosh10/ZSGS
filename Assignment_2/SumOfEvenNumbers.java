package Assignment_2;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter array size : ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Give inputs for array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int evenSum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 1) {
                continue;
            }
            evenSum += arr[i];
        }

        System.out.println("Even sum : " + evenSum);
    }
}
