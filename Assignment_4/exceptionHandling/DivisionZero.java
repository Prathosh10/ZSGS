package exceptionHandling;

public class DivisionZero {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int divide = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error : give input cannot accept, give input greater than zero!");
        }
    }
}
