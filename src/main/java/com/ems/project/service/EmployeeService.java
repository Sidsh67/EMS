package com.ems.project.service;

import org.jspecify.annotations.Nullable;

import com.ems.project.model.Employee;

import jakarta.validation.Valid;

public interface EmployeeService {

	
	  Employee saveEmployee(Employee employee);

}
