package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.User;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class UserFactory {
    public static User createUser(String userName, String password) {
        Helper.checkStringParam(userName, "UserName");
        Helper.checkStringParam(password, "Password");

        return User.builder()
                .userName(userName)
                .userPassword(password)
                .build();
    }
}
