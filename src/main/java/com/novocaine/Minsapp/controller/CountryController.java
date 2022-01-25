package com.novocaine.Minsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.novocaine.Minsapp.model.Countries;
import com.novocaine.Minsapp.model.Country;
import com.novocaine.Minsapp.service.CountriesService;
import com.novocaine.Minsapp.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryservice; 
	
	@Autowired
	private CountriesService countriesservice; 
	
	@GetMapping("/global/countries")
	public String getContries(Model model) {
		
		List<Country> countryList = countryservice.getCountries();
		
		List<Countries> countriesList = countriesservice.getCountries();
		
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
