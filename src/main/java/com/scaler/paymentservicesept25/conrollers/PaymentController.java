package com.scaler.paymentservicesept25.conrollers;

import com.scaler.paymentservicesept25.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/initiate")
    public String generatePaymentLink(@RequestParam("orderId") Long orderId) throws StripeException {
        return paymentService.generatePaymentLink(orderId);
    }
}
