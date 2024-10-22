package com.julian5335.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julian5335.accounts.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
  
}
