public class Vehicle {
    private String name;
    private String model;
    private String type;
    private String color;
    private int milege;
    private double price;

    public Vehicle(String name, String model, String type, String color, int milege, double price) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.color = color;
        this.milege = milege;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Name : " + this.name + "\n" +
                            "Model : " + this.model + "\n" +
                            "Type : " + this.type + "\n" +
                            "Color : " + this.color + "\n" +
                            "Milege : " + this.milege + "\n" +
                            "Price : " + this.price);

    }
}

class Bike extends Vehicle{

    public Bike(String name, String model, String color, int milege, double price) {
        super(name, model, "Two-Wheeler", color, milege, price);
    }

    public void getDetails() {
        super.getDetails();
        System.out.println();
    }
}

class Car extends Vehicle{
    private boolean isConvertable;

    public Car(String name, String model, String color, int milege, double price, boolean isConvertable) {
        super(name, model, "Four-Wheeler", color, milege, price);
        this.isConvertable = isConvertable;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Convertable : " + isConvertable);
        System.out.println();
    }
}

class vehicleDemo {
    public static void main(String[] args) {
        Vehicle honda = new Bike("Honda", "H15", "Black", 60, 150000);
        Vehicle audi = new Car("Audi", "aero123", "Blue", 40, 1800000, true);
        honda.getDetails();
        audi.getDetails();
    }
}
