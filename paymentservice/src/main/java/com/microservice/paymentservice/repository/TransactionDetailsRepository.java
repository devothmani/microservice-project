package com.microservice.paymentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.paymentservice.model.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {

    Optional<TransactionDetails> findByOrderId(long orderId);
}
