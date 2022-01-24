package com.novocaine.Minsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novocaine.Minsapp.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
