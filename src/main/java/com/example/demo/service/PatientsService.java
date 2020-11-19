package com.example.demo.service;

import com.example.demo.models.Patients;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PatientsService {
    List<Patients> getPatients();

    Patients save(Patients patients);

    void delete(Patients patients);

    Patients getPatientByName(String name);
}
