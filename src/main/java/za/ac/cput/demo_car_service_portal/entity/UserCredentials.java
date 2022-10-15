package za.ac.cput.demo_car_service_portal.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class UserCredentials implements Serializable {
    private String name, lastName, email, address;
}
