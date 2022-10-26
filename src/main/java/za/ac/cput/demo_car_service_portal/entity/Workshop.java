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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "Workshop_Name", length = 50)
    private String name;

    @Column(name = "Workshop_Address", length = 50)
    private String location;
}
