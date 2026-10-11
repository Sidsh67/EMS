package com.ems.project.impl;

import org.springframework.stereotype.Service;

import com.ems.project.model.AccountInformation;
import com.ems.project.model.Employee;
import com.ems.project.repository.EmployeeRepository;
import com.ems.project.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {

        AccountInformation accountInfo =
                employee.getAccountInformation();

        if (!accountInfo.getPassword()
                .equals(accountInfo.getConfirmPassword())) {

            throw new RuntimeException(
                    "Password and Confirm Password do not match");
        }

        return employeeRepository.save(employee);
    }
}