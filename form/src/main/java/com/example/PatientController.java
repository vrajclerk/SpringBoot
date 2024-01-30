package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {

    @RequestMapping("/appointment")
    public ModelAndView appointment(){
        return new ModelAndView("appointment");
    }
        @PostMapping("/addAppointment")
        public ModelAndView addAppointment(
                @RequestParam("patientName") String patientName,
                @RequestParam("patientContact") String patientContact
        ){
            ModelAndView modelAndView=new ModelAndView("addAppointment");
            modelAndView.addObject("message", String.format("we have registered your details as Name:%s and contact:%s",patientName,patientContact)
            );
            return modelAndView;
    }
}
