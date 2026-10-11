package com.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.project.model.PersonalInformation;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation , Long>{

	
	
}
