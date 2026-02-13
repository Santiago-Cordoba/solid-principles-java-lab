package com.example.solid.isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ISPTest {

    @Test
    void developerShouldWork() {
        Developer developer = new Developer();

        assertDoesNotThrow(() -> developer.work());
    }

    @Test
    void managerShouldWorkAndEat() {
        Manager manager = new Manager();

        assertDoesNotThrow(() -> manager.work());
        assertDoesNotThrow(() -> manager.eat());
    }
}
