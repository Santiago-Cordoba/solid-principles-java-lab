package com.example.solid.dip;

public class MongoDatabase implements Database {

    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en MongoDB...");
    }
}
