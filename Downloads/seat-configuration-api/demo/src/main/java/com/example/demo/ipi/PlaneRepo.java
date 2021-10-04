package com.example.demo.ipi;

import org.springframework.data.repository.CrudRepository;
/*Plane Repository that extends Crud Repository to preform crud operations*/
public interface PlaneRepo extends CrudRepository<Plane, String> {
}
