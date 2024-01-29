package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BTechStudent implements Student {

   Semester studentSemester;
    @Autowired
    BTechStudent(@Qualifier("BTechSemester") Semester studentSemester){
        System.out.println("Constructor method");
        this.studentSemester=studentSemester;
    }

@Autowired
    public void setStudentSemester(@Qualifier("BTechSemester") Semester studentSemester) {
    System.out.println("setstudentsemester method called");
        this.studentSemester = studentSemester;
    }

    @Override
    public String getCurrentStatus() {
       // return this+" in sem 6";
        return " is studying the following subjects: "+
                studentSemester.getSubjects()+" in semester "+
                studentSemester.getSemesterNo();
    }
}
