package com.hexaware.employee.service;

import com.hexaware.employee.dto.AddressDto;
import com.hexaware.employee.dto.DepartmentDto;
import com.hexaware.employee.dto.EmployeeDto;
import com.hexaware.employee.dto.ResourceNotFoundException;
import com.hexaware.employee.entity.Address;
import com.hexaware.employee.entity.Department;
import com.hexaware.employee.entity.Employee;
import com.hexaware.employee.repository.DepartmentRepository;
import com.hexaware.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private DepartmentService departmentService;

    public List<EmployeeDto> getAllEmployee() {
        return employeeRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private EmployeeDto convertToDto(Employee employee) {
      return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getMiddleName(), employee.getLastName(),convertDepartmentToDto(employee.getDepartment()),employee.getAddresses().stream().map(address -> new AddressDto(address.getName())).collect(Collectors.toList())) ;
    }

    private DepartmentDto convertDepartmentToDto(Department department) {
        return new DepartmentDto(department.getId(), department.getName());
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setMiddleName(employeeDto.getMiddleName());
        Optional<Department> optionalDepartment=departmentRepository.findByName(employeeDto.getDepartment().getName());
        if(optionalDepartment.isPresent()) {
            employee.setDepartment(optionalDepartment.get());
        }
        List<Address> addresses=employeeDto.getAddresses().stream().map(addressDto -> new Address(addressDto.getName(),employee)).collect(Collectors.toList());
        employee.setAddresses(addresses);
        Employee savedEmployee=employeeRepository.save(employee);
        return convertToDto(savedEmployee) ;
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
}