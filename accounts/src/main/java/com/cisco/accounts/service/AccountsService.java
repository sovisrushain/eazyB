package com.cisco.accounts.service;

import com.cisco.accounts.dto.CustomerDTO;

public interface AccountsService {
    void createAccount(CustomerDTO customerDTO);
    CustomerDTO fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDTO customerDTO);
    boolean deleteAccount(String mobileNumber);
}
