public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getArea();
}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class DemoShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println(c.getName());
        System.out.println(c.getArea());

        Shape r = new Rectangle(10, 20);
        System.out.println(r.getName());
        System.out.println(r.getArea());

    }
}
