/**Entity for VehicleService Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
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
public class Vehicle implements Serializable {
    @NotNull
    @Column(name = "vehicle_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long vehicleID;
    private String make, model, type, year;
    @JoinColumn(name = "custId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customerId;

}
