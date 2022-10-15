package za.ac.cput.demo_car_service_portal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Workshop;
import za.ac.cput.demo_car_service_portal.service.impl.WorkshopServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/workshop")
public class WorkshopController {
    private final WorkshopServiceImpl workshopService;

    @Autowired
    private WorkshopController(WorkshopServiceImpl workshopService) {
        this.workshopService = workshopService;
    }

    //Save Workshop Entity
    @PostMapping("/create")
    public ResponseEntity<Workshop> create(@RequestBody @Validated Workshop workshop) {
        try {
            return new ResponseEntity<>(workshopService.create(workshop), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Workshop>> readAll() {
        List<Workshop> workshops = workshopService.findAll();
        return ResponseEntity.ok(workshops);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Workshop> readById(@PathVariable Long id) {
        Workshop workshop = workshopService.findById(id);
        return ResponseEntity.ok(workshop);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        workshopService.delete(id);
        return ResponseEntity.ok("workshop Deleted");
    }
}
