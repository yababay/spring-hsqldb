package com.example.demo.service;

import com.example.demo.models.Patients;
import com.example.demo.models.Patients;
import com.example.demo.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.google.common.collect.Lists;


@Service
public class PatientsServiceImpl implements PatientsService{
    private PatientsRepository patientRepository;

    @Autowired
    public PatientsServiceImpl(PatientsRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @Override
    public List<Patients> getPatients() {
        return null;
    }

    @Override
    public Patients save(Patients patients) {
        return null;
    }

    @Override
    public void delete(Patients patients) {

    }

    @Override
    public Patients getPatientByName(String name) {
        return null;
    }
}
