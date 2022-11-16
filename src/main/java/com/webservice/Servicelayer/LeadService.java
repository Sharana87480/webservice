package com.webservice.Servicelayer;

import java.util.List;

import com.webservice.Entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	List<Lead> gatlead();

	List<Lead> getlead();

	void deleteOneId(long id);

	Lead findOneLead(long id);

	List<Lead> getJsonlead();

	Lead getLeadById(long id);

   

}
