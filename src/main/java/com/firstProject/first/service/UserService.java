package com.firstProject.first.service;

import com.firstProject.first.dto.UserDTO;
import com.firstProject.first.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private String saveUser(UserDTO userDTO){
        userRepo.save(userDTO);
    }

}
