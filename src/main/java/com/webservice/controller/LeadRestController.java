package com.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.Entity.Lead;
import com.webservice.Servicelayer.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	@Autowired
	private LeadService ls;
	
	@RequestMapping("/get/{id}")
	public Lead getLead(@PathVariable("id") long id)
	{
		Lead lead = ls.getLeadById(id);
		return lead;
	}
}
