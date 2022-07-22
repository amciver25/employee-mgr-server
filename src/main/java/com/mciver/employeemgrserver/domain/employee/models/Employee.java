package com.mciver.employeemgrserver.domain.employee.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //getters and setters
@NoArgsConstructor //default constructor
@RequiredArgsConstructor //parameterized constructor
@Entity //Gives Spring JPA permission to save this object
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Allows the database to assign the id to the object
    private Long id;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;

    public String toString(){
        return String.format("%d %s %s %s",id, firstName, lastName, email);
    }
}
