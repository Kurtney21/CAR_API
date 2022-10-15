package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Employee;
import za.ac.cput.demo_car_service_portal.entity.UserCredentials;

public class EmployeeFactory {
    public static Employee createEmployee(String name, String lastName, String email, String password) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, password);


        return Employee.builder()
                .user(userCredentials)
                .build();
    }
}
