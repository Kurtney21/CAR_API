package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Service;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class ServiceFactory {
    public static Service createService(String name, String cost, String length) {
        Helper.checkStringParam(name, "ServiceName");
        Helper.checkStringParam(cost, "Cost");
        Helper.checkStringParam(length, "Length");

        return Service.builder()
                .name(name)
                .cost(cost)
                .length(length)
                .build();
    }
}
