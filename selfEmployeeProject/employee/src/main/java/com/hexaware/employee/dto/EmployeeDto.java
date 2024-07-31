package com.hexaware.employee.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private Long id;
    @NotEmpty(message = "user name is required")
    @NonNull
    private String firstName;
    private String middleName;
    @NotBlank(message="Last Name is Required")
    private String lastName;
    private DepartmentDto department;
    @NotEmpty
    private List<AddressDto> address=new ArrayList<>();
    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public List<AddressDto> getAddress() {
        return address;
    }

    public void setAddress(List<AddressDto> address) {
        this.address = address;
    }
}