/**Entity for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.demo_car_service_portal.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "status", length = 50, columnDefinition = "varchar(50) default 'Pending'")
    private String booking_status;

    @Column(name = "customer_Id", length = 50)
    private long customer;

    @Column(name = "service_Id", length = 50)
    private long service;

    @Column(name = "vehicle_Id", length = 50)
    private long vehicle;
}
