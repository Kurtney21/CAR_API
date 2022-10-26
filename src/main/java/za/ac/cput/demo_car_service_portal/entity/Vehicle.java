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
@Embeddable
public class Vehicle implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "Vehicle_Make", length = 50)
    private String make;

    @Column(name = "Vehicle_Model", length = 50)
    private String model;

    @Column(name = "Vehicle_Year", length = 50)
    private String year;

    @Column(name = "Vehicle_Type", length = 50)
    private String type;

    @Column(name = "Customer_Id", length = 50)
    private long customer_Id;
}
