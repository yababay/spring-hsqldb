package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Doctors;

@Repository
public interface DoctorsRepository extends CrudRepository<Doctors, Integer>{
    Doctors findByName(String name);
}
