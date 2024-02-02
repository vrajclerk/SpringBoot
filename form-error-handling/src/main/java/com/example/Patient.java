package com.example;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Patient {

    @Pattern(regexp = "^[a-zA-Z. ]+$",
    message = "Name should contain only alphabets and dots")
    private String patientName;

    @Pattern(regexp = "^[6-9]\\d{9}$",
    message = "please enter valid 10 digit no. starting with 6.")
    private String patientContact;

    @Pattern(regexp = "^(Male|Female)$",
    message = "select valid gender (Male|Female).")
    private String patientGender;

    @NotNull(message = "can't be empty")
    @Past(message = "enter valid past birthdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date patientDOB;
    private List<String> patientAllergies;
    @Valid
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

    public Date getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = patientDOB;
    }
}
