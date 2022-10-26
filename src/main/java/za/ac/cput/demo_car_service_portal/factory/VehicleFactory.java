package za.ac.cput.demo_car_service_portal.factory;

import za.ac.cput.demo_car_service_portal.entity.Customer;
import za.ac.cput.demo_car_service_portal.entity.Vehicle;
import za.ac.cput.demo_car_service_portal.util.Helper;

public class VehicleFactory {

    public static Vehicle createVehicle(String make, String model, String year, long customer_Id){
        Helper.checkStringParam(make, "Make");
        Helper.checkStringParam(model, "model");
        Helper.checkStringParam(year, "year");

        return Vehicle.builder()
                .make(make)
                .model(model)
                .year(year)
                .customer_Id(customer_Id)
                .build();
    }
}
