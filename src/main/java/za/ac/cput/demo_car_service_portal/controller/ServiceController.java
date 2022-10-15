package za.ac.cput.demo_car_service_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Service;
import za.ac.cput.demo_car_service_portal.service.impl.ServicesServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ServicesServiceImpl serviceService;

    @Autowired
    private ServiceController(ServicesServiceImpl serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping("/create")
    public ResponseEntity<Service> create(@RequestBody @Validated Service service) {
        try {
            return new ResponseEntity<>(serviceService.create(service), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Service>> readAll() {
        List<Service> services = serviceService.findAll();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Service> readById(@PathVariable Long id) {
        Service service = serviceService.findById(id);
        return ResponseEntity.ok(service);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        serviceService.delete(id);
        return ResponseEntity.ok("service Deleted");
    }
}
