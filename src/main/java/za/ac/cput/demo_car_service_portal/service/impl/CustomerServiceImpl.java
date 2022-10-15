package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.repository.CustomerRepository;
import za.ac.cput.demo_car_service_portal.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) { return repository.save(customer); }

    @Override
    public Customer update(Customer customer, Long aLong) {
        return null;
    }

    @Override
    public List<Customer> findAll() { return repository.findAll(); }

    @Override
    public Customer findById(Long key) { return repository.findById(key).orElse(null); }

    @Override
    public void delete(Long id) { repository.deleteById(id);}
}
