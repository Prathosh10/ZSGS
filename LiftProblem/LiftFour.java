//package LiftProblem;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class LiftFour{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(Syst
//                em.in);
//        System.out.println("No of lifts build : ");
//        int noOfLifts = scanner.nextInt();
//        LiftRow lift = new LiftRow(noOfLifts);
//        lift.positionOfLifts();
//
//        do {
//            System.out.println("\n user from : ");
//            int from = scanner.nextInt();
//            int to = scanner.nextInt(); // destination
//            if (from < 0) {
//                System.out.println("Invalid floor!!!");
//                continue;
//            } else if (to > 10){
//                System.out.println("Invalid floor NUMBER!!!");
//                continue;
//            }
//            lift.moveLift(from, to);
//
//        } while (true);
//    }
//}
//
//class Lift {
//    private String name;
//    private int liftNo;
//    private int floor;
//
//    Lift(String no, int liftNo,int floor) {
//        this.liftNo = liftNo;
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
//            lift[i] = new Lift("L" + i, i,0);
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
//        int nearestLift = findNearestLiftPosition(from, to);
//        lift[nearestLift].setPosition(to);
//        System.out.println(lift[nearestLift].getName() + " is assigned!");
//        positionOfLifts();
//    }
//
//    private int findNearestLiftPosition(int currentPoint, int destinationPoint) {
//        int nearPoint = 10;
//        int positon = 1;
//
//        for (int i = 1; i < lift.length; i++) {
//            Lift l = lift[i];
//
//            if (!(destinationPoint >= 0 && destinationPoint <= 5) && (l.getName().equals("L1") || l.getName().equals("L2"))) {
//                continue;
//            }
//            if (!(destinationPoint >= 6 && destinationPoint <= 10) && (l.getName().equals("L3") || l.getName().equals("L4"))) {
//                continue;
//            }
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