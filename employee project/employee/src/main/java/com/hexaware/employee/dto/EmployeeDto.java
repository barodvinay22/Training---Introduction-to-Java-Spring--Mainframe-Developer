package com.hexaware.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private DepartmentDto department;
    private List<AddressDto> addresses;
    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


}