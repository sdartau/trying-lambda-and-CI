public class DiscountCalculator {

    public double applyDiscount(double originalPrice, int discountPercent){

        if (originalPrice < 0){
            throw new IllegalArgumentException("Original price can't be negative");
        }

        if (discountPercent < 0 || discountPercent > 100){
            throw new IllegalArgumentException("Discount percent must be between 0 and 100");
        }

        double coefficient = (100.0 - discountPercent) / 100;
        return originalPrice * coefficient;
    }

}
