package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Workshop;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class WorkshopFactory {

    public static Workshop createWorkshop(String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Workshop.builder()
                .name(name)
                .location(location)
                .build();
    }
}
