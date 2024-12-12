package LiftProblem;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LiftFive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of lifts build : ");
        int noOfLifts = scanner.nextInt();
        LiftRow lift = new LiftRow(noOfLifts);
        lift.positionOfLifts();

        do {
            System.out.println("\n user from : ");
            int from = scanner.nextInt();
            int to = scanner.nextInt(); // destination
            if (from < 0) {
                System.out.println("Invalid floor!!!");
                continue;
            } else if (to > 10){
                System.out.println("Invalid floor NUMBER!!!");
                continue;
            }
            lift.moveLift(from, to);

        } while (true);
    }
}

class Lift {
    private String name;
    private int liftNo;
    private int floor;
    private int noOfStops;

    Lift(String no, int liftNo, int floor, int noOfStops) {
        this.liftNo = liftNo;
        this.name = no;
        this.floor = floor;
        this.noOfStops = noOfStops;
    }

    public String getName() {
        return name;
    }

    public void setName(String no) {
        this.name = no;
    }

    public int getPosition() {
        return floor;
    }

    public void setPosition(int floor) {
        this.floor = floor;
    }

    public int getNoOfStops() {
        return noOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        this.noOfStops = noOfStops;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }
}

class LiftRow {
    private Lift[] lift;

    LiftRow(int n) {
        lift = new Lift[n + 1];
        buildLift();
    }

    private void buildLift() {
        for (int i = 1; i < lift.length; i++) {
            lift[i] = new Lift("L" + i, i,0, 6);

            if (i == 5) {
                lift[i].setNoOfStops(10);
            }
        }
    }

    public void positionOfLifts() {
        for (int i = 1; i < lift.length; i++) {
            Lift l = lift[i];
            System.out.print(l.getName() + " : " + l.getPosition() + "  ");
        }
    }

    public void moveLift(int from, int to) {
        int nearestLift = findNearestLiftPosition(from, to);
        lift[nearestLift].setPosition(to);
        System.out.println(lift[nearestLift].getName() + " is assigned!");
        positionOfLifts();
    }

    private int findNearestLiftPosition(int currentPoint, int destinationPoint) {
        int nearPoint = 10;
        int positon = 1;
        int noOfStops = 10;

        for (int i = 1; i < lift.length; i++) {
            Lift l = lift[i];

            if (!((destinationPoint >= 0 && destinationPoint <= 5) || (currentPoint >= 0 && currentPoint <= 5)) && ((l.getName().equals("L1") || l.getName().equals("L2")))) {
                continue;
            }
            if (!((destinationPoint >= 6 && destinationPoint <= 10) || (currentPoint >= 6 && currentPoint <= 10)) && ((l.getName().equals("L3") || l.getName().equals("L4")))) {
                continue;
            }
            if (nearPoint > Math.abs(l.getPosition() - currentPoint) && (noOfStops > Math.abs(currentPoint - l.getNoOfStops()))) {
                nearPoint = Math.abs(l.getPosition() - currentPoint);
                positon = i;
                noOfStops = Math.abs(currentPoint - l.getNoOfStops());

            }
        }

        return positon;
    }
}