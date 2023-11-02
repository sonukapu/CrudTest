package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private long empId;

    @NotNull
    @Size(min = 2, message = "Employee First Name should be atleast 2 character")
    private String empFirstName;

    private String empLastName;

    @Email(message = "Email Id must be valid")
    @Column(unique = true)
    private String empEmailId;

    private int empAge;

}
