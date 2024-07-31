package com.hexaware.employee.service;

import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.dto.ResourceNotFoundException;
import com.hexaware.employee.entity.Department;
import com.hexaware.employee.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
   @Autowired
   private DepartmentRepository departmentRepository;
    public List<DepartmentDto> getAllDepartments() {
        return departmentRepository.findAll().stream().map(d-> new DepartmentDto(d.getId(),d.getName())).collect(Collectors.toList());
    }

    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department=new Department();
        department.setName(departmentDto.getName());
        Department savedDepartment=departmentRepository.save(department);
        return new DepartmentDto(savedDepartment.getId(),savedDepartment.getName());
    }
    public Department getDepartmentByName(String name){
        return departmentRepository.findByName(name).orElseThrow(()-> new ResourceNotFoundException("Department not found with name ="+name));
    }
}