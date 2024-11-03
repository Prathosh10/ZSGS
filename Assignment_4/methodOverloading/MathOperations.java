public class MathOperations {
    public long add(long a, long b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public long divide(long a, long b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

class MathOperationDemo {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();
        System.out.println(operation.add(100, 100));
        System.out.println(operation.add(200.0, 200.0));
        System.out.println(operation.subtract(1000, 1000));
        System.out.println(operation.subtract(190.0, 120.0));
        System.out.println(operation.multiply(100, 100));
        System.out.println(operation.multiply(200.0, 200.0));
        System.out.println(operation.divide(1000, 1000));
        System.out.println(operation.divide(190.0, 120.0));
    }
}
