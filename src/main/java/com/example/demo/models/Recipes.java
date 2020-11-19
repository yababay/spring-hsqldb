package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "recipes")

public class Recipes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "doctor")
    private int doctor;

    @Column(name = "patient")
    private int patient;

    @Column(name = "creation_date")
    private String creationDate; //DATETIME

    @Column(name = "validity")
    private String validity; //DATETIME

    @Column(name = "priority")
    private int priority;

    public Recipes(){

    }

    public Recipes(int id, String description, int doctor, int patient, String creationDate, String validity, int priority){
        this.id = id;
        this.description = description;
        this.doctor = doctor;
        this.patient = patient;
        this.creationDate = creationDate;
        this.validity = validity;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getDoctor() {
        return doctor;
    }

    public int getPatient() {
        return patient;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getValidity() {
        return validity;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
