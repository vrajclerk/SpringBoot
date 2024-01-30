package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PatientController {

    @RequestMapping("/appointment")
    public ModelAndView appointment(){
        Patient patient=new Patient();
        patient.setPatientName("PatientName");
        patient.setPatientContact(("xxxxxxxxxx"));
        return new ModelAndView("appointment","command",patient);
    }
        @PostMapping("/addAppointment")
//        public ModelAndView addAppointment(@RequestParam Map<String,String> requestParams){
        public ModelAndView addAppointment(@ModelAttribute Patient patient){
            ModelAndView modelAndView=new ModelAndView("addAppointment");
            //modelAndView.addObject("message", String.format("we have registered your details as Name:%s and contact:%s",requestParams.get("patientName"),requestParams.get("patientContact"))
            modelAndView.addObject("message","we have registered your details");

//            Accessing each data individually
//            Patient patientObj =new Patient();
//            patientObj.setPatientName(requestParams.get("patientName"));
//            patientObj.setPatientContact(requestParams.get("patientContact"));
//            modelAndView.addObject("patient",patientObj);


            return modelAndView;
    }
    @ModelAttribute
    public void addingCommonObjects(Model model){
        model.addAttribute("mainHeader",
                "Welcome to the clinic");

    }
}
