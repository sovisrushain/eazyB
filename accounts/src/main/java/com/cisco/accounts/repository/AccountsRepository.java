package com.cisco.accounts.repository;

import com.cisco.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
