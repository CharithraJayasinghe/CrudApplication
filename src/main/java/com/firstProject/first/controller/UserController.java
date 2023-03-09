package com.firstProject.first.controller;

import org.springframework.web.bind.annotation.*;

@RestController                              //simplify the creation of RESTful web services.
@RequestMapping(value = "api/v1/user")       // map web requests onto specific handler classes and/or handler methods.
@CrossOrigin                                 //enables cross-origin resource sharing only for this specific method.

public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-root";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "User saved";
    }
}
