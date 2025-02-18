public class ProperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); 
        }
        return a / b;
    }
}