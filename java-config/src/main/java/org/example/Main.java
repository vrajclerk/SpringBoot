package org.example;

import org.example.beans.BTechStudent;
import org.example.beans.Student;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext =new AnnotationConfigApplicationContext(AppConfig.class);
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Student s1=appContext.getBean(Student.class);
        System.out.println(s1.getCurrentStatus());
//        Student s2=appContext.getBean(BTechStudent.class);
//        System.out.println(s2.getCurrentStatus());
//        Student student1 = (Student) appContext.getBean("btechStudentBean");
//        Student student2 = (Student) appContext.getBean("bTechStudent");
//        System.out.println(student1.getCurrentStatus());
//        System.out.println(student2.getCurrentStatus());
    }
}