package com.example.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SRPTest {

    @Test
    void shouldCalculateTotalWithTax() {
        Invoice invoice = new Invoice("Santiago", 100);
        InvoiceCalculator calculator = new InvoiceCalculator();

        double total = calculator.calculateTotal(invoice);

        assertEquals(121.0, total);
    }

    @Test
    void shouldReturnCorrectCustomer() {
        Invoice invoice = new Invoice("Carlos", 200);

        assertEquals("Carlos", invoice.getCustomer());
        assertEquals(200, invoice.getAmount());
    }
}
