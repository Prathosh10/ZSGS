import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of level completed : ");
        int level = sc.nextInt();

        System.out.print("how many base values are collected : ");
        int noOfBaseValues = sc.nextInt();

        System.out.print("Enter base values : ");
        int[] baseValues = new int[noOfBaseValues];
        for (int i = 0; i < noOfBaseValues; i++) {
            baseValues[i] = sc.nextInt();
        }

        int totalPoints = calculatePoints(level, baseValues);
        System.out.println("the player earns " + totalPoints + " energy points for completing level " + level);
    }

    private static int calculatePoints(int level, int[] baseValues) {
        Set<Integer> unique = new HashSet<>();
        for (int i : baseValues) {
            for (int j = i; j < level; j = j + i) {
                unique.add(j);
            }
        }
        int totalPoints = 0;
        for (int points : unique) {
            totalPoints += points;
        }

        return totalPoints;
    }
}
