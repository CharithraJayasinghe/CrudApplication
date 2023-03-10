package com.firstProject.first.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;




@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {
    @Id
    private int id;
    private String owner_name;
    private String address;
    private String vehicle_model;
    private String registration_number;


}
