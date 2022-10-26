package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Employee;
import za.ac.cput.demo_car_service_portal.entity.Role;
import za.ac.cput.demo_car_service_portal.entity.User;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String firstName, String lastName, String email, String password, long role_Id) {
        User user = UserFactory.createUser(firstName, lastName, email, password);

        return Employee.builder()
                .user(user)
                .role_Id(role_Id)
                .build();
    }
}
