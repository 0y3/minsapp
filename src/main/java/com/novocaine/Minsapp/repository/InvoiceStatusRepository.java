package com.novocaine.Minsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novocaine.Minsapp.model.Invoice;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<Invoice, Integer> {

}
