package org.example.entity;

public class Student {

     private int id;
    private String name;
     private String email;
     private int semester;
     private String gender;
     private String city;
     private String program;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public java.lang.String getGender() {
        return gender;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public java.lang.String getProgram() {
        return program;
    }

    public void setProgram(java.lang.String program) {
        this.program = program;
    }

    public Student(int id, java.lang.String name, java.lang.String email, int semester, java.lang.String gender, java.lang.String city, java.lang.String program) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.semester = semester;
        this.gender = gender;
        this.city = city;
        this.program = program;
    }
}
