package za.ac.cput.demo_car_service_portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.demo_car_service_portal.entity.Booking;
import za.ac.cput.demo_car_service_portal.repository.BookingRepository;
import za.ac.cput.demo_car_service_portal.service.BookingService;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository  repository;

    @Autowired
    public BookingServiceImpl(BookingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Booking create(Booking booking) { return repository.save(booking); }

    @Override
    public Booking update(Booking booking, Long key) { return repository.save(booking); }

    @Override
    public List<Booking> readAll() {
        return repository.findAll();
    }

    @Override
    public Booking readById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) { repository.deleteById(id); }
}
