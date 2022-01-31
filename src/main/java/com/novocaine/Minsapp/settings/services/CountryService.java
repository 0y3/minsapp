package com.novocaine.Minsapp.settings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novocaine.Minsapp.settings.models.Country;
import com.novocaine.Minsapp.settings.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryrepository;
	
	//Return List of Countries
	public List<com.novocaine.Minsapp.model.Country> getCountries(){
		return countryrepository.findAll();
	}
	
	//save data to db
	public void save(Countries countries) {
		countryrepository.save(countries);
	}
}
