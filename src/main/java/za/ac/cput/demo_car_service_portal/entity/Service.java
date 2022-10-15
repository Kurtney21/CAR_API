package za.ac.cput.demo_car_service_portal.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service implements Serializable {
    @NotNull
    @Column(name = "service_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long serviceId;
    private String name, cost, length;
}
