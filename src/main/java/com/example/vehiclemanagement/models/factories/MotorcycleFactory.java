package com.example.vehiclemanagement.models.factories;
import com.example.vehiclemanagement.models.Vehicle;
import com.example.vehiclemanagement.models.Motorcycle;

public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
