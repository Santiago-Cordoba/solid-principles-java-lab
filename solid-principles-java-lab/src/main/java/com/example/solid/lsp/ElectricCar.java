package com.example.solid.lsp;

public class ElectricCar implements Drivable {

    @Override
    public void drive() {
        System.out.println("Conduciendo coche eléctrico...");
    }

    public void charge() {
        System.out.println("Cargando batería...");
    }
}
