package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.demo_car_service_portal.entity.Role;
import za.ac.cput.demo_car_service_portal.repository.RoleRepository;
import za.ac.cput.demo_car_service_portal.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Role create(Role role) {
        return repository.save(role);
    }

    @Override
    public Role update(Role role, Long aLong) {
        return null;
    }

    @Override
    public List<Role> readAll() { return repository.findAll(); }

    @Override
    public Role readById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
