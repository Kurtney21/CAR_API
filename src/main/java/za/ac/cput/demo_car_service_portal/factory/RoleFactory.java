package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Role;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class RoleFactory {
    public static Role createRole(String name) {
        Helper.checkStringParam(name, "name");

        return Role.builder()
                .name(name)
                .build();
    }
}
