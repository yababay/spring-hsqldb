package com.example.demo.controllers;

import com.example.demo.models.Doctor;
import com.example.demo.services.DoctorsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DoctorsController {
    private DoctorsServiceImpl service;

    @Autowired
    public DoctorsController(DoctorsServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return service.getDoctors();
    }

}

