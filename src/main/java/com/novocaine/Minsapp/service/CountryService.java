package com.novocaine.Minsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novocaine.Minsapp.model.Country;
import com.novocaine.Minsapp.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryrepository;
	
	//Return List of Countries
	public List<Country> getCountries(){
		return countryrepository.findAll();
	}
	
	//save data to db
	public void save(Country country) {
		countryrepository.save(country);
	}
}
