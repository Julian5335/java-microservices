package com.julian5335.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julian5335.accounts.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
}
