package za.ac.cput.demo_car_service_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Vehicle;
import za.ac.cput.demo_car_service_portal.service.impl.VehicleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private final VehicleServiceImpl vehicleService;

    @Autowired
    private VehicleController(VehicleServiceImpl vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create")
    public ResponseEntity<Vehicle> create(@RequestBody @Validated Vehicle vehicle) {
        try {
            return new ResponseEntity<>(vehicleService.create(vehicle), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Vehicle>> readAll() {
        List<Vehicle> vehicles = vehicleService.findAll();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Vehicle> readById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.findById(id);
        return ResponseEntity.ok(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        vehicleService.delete(id);
        return ResponseEntity.ok("vehicle Deleted");
    }
}
