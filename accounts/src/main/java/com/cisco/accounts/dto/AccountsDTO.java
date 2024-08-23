package com.cisco.accounts.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDTO {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
