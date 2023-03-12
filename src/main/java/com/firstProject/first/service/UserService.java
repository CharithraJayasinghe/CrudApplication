package com.firstProject.first.service;

import com.firstProject.first.dto.UserDTO;
import com.firstProject.first.entity.User;
import com.firstProject.first.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service                                                  //used to denote a class that performs a specific service or function in a Spring Boot application.
@Transactional                                            //specifies that an interface, class, or method must have transactional semantics
public class UserService {
    @Autowired                                            //used for automatic dependency injection.
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }
    //user id > user details
    //select * from user where id = 2
    public UserDTO getUserByUserID(String userID){
        User user=userRepo.getUserByUserID(userID);
        return modelMapper.map(user,UserDTO.class);
    }

    //user id, address > user details
    //select * from user where id = 2 address = "kandy"
    public UserDTO getUserByUserIDAndAddress(String userID,String address) {
        User user = userRepo.getUserByUserIDAndAddress(userID,address);
        return modelMapper.map(user, UserDTO.class);
    }





}
