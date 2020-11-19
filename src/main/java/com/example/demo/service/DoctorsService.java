package com.example.demo.service;

import com.example.demo.models.Doctors;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface DoctorsService {
    List<Doctors> getDoctors();

    Doctors save(Doctors doctors);

    void delete(Doctors doctors);

    Doctors getDoctorByName(String name);
}
