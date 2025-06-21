package com.github.pramodkuth.service;

import com.github.pramodkuth.dto.OrderResponse;
import com.github.pramodkuth.dto.PlaceOrderRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Order service
 *
 * @author pramodkuth
 */
@Service
public class OrderService {
    public OrderResponse createOrder(PlaceOrderRequest request) {
        return OrderResponse.builder().orderId(1L).amount(request.getAmount()).quantity(request.getQuantity()).build();
    }

    public OrderResponse getOrder(Long orderId) {
        return OrderResponse.builder().orderId(orderId).amount(BigDecimal.valueOf(9999)).quantity(10).build();
    }
}
