package za.ac.cput.demo_car_service_portal.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Role {
    private String roleName, description;
}
