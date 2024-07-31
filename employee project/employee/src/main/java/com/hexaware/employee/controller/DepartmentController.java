package com.hexaware.employee.controller;

import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;// Constructor

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@Valid @Validated @RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.createDepartment(departmentDto),HttpStatus.CREATED);
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteDepartments(){
        departmentService.deleteAllDepartments();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}