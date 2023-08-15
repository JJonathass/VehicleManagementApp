package com.example.vehiclemanagement.services;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.vehiclemanagement.models.Vehicle;
import com.example.vehiclemanagement.models.factories.VehicleFactory;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


@Service
public class VehicleService {

    private List<Vehicle> vehicles = new ArrayList<>();

    @Autowired
    private VehicleFactory carFactory;

    @Autowired
    private VehicleFactory motorcycleFactory;

    @Autowired
    private VehicleFactory truckFactory;

    @PostConstruct
    public void run() {
        createAndStartVehicles();
    }

    public void createAndStartVehicles() {
        Vehicle car = carFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        car.start();
        motorcycle.start();
        truck.start();
    }

    public void createCar() {
        Vehicle car = carFactory.createVehicle();
        vehicles.add(car);
    }

    public void createMotorcycle() {
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        vehicles.add(motorcycle);
    }

    public void createTruck() {
        Vehicle truck = truckFactory.createVehicle();
        vehicles.add(truck);
    }

    public List<String> listVehicleTypes() {
        return vehicles.stream()
                .map(vehicle -> vehicle.getClass().getSimpleName())
                .collect(Collectors.toList());
    }
}

