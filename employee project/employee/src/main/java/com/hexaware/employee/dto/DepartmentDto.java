package com.hexaware.employee.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class DepartmentDto {
    private Long id;
    @NotNull
    @NotEmpty(message = "Department Name Required")
    private String name;

    public DepartmentDto( Long id,String name) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}