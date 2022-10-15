package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.entity.UserCredentials;

public class CustomerFactory {
    public static Customer createCustomer(String name,String lastName,String email,String password) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, password);


        return Customer.builder()
                .userCredentials(userCredentials)
                .build();
    }
}
