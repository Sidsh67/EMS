package com.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	boolean existsByContactInformationEmail(String email);
	

    boolean existsByEmployeeInformationEmployeeId(String employeeId);	
	
}
