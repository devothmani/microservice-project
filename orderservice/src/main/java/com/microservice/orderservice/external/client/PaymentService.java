package com.microservice.orderservice.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice.orderservice.payload.request.PaymentRequest;

@FeignClient(name = "PAYMENT-SERVICE", url = "http://localhost:8083/payment")
public interface PaymentService {

	@PostMapping
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);
}
