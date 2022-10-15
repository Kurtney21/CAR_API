package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Role;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class RoleFactory {
    public static Role createRole(String name, String description) {
        Helper.checkStringParam(name, "RoleName");
        Helper.checkStringParam(description, "Description");

        return Role.builder()
                .roleName(name)
                .description(description)
                .build();
    }
}
