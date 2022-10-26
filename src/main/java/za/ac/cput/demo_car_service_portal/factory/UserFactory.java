package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.User;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class UserFactory {
    public static User createUser(String firstName, String lastName, String email, String password) {
        Helper.checkStringParam(firstName, "firstName");
        Helper.checkStringParam(lastName, "lastName");
        Helper.checkStringParam(email, "email");
        Helper.checkStringParam(password, "password");

        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    }
}
