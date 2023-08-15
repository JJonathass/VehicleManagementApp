package com.example.vehiclemanagement.api;

import com.example.vehiclemanagement.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/iniciar-veiculos")
    public String startVehicles() {
        vehicleService.createAndStartVehicles();
        return "Veículos iniciados com sucesso.";
    }

    @GetMapping("/criar-carro")
    public String createCar() {
        vehicleService.createCar();
        return "Carro criado com sucesso.";
    }

    @GetMapping("/criar-moto")
    public String createMotorcycle() {
        vehicleService.createMotorcycle();
        return "Moto criada com sucesso.";
    }

    @GetMapping("/criar-caminhao")
    public String createTruck() {
        vehicleService.createTruck();
        return "Caminhão criado com sucesso.";
    }

    @GetMapping("/listar-veiculos")
    public List<String> listVehicles() {
        return vehicleService.listVehicleTypes();
    }

}

