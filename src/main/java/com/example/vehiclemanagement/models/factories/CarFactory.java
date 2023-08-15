package com.example.vehiclemanagement.models.factories;
import com.example.vehiclemanagement.models.Vehicle;
import com.example.vehiclemanagement.models.Car;


public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
