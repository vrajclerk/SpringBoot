package org.example.springsecurity.services;

import org.example.springsecurity.models.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class UserService {
     private List<User> list = new ArrayList<>();

     public UserService(){
            list.add(new User(UUID.randomUUID().toString(),"Vraj","v@gmail.com"));
         list.add(new User(UUID.randomUUID().toString(),"raj","r@gmail.com"));
         list.add(new User(UUID.randomUUID().toString(),"niraj","n@gmail.com"));
         list.add(new User(UUID.randomUUID().toString(),"anuj","a@gmail.com"));
     }

     //get all users
    public List<User> getAllUsers(){
         return this.list;

    }

    //get single user
    @GetMapping("/users")
    public List<User> getUser(){
         return this.list;

    }
    public User addUser(User user){
         this.list.add(user);
         return user;
    }
}
