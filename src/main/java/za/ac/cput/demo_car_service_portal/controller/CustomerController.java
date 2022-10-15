package za.ac.cput.demo_car_service_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.service.impl.CustomerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    @Autowired
    private CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody @Validated Customer customer) {
        try {
            return new ResponseEntity<>(customerService.create(customer), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Customer>> readAll() {
        List<Customer> customers = customerService.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> readById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        customerService.delete(id);
        return ResponseEntity.ok("Customer Deleted");
    }
}
