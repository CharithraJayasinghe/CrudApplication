package com.firstProject.first.controller;

import com.firstProject.first.dto.UserDTO;
import com.firstProject.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                              //simplify the creation of RESTful web services.
@RequestMapping(value = "api/v1/user")       // map web requests onto specific handler classes and/or handler methods.
@CrossOrigin                                 //enables cross-origin resource sharing only for this specific method.

public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){     //Deserialize jason object to java object called "UserDTO"
        return userService.saveUser(userDTO);  //Pass the created userDTO to the saveUser method.
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID){
        return userService.getUserByUserID(userID);
    }
}
