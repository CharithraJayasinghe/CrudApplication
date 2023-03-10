package com.firstProject.first.controller;

import com.firstProject.first.dto.UserDTO;
import com.firstProject.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController                              //simplify the creation of RESTful web services.
@RequestMapping(value = "api/v1/user")       // map web requests onto specific handler classes and/or handler methods.
@CrossOrigin                                 //enables cross-origin resource sharing only for this specific method.

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-root";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
