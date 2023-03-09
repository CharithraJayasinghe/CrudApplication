package com.firstProject.first.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity                       //specifies that the class is an entity and is mapped to a database table.
@AllArgsConstructor           //generates a constructor with one parameter for every field in the class.
@NoArgsConstructor            //generates a default constructor with no parameters.
@Data                         //generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects) and beans
public class User {
    @Id                       //specify the primary key of an entity
    private int id;
    private String name;
    private String address;

}
