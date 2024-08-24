package com.cisco.accounts.service.impl;

import com.cisco.accounts.constants.AccountsConstants;
import com.cisco.accounts.dto.CustomerDTO;
import com.cisco.accounts.entity.Accounts;
import com.cisco.accounts.entity.Customer;
import com.cisco.accounts.exception.CustomerAlreadyExistsException;
import com.cisco.accounts.mapper.CustomerMapper;
import com.cisco.accounts.repository.AccountsRepository;
import com.cisco.accounts.repository.CustomerRepository;
import com.cisco.accounts.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountsRepository accountsRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.mapToCustomer(customerDTO, new Customer());
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("customer already registered with the given mobile number "+ customerDTO.getMobileNumber());
        }
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }

}
