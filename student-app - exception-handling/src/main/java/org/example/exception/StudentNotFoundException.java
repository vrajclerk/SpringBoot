package org.example.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message); //takes message as argument
    }
}
