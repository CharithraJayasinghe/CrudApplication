package com.firstProject.first.service;

import com.firstProject.first.dto.UserDTO;
import com.firstProject.first.entity.User;
import com.firstProject.first.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
