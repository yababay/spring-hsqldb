package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "doctors")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "specialization")
    private String specialization;

    public Doctor(){

    }

    public Doctor(int id, String firstName, String middleName, String lastName, String specialization){
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
