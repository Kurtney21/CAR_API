package za.ac.cput.demo_car_service_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarServicePortalApplication.class, args);
    }
}
