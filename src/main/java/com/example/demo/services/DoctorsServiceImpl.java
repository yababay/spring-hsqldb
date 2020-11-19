package com.example.demo.services;

import com.example.demo.models.Doctor;
import com.example.demo.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;


@Service
public class DoctorsServiceImpl implements DoctorsService{

    private DoctorsRepository repository;

    @Autowired
    public DoctorsServiceImpl(DoctorsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Doctor> getDoctors() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Doctor save(Doctor doctor) {
        return repository.save(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        repository.delete(doctor);
    }

}
