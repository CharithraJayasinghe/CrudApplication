package com.firstProject.first.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity                       //specifies that the class is an entity and is mapped to a database table.
@AllArgsConstructor           //generates a constructor with one parameter for every field in the class.
@NoArgsConstructor            //generates a default constructor with no parameters.
@Data                         //generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans
public class User {
    @Id                      //specify the primary key of an entity
    private int id;
    private String owner_name;
    private String address;
    private String vehicle_model;
    private String registration_number;





}
