package za.ac.cput.demo_car_service_portal.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.demo_car_service_portal.entity.Workshop;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class WorkshopFactoryTest {

    @Test
    void createWorkshop() {
        Workshop workshopPetsine = WorkshopFactory.createWorkshop("SpaceShipCartel","Western Hemis");
        assertNotNull(workshopPetsine);
        System.out.println(workshopPetsine);
    }
}