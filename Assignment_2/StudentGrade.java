package Assignment_2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int mark = in.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade : O");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Grade : A+");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Grade A");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Grade B");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Sorry No Grade!");
        }
    }
}
