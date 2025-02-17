public class OpenClosedViolation {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double discount = calculator.calculateDiscount(new VIPDiscount(), 200);
        System.out.println("Discount: " + discount);
    }
}

interface DiscountStrategy {
    double applyDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}

class VIPDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}

class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy discountStrategy, double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
