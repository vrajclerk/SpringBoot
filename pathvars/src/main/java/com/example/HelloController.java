package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/user") //class level annotation
public class HelloController {

    @RequestMapping(value = "/welcome/{countryName}/{userName}", method = RequestMethod.GET)
    public String welcome(ModelMap modelMap,
                          @PathVariable Map<String,String> pathVars) { //model object injected by framework
        modelMap.addAttribute("welcomeMessage", String.format("welcome %s from %s", pathVars.get("userName"),pathVars.get("countryName")));
        return "welcome";
    }

    @RequestMapping(value = "/exit",method = RequestMethod.GET)
    public String exit(ModelMap modelMap){
        modelMap.addAttribute("exitMessage","Goodbye");
        return "exit";

    }
}