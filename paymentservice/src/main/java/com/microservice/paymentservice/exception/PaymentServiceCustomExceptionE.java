package com.microservice.paymentservice.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PaymentServiceCustomExceptionE extends RuntimeException{

	private final String errorCode;

    public PaymentServiceCustomExceptionE(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
