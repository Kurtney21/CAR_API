package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Booking;
import za.ac.cput.demo_car_service_portal.util.Helper;

import java.util.Date;

public class BookingFactory {
    public static Booking createBooking( String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Booking.builder()
                .date(new Date())

                .build();
    }
}
