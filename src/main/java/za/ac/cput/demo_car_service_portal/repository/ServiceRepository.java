package za.ac.cput.demo_car_service_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.demo_car_service_portal.entity.Service;

@Repository("servicesRepository")
public interface ServiceRepository extends JpaRepository<Service,  Long> {
}
