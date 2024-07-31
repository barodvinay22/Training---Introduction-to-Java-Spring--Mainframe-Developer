package com.hexaware.employee.controller;

import com.hexaware.employee.dto.EmployeeDto;
import com.hexaware.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee),HttpStatus.CREATED);

    }
    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long employeeId) {
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);

    }
    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long employeeId, @RequestBody EmployeeDto employee) {
        return new ResponseEntity<>(employeeService.updateEmployee(employeeId,employee),HttpStatus.OK);

    }
    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    @DeleteMapping
    public ResponseEntity<Void> deleteAllEmployees(){
        employeeService.deleteAllEmployees();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}