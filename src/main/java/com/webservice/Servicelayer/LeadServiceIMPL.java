package com.webservice.Servicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.Entity.Lead;
import com.webservice.Repository.LeadRepository;

@Service
public class LeadServiceIMPL implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
		
		leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> gatlead() {
		
		List<Lead> lead = leadRepo.findAll();
		
		return lead;
	}

	@Override
	public List<Lead> getlead() {
	
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public void deleteOneId(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead findOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public List<Lead> getJsonlead() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public Lead getLeadById(long id) {
	
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
		
	}

}
