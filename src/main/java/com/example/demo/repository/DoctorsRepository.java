package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Doctor;

import java.util.List;

@Repository
public interface DoctorsRepository extends CrudRepository<Doctor, Long>{
    //@Query("select id, firstName, lastName, middleName, specialization from Doctor")
    //List<Doctor> findAll();
}
