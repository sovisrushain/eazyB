package com.cisco.accounts.controller;

import com.cisco.accounts.constants.AccountsConstants;
import com.cisco.accounts.dto.CustomerDTO;
import com.cisco.accounts.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(params = "/api/v1/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountsController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(
                AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201
        ));
    }

}
