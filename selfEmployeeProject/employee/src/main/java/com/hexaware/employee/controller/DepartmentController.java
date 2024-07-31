package com.hexaware.employee.controller;

import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@Valid  @RequestBody DepartmentDto department){
        return new ResponseEntity<>(departmentService.createDepartment(department),HttpStatus.CREATED);
    }
}