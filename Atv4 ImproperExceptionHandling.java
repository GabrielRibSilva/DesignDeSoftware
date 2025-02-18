public class ImproperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}

class Calculator {
    public void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}