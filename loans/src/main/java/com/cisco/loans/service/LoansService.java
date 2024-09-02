package com.cisco.loans.service;

import com.cisco.loans.dto.LoansDto;

public interface LoansService {
    void createLoan(String mobileNumber);
    LoansDto fetchLoan(String mobileNumber);
    boolean updateLoan(LoansDto loansDto);
    boolean deleteLoan(String mobileNumber);
}
