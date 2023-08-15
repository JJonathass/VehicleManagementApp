package com.example.vehiclemanagement.models;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopping...");
    }
}

