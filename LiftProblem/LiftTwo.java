//package LiftProblem;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class LiftTwo{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("No of lifts build : ");
//        int noOfLifts = scanner.nextInt();
//        LiftRow lift = new LiftRow(noOfLifts);
//        lift.positionOfLifts();
//
//        do {
//            System.out.println("\n user from : ");
//            int from = scanner.nextInt();
//            int to = scanner.nextInt(); // destination
//            lift.moveLift(from, to);
//
//        } while (true);
//    }
//}
//
//class Lift {
//    private String name;
//    private int floor;
//
//    Lift(String no, int floor) {
//        this.name = no;
//        this.floor = floor;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String no) {
//        this.name = no;
//    }
//
//    public int getPosition() {
//        return floor;
//    }
//
//    public void setPosition(int floor) {
//        this.floor = floor;
//    }
//}
//
//class LiftRow {
//    private Lift[] lift;
//
//    LiftRow(int n) {
//        lift = new Lift[n + 1];
//        buildLift();
//    }
//
//    private void buildLift() {
//        for (int i = 1; i < lift.length; i++) {
//            lift[i] = new Lift("L" + i, 0);
//        }
//    }
//
//    public void positionOfLifts() {
//        for (int i = 1; i < lift.length; i++) {
//            Lift l = lift[i];
//            System.out.print(l.getName() + " : " + l.getPosition() + "  ");
//        }
//    }
//
//    public void moveLift(int from, int to) {
//        int nearestLift = findNearestLiftPosition(from);
//        lift[nearestLift].setPosition(to);
//        System.out.println(lift[nearestLift].getName() + " is assigned!");
//        positionOfLifts();
//    }
//
//    private int findNearestLiftPosition(int currentPoint) {
//        int nearPoint = 10;
//        int positon = 1;
//
//        for (int i = 1; i < lift.length; i++) {
//            Lift l = lift[i];
//
//            if (nearPoint > Math.abs(l.getPosition() - currentPoint)) {
//                nearPoint = Math.abs(l.getPosition() - currentPoint);
//                positon = i;
//
//            }
//        }
//
//        return positon;
//    }
//}