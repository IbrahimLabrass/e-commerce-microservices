package com.ibrahim.ecommerce.kafka;


import com.ibrahim.ecommerce.customer.CustomerResponse;
import com.ibrahim.ecommerce.order.PaymentMethod;
import com.ibrahim.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
