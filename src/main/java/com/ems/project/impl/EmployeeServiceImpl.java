package com.ems.project.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.project.exception.ResourceAlreadyExistsException;
import com.ems.project.model.Employee;
import com.ems.project.repository.EmployeeRepository;
import com.ems.project.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
    	String email =
                employee.getContactInformation().getEmail();

        String employeeId =
                employee.getEmployeeInformation().getEmployeeId();

        if (employeeRepository.existsByContactInformationEmail(email)) {
            throw new ResourceAlreadyExistsException(
                    "Email already exists: " + email);
        }

        if (employeeRepository.existsByEmployeeInformationEmployeeId(employeeId)) {
            throw new ResourceAlreadyExistsException(
                    "Employee ID already exists: " + employeeId);
        }

         return employeeRepository.save(employee);
    }
    
    
    public List<Employee> getALLEmployee() {
    	return employeeRepository.findAll();
    }
}