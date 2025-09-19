package com.scaler.paymentservicesept25.services;

import com.razorpay.Payment;
import com.scaler.paymentservicesept25.paymentgateways.PaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentServiceImpl(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public String generatePaymentLink(Long orderId) throws StripeException {
        //Make a call to Payment GW (Stripe/Razorpay/PhonePe...) to generate the payment link.

        //fetch order details from OrderService using orderId.
        return paymentGateway.generatePaymentLink(orderId);
    }
}
