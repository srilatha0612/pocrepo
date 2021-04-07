package com.org.employ.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class EmployeeDetails {
    @Id
    private int empId;
    private Double employeeSalary;
    private String employeeName;
    private String employeeAddress;
}
