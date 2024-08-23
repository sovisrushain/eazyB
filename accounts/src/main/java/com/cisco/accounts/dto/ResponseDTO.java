package com.cisco.accounts.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private String statusCode;
    private String statusMsg;
}
