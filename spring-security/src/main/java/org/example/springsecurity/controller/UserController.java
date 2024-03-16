package org.example.springsecurity.controller;

import org.example.springsecurity.models.User;
import org.example.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController  //data will be return as json
@RequestMapping("/home")
public class UserController {

    @Autowired
    private UserService userService;

    //all users
    @RequestMapping("/users")
    public List<User> getUsers() {
        System.out.println("This is working message");
        return userService.getUser();
    }

    //to view who is currently loggedIn
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
