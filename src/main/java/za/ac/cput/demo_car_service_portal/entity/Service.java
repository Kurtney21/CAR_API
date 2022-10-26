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
    @Id
    private Long id;

    @Column(name = "Service_Name", length = 50)
    private String name;

    @Column(name = "Description", length = 50)
    private String description;

    @Column(name = "Price", length = 50)
    private Long cost;

    @Column(name = "Workshop_Id", length = 50)
    private long workshop_Id;
}
