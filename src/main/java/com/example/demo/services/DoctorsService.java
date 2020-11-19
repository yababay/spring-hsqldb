package com.example.demo.services;

import com.example.demo.models.Doctor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface DoctorsService {

    List<Doctor> getDoctors();
    Doctor save(Doctor doctor);
    void delete(Doctor doctor);

}
