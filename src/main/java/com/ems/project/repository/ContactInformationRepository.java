package com.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.project.model.ContactInformation;

public interface ContactInformationRepository extends JpaRepository<ContactInformation, Long>{

}
