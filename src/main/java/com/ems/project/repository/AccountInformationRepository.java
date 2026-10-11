package com.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.project.model.AccountInformation;

public interface AccountInformationRepository extends JpaRepository<AccountInformation, Long>{

}
