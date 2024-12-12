//package LiftProblem;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class LiftOne {
//    public static void main(String[] args) {
//        LiftRow lift = new LiftRow(5);
//        lift.positionOfLifts();
//
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("user from : ");
//            int from = scanner.nextInt();
//            int to = scanner.nextInt(); // destination
//            lift.moveLift(from, to);
//
//        } while (true);
//    }
//}
//
//class Lift {
//    private String no;
//    private int floor;
//
//    Lift(String no, int floor) {
//        this.no = no;
//        this.floor = floor;
//    }
//
//    public String getNo() {
//        return no;
//    }
//
//    public void setNo(String no) {
//        this.no = no;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//}
//
//class LiftRow {
//    private Lift[] lift;
//    private int pointer = 1;
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
//        for (int i = 1; i < 6; i++) {
//            Lift l = lift[i];
//            System.out.print(l.getNo() + " : " + l.getFloor() + "  ");
//        }
//    }
//
//    public void moveLift(int from, int to) {
//        lift[pointer++].setFloor(to);
//        positionOfLifts();
//
//        if (pointer % lift.length == 0) {
//            pointer = 1;
//        }
//    }
//}