package com.hexaware.employee.service;

import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.dto.EmployeeDto;
import com.hexaware.employee.dto.ResourceNotFoundException;
import com.hexaware.employee.entity.Address;
import com.hexaware.employee.entity.Department;
import com.hexaware.employee.entity.Employee;
import com.hexaware.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentService departmentService;
    public List<EmployeeDto> getAllEmployee() {
        return employeeRepository.findAll().stream().map(this::toEmployeeDto).collect(Collectors.toList());
    }

    private EmployeeDto toEmployeeDto(Employee employee) {
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setId(employeeDto.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setMiddleName(employee.getMiddleName());
        employeeDto.setLastName(employee.getLastName());
        Department department=employee.getDepartment();
        if(null!=department){
            employeeDto.setDepartment(new DepartmentDto(department.getId(), department.getName()));
        }
        return employeeDto;
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setMiddleName(employeeDto.getMiddleName());
        employee.setDepartment(departmentService.getDepartmentByName(employeeDto.getDepartment().getName()));
        employee.setAddressList(employeeDto.getAddress().stream().map(a-> new Address(a.getAddress(),employee)).collect(Collectors.toList()));
        Employee savedEmployee=employeeRepository.save(employee);
        return new EmployeeDto(savedEmployee.getId(), savedEmployee.getFirstName(), savedEmployee.getMiddleName(), savedEmployee.getLastName()) ;
    }

    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee1=getEmployee(employeeId);
        return new EmployeeDto(employee1.getId(), employee1.getFirstName(), employee1.getMiddleName(), employee1.getLastName());
    }

    private Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(()->  new ResourceNotFoundException("Employee with Id "+ employeeId +" Not found"));
    }

    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto) {
        Employee employee1=getEmployee(employeeId);
        employee1.setFirstName(employeeDto.getFirstName());
        employee1.setMiddleName(employeeDto.getMiddleName());
        employee1.setLastName(employeeDto.getLastName());
        Employee updatedEmployee=employeeRepository.save(employee1);
        return new EmployeeDto(updatedEmployee.getId(), updatedEmployee.getFirstName(), updatedEmployee.getMiddleName(), updatedEmployee.getLastName());
    }

    public void deleteEmployee(Long employeeId) {
        Employee employee1=getEmployee(employeeId);
        employeeRepository.delete(employee1);
    }

    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }
}