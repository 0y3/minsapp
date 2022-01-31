package com.novocaine.Minsapp.settings.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.novocaine.Minsapp.settings.models.Country;
import com.novocaine.Minsapp.settings.services.CountryService;

@Controller
public class Country {

	@Autowired
	private CountryService countryservice; 
	
	
	@GetMapping("/global/countries")
	public String getContries(Model model) {
		
		List<Countries> countriesList = countryservice.getCountries();
		
		model.addAttribute("pageTitle", "Country Management Page");
//		if(countryList.isEmpty())
//		{
//			model.addAttribute("countries", "noData");
//		}else {
//			model.addAttribute("countries", countryList);
//		}
		//model.addAttribute("countries", countryList);
		model.addAttribute("countries", countriesList);
		return "/global/County";
	}
	
	@PostMapping("/global/countries/addNew")
	public String addNew(Country country) {
		countryservice.save(country);
		return "redirect:/global/countries";
	}
}
