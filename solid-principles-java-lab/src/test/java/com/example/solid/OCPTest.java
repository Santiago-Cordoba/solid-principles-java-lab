package com.example.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OCPTest {

    @Test
    void shouldApplyRegularDiscount() {
        DiscountStrategy strategy = new RegularDiscount();
        DiscountCalculator calculator = new DiscountCalculator(strategy);

        double discount = calculator.calculate(100);

        assertEquals(10, discount);
    }

    @Test
    void shouldApplyVipDiscount() {
        DiscountStrategy strategy = new VipDiscount();
        DiscountCalculator calculator = new DiscountCalculator(strategy);

        double discount = calculator.calculate(100);

        assertEquals(20, discount);
    }
}
