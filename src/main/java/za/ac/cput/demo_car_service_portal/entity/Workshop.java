package za.ac.cput.demo_car_service_portal.entity;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern for Workshop Entity
* Date : 07 April 2022
* */

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Workshop implements Serializable {
 //   @NotNull
    @Column(name = "workshop_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long workshopId;
    private String name;
    private String location;
}
