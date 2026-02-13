package com.example.solid.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LSPTest {

    @Test
    void gasCarShouldDriveAndRefuel() {
        GasolineCar gasCar = new GasolineCar();

        assertDoesNotThrow(() -> gasCar.drive());
        assertDoesNotThrow(() -> gasCar.refuel());
    }

    @Test
    void electricCarShouldDriveWithoutError() {
        ElectricCar electricCar = new ElectricCar();

        assertDoesNotThrow(() -> electricCar.drive());
    }
}
