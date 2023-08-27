package com.tolani.thejavaacademybank.dto;


import lombok.*;

import java.math.BigDecimal;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TransactionDto {
    private String transactionType;
    private BigDecimal amount;
    private String accountNumber;
    private String status;

}
