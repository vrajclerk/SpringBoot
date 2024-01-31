package com.example.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MySpringMvcAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //Load spring web application configuration
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(WebApplicationContextConfig.class);

        //create and register dispatcher dispatcherServlet
        DispatcherServlet servlet=new DispatcherServlet(context);
        ServletRegistration.Dynamic registration=servletContext.addServlet("dispatcher",servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

    }
}