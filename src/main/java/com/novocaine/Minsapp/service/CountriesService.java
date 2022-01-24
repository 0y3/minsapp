package com.novocaine.Minsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novocaine.Minsapp.model.Countries;
import com.novocaine.Minsapp.repository.CountriesRepository;

@Service
public class CountriesService {

	@Autowired
	private CountriesRepository countriesrepository;
	
	//Return List of Countries
	public List<Countries> getCountries(){
		return countriesrepository.findAll();
	}
	
	//save data to db
	public void save(Countries countries) {
		countriesrepository.save(countries);
	}
}
