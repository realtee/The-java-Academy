package com.tolani.thejavaacademybank.service;

import com.tolani.thejavaacademybank.dto.TransactionDto;
import com.tolani.thejavaacademybank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
