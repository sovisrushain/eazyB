package com.cisco.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Response")
public class ResponseDTO {
    private String statusCode;
    private String statusMsg;
}
