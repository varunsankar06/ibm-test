package com.ibm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.test.entity.AccountDetails;

public interface AccountRepository extends JpaRepository<AccountDetails, String> {

}
