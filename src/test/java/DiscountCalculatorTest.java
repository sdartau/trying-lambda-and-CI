import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator calculator = new DiscountCalculator();

    @ParameterizedTest
    @CsvSource({
            "200.0, 40, 120.0",
            "125.0, 0, 125.0",
            "725.564, 100, 0.0"
    })
    void testApplyDiscount(double originalPrice, int discount, double expected){
        assertEquals(expected, calculator.applyDiscount(originalPrice, discount), 0.0001);
    }

    @Test
    void testNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.applyDiscount(-100.0, 10);
        });
    }

    @Test
    void testDiscountOver100ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.applyDiscount(100.0, 150);
        });
    }

    @Test
    void testNegativeDiscountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.applyDiscount(100.0, -10);
        });
    }
}
