package com.github.pramodkuth.controller;

import com.github.pramodkuth.api.OrderApiV2;
import com.github.pramodkuth.dto.OrderResponse;
import com.github.pramodkuth.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Order controller
 *
 * @author pramodkuth
 */
@RestController
@RequestMapping("api/v2/orders")
public class OrderControllerV2 implements OrderApiV2 {
    private final OrderService orderService;

    public OrderControllerV2(OrderService orderService) {
        this.orderService = orderService;
    }

    public ResponseEntity<OrderResponse> getOrder(Long orderId) {
        return ResponseEntity.ok(orderService.getOrder(orderId));
    }
}
