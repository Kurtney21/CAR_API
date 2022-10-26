package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Booking;
import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.entity.Service;
import za.ac.cput.demo_car_service_portal.entity.Vehicle;

import java.util.Date;

public class BookingFactory {
    public static Booking createBooking(String booking_status, long customer, long service, long vehicle){
        return Booking.builder()
                .booking_status(booking_status)
                .customer(customer)
                .service(service)
                .vehicle(vehicle)
                .build();
    }
}