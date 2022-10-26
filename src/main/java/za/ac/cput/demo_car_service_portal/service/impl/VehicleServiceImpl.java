package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.demo_car_service_portal.entity.Vehicle;
import za.ac.cput.demo_car_service_portal.repository.VehicleRepository;
import za.ac.cput.demo_car_service_portal.service.VehicleService;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository repository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Vehicle create(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle, Long aLong) {
        return null;
    }

    @Override
    public List<Vehicle> readAll() { return repository.findAll(); }

    @Override
    public Vehicle readById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
