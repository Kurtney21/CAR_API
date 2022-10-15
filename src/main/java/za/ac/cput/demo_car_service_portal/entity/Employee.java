package za.ac.cput.demo_car_service_portal.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    @NotNull
    @Column(name = "staff_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long empId;
    @Embedded
    private UserCredentials user;
    @Embedded
    private Role role;


}
