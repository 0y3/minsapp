package com.novocaine.Minsapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.novocaine.Minsapp.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
