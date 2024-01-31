package com.example;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

public class Patient {
    private String patientName;

    private String patientContact;
    private String patientGender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String patientDOB;
    private List<String> patientAllergies;
    private PatientAddress patientAddress;

//    private boolean receiveNewsletter;
//    private String [] hobbies;
//    private String crush;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }


    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;
    }

    public List<String> getPatientAllergies() {
        return patientAllergies;
    }

    public void setPatientAllergies(List<String> patientAllergies) {
        this.patientAllergies = patientAllergies;
    }

    public PatientAddress getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(PatientAddress patientAddress) {
        this.patientAddress = patientAddress;
    }
}
