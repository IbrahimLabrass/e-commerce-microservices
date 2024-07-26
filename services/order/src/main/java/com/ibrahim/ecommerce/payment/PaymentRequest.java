package com.ibrahim.ecommerce.payment;

import com.ibrahim.ecommerce.customer.CustomerResponse;
import com.ibrahim.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
