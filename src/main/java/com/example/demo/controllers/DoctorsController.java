package com.example.demo.controllers;

import com.example.demo.models.Doctors;
import com.example.demo.service.DoctorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class DoctorsController {
    private DoctorsServiceImpl doctorsService;

    @Autowired
    public DoctorsController(DoctorsServiceImpl languageService) {
        this.doctorsService = languageService;
    }

    @GetMapping("/doctors")
    public List getAllLanguages() {
        return doctorsService.getDoctors();
    }

    @GetMapping("/doctors/{name}")
    public Doctors getLanguageByName(@PathVariable(value = "name") String languageByName) {
        return doctorsService.getDoctorByName(languageByName);
    }

    @PostMapping("/doctor")
    public ResponseEntity<Doctors> createDoctors(@Valid @RequestBody Doctors doctors) {
        try {
            Doctors doctor = doctorsService
                    .save(new Doctors(doctors.getId(),
                            doctors.getFirstName(),
                            doctors.getLastName(),
                            doctors.getMiddleName(),
                            doctors.getSpecialization()));

            return new ResponseEntity<>(doctor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/language/{name}")
    public ResponseEntity<Doctors> updateDoctors(@PathVariable(value = "name") String doctorsByName,
                                                 @Valid @RequestBody Doctors doctors) {

        Doctors doctor = doctorsService.getDoctorByName(doctorsByName);


        try {

            if(doctor.getFirstName() != null) {
                doctor.setFirstName(doctor.getFirstName());
            }

            if(doctor.getLastName() != null) {
                doctor.setLastName(doctor.getLastName());
            }

            if(doctor.getMiddleName() != null) {
                doctor.setMiddleName(doctor.getMiddleName());
            }

            if(doctor.getSpecialization() != null) {
                doctor.setSpecialization(doctor.getSpecialization());
            }

            doctor = doctorsService.save(doctor);

            return new ResponseEntity<>(doctor, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/doctor/{name}")
    //@ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Doctors> deleteBook(@PathVariable(value = "name") String doctorByName) {
        Doctors doctor = doctorsService.getDoctorByName(doctorByName);

        doctorsService.delete(doctor);

        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }
}

