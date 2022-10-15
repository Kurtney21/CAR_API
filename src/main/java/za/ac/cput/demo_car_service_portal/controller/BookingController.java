package za.ac.cput.demo_car_service_portal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.demo_car_service_portal.entity.Booking;
import za.ac.cput.demo_car_service_portal.service.impl.BookingServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingServiceImpl bookingService;

    @Autowired
    private BookingController(BookingServiceImpl bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    public ResponseEntity<Booking> create(@RequestBody @Validated Booking booking) {
        try {
            return new ResponseEntity<>(bookingService.create(booking), HttpStatus.CREATED);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Booking>> readAll() {
        List<Booking> bookings = bookingService.findAll();
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Booking> readById(@PathVariable Long id) {
        Booking booking = bookingService.findById(id);
        return ResponseEntity.ok(booking);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        bookingService.delete(id);
        return ResponseEntity.ok("Booking Deleted");
    }
}
