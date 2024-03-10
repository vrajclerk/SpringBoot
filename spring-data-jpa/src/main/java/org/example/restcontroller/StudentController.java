package org.example.restcontroller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentService studentService; //Reference to studentService Interface

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/students")
    List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.findById(studentId);
    }
}
