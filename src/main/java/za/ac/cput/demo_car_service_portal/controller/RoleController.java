package za.ac.cput.demo_car_service_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Role;
import za.ac.cput.demo_car_service_portal.service.impl.RoleServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleServiceImpl roleService;

    @Autowired
    private RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/create")
    public ResponseEntity<Role> create(@RequestBody @Validated Role role) {
        try {
            return new ResponseEntity<>(roleService.create(role), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Role>> readAll() {
        List<Role> roles = roleService.readAll();
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Role> readById(@PathVariable Long id) {
        Role role = roleService.readById(id);
        return ResponseEntity.ok(role);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        roleService.delete(id);
        return ResponseEntity.ok("Role Deleted");
    }
}
