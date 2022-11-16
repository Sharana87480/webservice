package com.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webservice.Entity.Lead;
import com.webservice.Servicelayer.LeadService;

@Controller
public class LeadCotroller {
	
	@Autowired
	private LeadService ls;

	@RequestMapping("/servlet")
	public String servlet() {
		
		return "Register";
		
	}
	
	@RequestMapping("/savelead")
	public String saveLead(@ModelAttribute("abc")Lead lead)
	{
		ls.saveLead(lead);
		return "Register";
	}
	
	@RequestMapping("/getData")
	public String getdata(ModelMap m) {
		
		List<Lead> lead = ls.gatlead();
		m.addAttribute("lead", lead);
		return "Show_lead";
	}
}
