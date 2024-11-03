public class Vehicle_MO {
    private String name;
    private String model;
    private String type;
    private String color;
    private int milege;
    private double price;

    public Vehicle_MO(String name, String model, String type, String color, int milege, double price) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.color = color;
        this.milege = milege;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Vehicle is started!");
    }

    public void stop() {
        System.out.println("Vehicle is stoped!");
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

class Bikes extends Vehicle_MO{

    public Bikes(String name, String model, String color, int milege, double price) {
        super(name, model, "Two-Wheeler", color, milege, price);
    }

    @Override
    public void start() {
        System.out.println(super.getName() + " is started!");
    }

    @Override
    public void stop() {
        System.out.println(super.getName() + " is stoped!");
    }

    public void getDetails() {
        super.getDetails();
        System.out.println();
    }
}

class Cars extends Vehicle_MO{
    private boolean isConvertable;

    public Cars(String name, String model, String color, int milege, double price, boolean isConvertable) {
        super(name, model, "Four-Wheeler", color, milege, price);
        this.isConvertable = isConvertable;
    }

    @Override
    public void start() {
        System.out.println(super.getName() + " is started!");
    }

    @Override
    public void stop() {
        System.out.println(super.getName() + " id stoped!");
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Convertable : " + isConvertable);
        System.out.println();
    }
}

class vehicleDemo1 {
    public static void main(String[] args) {
        Vehicle_MO honda = new Bikes("Honda", "H15", "Black", 60, 150000);
        Vehicle_MO audi = new Cars("Audi", "aero123", "Blue", 40, 1800000, true);
        honda.getDetails();
        honda.start();
        honda.stop();
        System.out.println();
        audi.getDetails();
        audi.stop();
        audi.stop();
    }
}
