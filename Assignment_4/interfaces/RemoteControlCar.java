package interfaces;

import java.util.*;

public interface RemoteControlCar {
    public void drive();
    public int getDistanceTravelled();
}

class ProductionRemoteControlCar implements RemoteControlCar{
    private int units;
    private int numberOfVictories;
    private String name;

    public ProductionRemoteControlCar(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        this.units += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return units;
    }

    public void setNumberOfvictories(int n) {
        this.numberOfVictories = n;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public String getName() {
        return name;
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int units;
    @Override
    public void drive() {
        this.units += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return units;
    }
}

class TestTrack {
    public static void race(RemoteControlCar rcc) {
        rcc.drive();
    }

    public static void getRankedCars(List<ProductionRemoteControlCar> unsortedCars) {
        Collections.sort(unsortedCars, Comparator.comparingInt(ProductionRemoteControlCar ::getNumberOfVictories).reversed());
    }
}

class RemoteControlCompetition {
    public static void main(String[] args) {
        ProductionRemoteControlCar prcc = new ProductionRemoteControlCar("fero");
        ProductionRemoteControlCar prcc1 = new ProductionRemoteControlCar("muro");
        ProductionRemoteControlCar prcc2 = new ProductionRemoteControlCar("terro");
        TestTrack.race(prcc);
        System.out.println(prcc.getDistanceTravelled());

        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
        TestTrack.race(exp);
        System.out.println(exp.getDistanceTravelled());

        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        prcc.setNumberOfvictories(20);
        prcc1.setNumberOfvictories(15);
        prcc2.setNumberOfvictories(21);
        unsortedCars.add(prcc);
        unsortedCars.add(prcc1);
        unsortedCars.add(prcc2);

        for (ProductionRemoteControlCar pc : unsortedCars) {
            System.out.print(pc.getName() + " ");
        }
        System.out.println();
        TestTrack.getRankedCars(unsortedCars);
        for (ProductionRemoteControlCar pc : unsortedCars) {
            System.out.print(pc.getName() + " ");
        }
    }
}
