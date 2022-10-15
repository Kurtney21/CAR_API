package za.ac.cput.demo_car_service_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Employee;
import za.ac.cput.demo_car_service_portal.service.impl.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    @Autowired
    private EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody @Validated Employee employee) {
        try {
            return new ResponseEntity<>(employeeService.create(employee), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> readAll() {
        List<Employee> employees = employeeService.findAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> readById(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok("employee Deleted");
    }
}
