package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Patients;

@Repository
public interface PatientsRepository extends CrudRepository<Patients, Integer>{
    Patients findByName(String name);
}
