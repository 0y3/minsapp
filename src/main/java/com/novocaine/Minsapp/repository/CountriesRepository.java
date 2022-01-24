package com.novocaine.Minsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novocaine.Minsapp.model.Countries;


@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

}
