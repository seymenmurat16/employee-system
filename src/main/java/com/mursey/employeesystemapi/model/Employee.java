package com.mursey.employeesystemapi.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
