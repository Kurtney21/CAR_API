package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.demo_car_service_portal.entity.Service;
import za.ac.cput.demo_car_service_portal.repository.ServiceRepository;
import za.ac.cput.demo_car_service_portal.service.ServicesService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService {
    private final ServiceRepository repository;

    @Autowired
    public ServicesServiceImpl(ServiceRepository repository) {
        this.repository = repository;
    }
    @Override
    public Service create(Service service) {
        return repository.save(service);
    }

    @Override
    public Service update(Service service, Long aLong) {
        return null;
    }

    @Override
    public List<Service> findAll() {
        return repository.findAll();
    }

    @Override
    public Service findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
