package com.ems.project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personal_info_id")
	@Valid
	private PersonalInformation personalInformation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_info_id")
	@Valid
	private ContactInformation contactInformation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_info_id")
	@Valid
	private AddressInformation addressInformation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_info_id")
	@Valid
	private AccountInformation accountInformation;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_info_id")
	@Valid
	private EmployeeInformation employeeInformation;
}