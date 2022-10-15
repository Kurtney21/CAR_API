package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.demo_car_service_portal.entity.Employee;
import za.ac.cput.demo_car_service_portal.repository.EmployeeRepository;
import za.ac.cput.demo_car_service_portal.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }
    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee, Long aLong) {
        return null;
    }

    @Override
    public List<Employee> findAll() { return repository.findAll(); }

    @Override
    public Employee findById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
