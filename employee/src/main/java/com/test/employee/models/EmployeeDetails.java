package com.test.employee.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmployeeDetails {
    private String department;
    private String name;
    private String email;
    private int empId;
}
