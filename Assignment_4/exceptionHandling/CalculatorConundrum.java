package exceptionHandling;

public class CalculatorConundrum {
    public void calculate(int a, int b, String symbol) {
       try {
           if (symbol == null) {
               throw new IllegalArgumentException("Operation cannot be null!");
           } else if (symbol.isEmpty()) {
               throw new IllegalArgumentException("Operation cannot be empty!");
           } else if (symbol.equals("-")) {
               throw new IllegalOperationException("Operation '-' does not exist!");
           } else if (b == 0) {
               throw new IllegalOperationException("Division by zero is not allowed!");
           } else {
               if (symbol.equals("+")) {
                   System.out.println(a + " "+ symbol + " " + b + " = " + (a + b));
               } else if (symbol.equals("*")) {
                   System.out.println(a +" "+ symbol + " " +b + " = " + (a * b));
               } else if (symbol.equals("/")) {
                   System.out.println(a + " "+ symbol + " " + b + " = " + (a / b));
               }
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}

class IllegalOperationException extends Exception{
    public IllegalOperationException(String message) {
        super(message);
    }
}

class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorConundrum calculator = new CalculatorConundrum();
        calculator.calculate(20, 10, null);
    }
}
