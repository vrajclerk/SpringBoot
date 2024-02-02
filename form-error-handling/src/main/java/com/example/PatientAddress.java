package com.example;

import jakarta.validation.constraints.*;

public class PatientAddress {

    @Size(min =3,max=40,
    message = "must contain min 3 and max 40 characters")
    private String street;

    @NotNull(message = "city can't be empty")
    @NotEmpty(message = "city can't be empty")
    private String City;

    @NotBlank(message = "State can't be blank")
    private String State;

    @Pattern(regexp = "^(India|USA|UAE|Australia|Singapore)$",
    message = "select valid country")
    private String Country;

    @Min(value = 1000,message = "must be greater then 1000.")
    @Max(value = 999999,message = "must be less then 999999.")
    private String Pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
