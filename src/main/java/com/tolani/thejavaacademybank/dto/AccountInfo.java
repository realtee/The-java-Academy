package com.tolani.thejavaacademybank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

   @Schema(
           name = "User Account Name"
   )
public class AccountInfo {
    private String accountName;
    @Schema(
            name = "User Account Balance"
    )
    private BigDecimal accountBalance;

    @Schema(
            name = "User Account Number"
    )

    private String accountNumber;

}
