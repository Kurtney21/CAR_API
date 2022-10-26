package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.entity.User;

public class CustomerFactory {
    public static Customer createCustomer(String firstName,String lastName,String email, String password) {
        User user = UserFactory.createUser(firstName, lastName, email, password);

        return Customer.builder()
                .user(user)
                .build();
    }
}
