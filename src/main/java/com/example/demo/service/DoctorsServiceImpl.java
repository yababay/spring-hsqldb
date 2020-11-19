package com.example.demo.service;

import com.example.demo.models.Doctors;
import com.example.demo.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;


@Service
public class DoctorsServiceImpl implements DoctorsService{
    private DoctorsRepository doctorRepository;

    @Autowired
    public DoctorsServiceImpl(DoctorsRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctors> getDoctors() {
        return Lists.newArrayList(doctorRepository.findAll());
    }

    @Override
    public Doctors save(Doctors doctors) {
        return doctorRepository.save(doctors);
    }

    @Override
    public void delete(Doctors doctors) {
        doctorRepository.delete(doctors);
    }

    @Override
    public Doctors getDoctorByName(String name) {
        return doctorRepository.findByName(name);
    }
}
