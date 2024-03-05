package org.example.restcontroller;

import jakarta.annotation.PostConstruct;
import org.example.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private List<Student> allStudents;


    //method will be executed after bean is created
    @PostConstruct
    public void loadStudents(){
        allStudents = new ArrayList<>();
        allStudents.add(new Student(1, "Tom",
                "tom@gmail.com", 6,
                "Ahmedabad", "Male", "B.Tech-IT"));
        allStudents.add(new Student(2, "Will",
                "will@gmail.com", 6,
                "Vadodara", "Male", "B.Tech-IT"));
        allStudents.add(new Student(3, "Jenifer",
                "jenifer@gmail.com", 6,
                "Vadodara", "Female", "B.Tech-IT"));
    }
    @GetMapping("/students")
    List<Student> getAllStudents(){
        return allStudents;
    }

    //pass student id as path variable
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId()==studentId)
                .findFirst()
                .orElse(null);
        return matchingStudent;
    }


//    The @RequestBody annotation in Spring Boot is used to bind HTTP request body
//    to a domain object.
//    It is used to deserialize the HTTP request body into an object and then
//    pass it as a parameter to a controller method.
    //Add new student
    @PostMapping("/students")
    Student addNewStudent(@RequestBody Student student){
        if(student.getId()==0){
            student.setId(allStudents.size()+1);
        }
        allStudents.add(student);
        return student;
    }

    //update student information
    @PatchMapping("/students/{studentId}")
    Student updateStudent(@RequestBody Student updateStudent, @PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId()==studentId)
                .findFirst()
                .orElse(null);
        if (matchingStudent!=null) {
            if(updateStudent.getName()!=null){
                matchingStudent.setName(updateStudent.getName());
            }
            if(updateStudent.getCity()!=null){
                matchingStudent.setCity(updateStudent.getCity());
            }
            if(updateStudent.getEmail()!=null){
                matchingStudent.setEmail(updateStudent.getEmail());
            }
            if(updateStudent.getGender()!=null){
                matchingStudent.setGender(updateStudent.getGender());
            }
            if(updateStudent.getSemester() != 0){
                matchingStudent.setSemester(updateStudent.getSemester());
            }
            if(updateStudent.getProgram()!=null){
                matchingStudent.setProgram(updateStudent.getProgram());
            }
        }
        return matchingStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudentById(@PathVariable int studentId){
        Student matchingStudent = allStudents.stream()
                .filter(student -> student.getId()==studentId)
                .findFirst()
                .orElse(null);
        allStudents.remove(matchingStudent);
        return "Student with id="+studentId+" removed successfully.";
    }
}