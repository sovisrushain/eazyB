package com.cisco.accounts.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDTO accounts;
}
