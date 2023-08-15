package com.example.vehiclemanagement.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import com.example.vehiclemanagement.models.factories.VehicleFactory;
import com.example.vehiclemanagement.models.factories.CarFactory;
import com.example.vehiclemanagement.models.factories.MotorcycleFactory;
import com.example.vehiclemanagement.models.factories.TruckFactory;

@Configuration
@ComponentScan(basePackages = "com.example.vehiclemanagement")
public class AppConfig {

    @Bean
    public VehicleFactory carFactory() {
        return new CarFactory();
    }

    @Bean
    public VehicleFactory motorcycleFactory() {
        return new MotorcycleFactory();
    }

    @Bean
    public VehicleFactory truckFactory() {
        return new TruckFactory();
    }
}

