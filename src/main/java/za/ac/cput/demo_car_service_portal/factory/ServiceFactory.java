package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Service;
import za.ac.cput.demo_car_service_portal.entity.User;
import za.ac.cput.demo_car_service_portal.entity.Workshop;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class ServiceFactory {
    public static Service createService(String name, String description, Long cost, long workshop_Id) {

        return Service.builder()
                .name(name)
                .description(description)
                .cost(cost)
                .workshop_Id(workshop_Id)
                .build();
    }
}
