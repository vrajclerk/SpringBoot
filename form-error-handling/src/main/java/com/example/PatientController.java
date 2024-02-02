package com.example;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class PatientController {

    @RequestMapping("/appointment")
    public ModelAndView appointment(Model model){
        Patient patient=new Patient();
        patient.setPatientName("PatientName");
        patient.setPatientContact(("xxxxxxxxxx"));
        patient.setPatientGender("Male");
        model.addAttribute("countryList", Arrays.asList("India","Australia","USA","UAE","Singapore"));
        model.addAttribute("allergyList",Arrays.asList("Smoke","Dust","Soya Sauce"));

        return new ModelAndView("appointment","patient",patient);
    }
    @RequestMapping ("/addAppointment")
    public ModelAndView addAppointment( @Valid @ModelAttribute Patient patient,
                                       BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("countryList", Arrays.asList("India","Australia","USA","UAE","Singapore"));
            model.addAttribute("allergyList",Arrays.asList("Smoke","Dust","Soya Sauce"));

            return new ModelAndView("appointment","patient",patient);
        }
        ModelAndView modelAndView=new ModelAndView("addAppointment");

        modelAndView.addObject("message","we have registered your details");

        return modelAndView;
    }
    @ModelAttribute
    public void addingCommonObjects(Model model){
        model.addAttribute("mainHeader",
                "Welcome to the clinic");

    }
}
