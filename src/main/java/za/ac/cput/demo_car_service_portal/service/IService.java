package za.ac.cput.demo_car_service_portal.service;

import java.util.List;

public interface IService<T, X> {
    //Create a new record
    T create(T t);

    //Update a record by Id
    T update(T t, X x);

    //Read all records
    List<T> readAll();

    //Read a record by ID
    T readById(X x);

    //Delete a record by ID
    void delete(X x);
}
