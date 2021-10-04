package com.example.demo.ipi;

import org.springframework.data.repository.CrudRepository;
/*Flight Repository that extends Crud Repository to preform crud operations*/
public interface FlightRepo extends CrudRepository<Flight, String> {


}

