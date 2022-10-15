/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.demo_car_service_portal.entity;

import lombok.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String userName;
    private String userPassword;

}
