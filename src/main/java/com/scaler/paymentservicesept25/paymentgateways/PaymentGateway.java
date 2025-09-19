package com.scaler.paymentservicesept25.paymentgateways;

import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId) throws StripeException;
}
