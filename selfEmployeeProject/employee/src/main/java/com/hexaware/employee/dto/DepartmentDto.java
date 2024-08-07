package com.hexaware.employee.dto;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.lang.NonNull;

public class DepartmentDto {
    private Long id;
    @NonNull
    @NotEmpty(message = "department name is required")
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