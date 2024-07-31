package com.hexaware.employee.service;

import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.entity.Department;
import com.hexaware.employee.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    @Autowired
    private  DepartmentRepository departmentRepository;
    public List<DepartmentDto> getAllDepartments() {
        return departmentRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private DepartmentDto convertToDto(Department department) {
        return new DepartmentDto(department.getId(), department.getName());
    }

    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department=new Department();
        department.setName(departmentDto.getName());
        Department savedDepartment=departmentRepository.save(department);
        return convertToDto(savedDepartment);
    }

    public void deleteAllDepartments() {
        departmentRepository.deleteAll();
    }
}