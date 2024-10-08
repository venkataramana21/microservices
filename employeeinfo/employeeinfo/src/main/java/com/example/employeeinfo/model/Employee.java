package com.example.employeeinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee")
public class Employee {
    @Id
    private long ccode;//fk
    private String name;
    private String department;
    private String designation;
    private List<String> skills;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private int exp;
    private String doj;

}
