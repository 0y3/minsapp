package com.novocaine.Minsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novocaine.Minsapp.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
