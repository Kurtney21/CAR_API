/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.demo_car_service_portal.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class User implements Serializable {
    private String firstName, lastName, email, password;
}
