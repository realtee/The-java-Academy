package com.tolani.thejavaacademybank.repository;

import com.tolani.thejavaacademybank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
