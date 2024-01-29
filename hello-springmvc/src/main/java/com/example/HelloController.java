package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
//    @RequestMapping("/welcome")
//    public ModelAndView welcome(){
//        ModelAndView modelAndView=new ModelAndView("welcome");
//        modelAndView.addObject("welcomeMessage","welcome to Spring MVC");
//        return modelAndView;

    //Request handler with string as return value and Model/ModelMap as parameter
    @RequestMapping(value = "/welcome",method= RequestMethod.GET)
    public String welcome(ModelMap modelMap){ //model object injected by framework
        modelMap.addAttribute("welcomeMessage","welcome to spring MVC");
        return "welcome";


    }
}
