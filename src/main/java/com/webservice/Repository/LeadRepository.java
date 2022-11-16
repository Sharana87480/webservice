package com.webservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
