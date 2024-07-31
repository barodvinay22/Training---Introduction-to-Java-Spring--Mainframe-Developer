package com.hexaware.employee.service;

import com.hexaware.employee.dto.EmployeeDto;
import com.hexaware.employee.entity.Address;
import com.hexaware.employee.entity.Department;
import com.hexaware.employee.entity.Employee;
import com.hexaware.employee.repository.DepartmentRepository;
import com.hexaware.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @InjectMocks
    private  EmployeeService employeeService;
    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private DepartmentRepository departmentRepository;
    @Mock
    private DepartmentService departmentService;

    @Test
    public void testGetAllEmployee(){
        Employee employee=new Employee();
        employee.setId(1L);
        employee.setDepartment(new Department());
        employee.setAddresses(List.of(new Address()));
        when(employeeRepository.findAll()).thenReturn(List.of(employee));
        List<EmployeeDto> employeeDtos= employeeService.getAllEmployee();
        assertEquals(employeeDtos.size(),1);
        assertEquals(employeeDtos.get(0).getId(),1L);
    }
}