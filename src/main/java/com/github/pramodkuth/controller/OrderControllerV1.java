package com.github.pramodkuth.controller;

import com.github.pramodkuth.api.OrderApiV1;
import com.github.pramodkuth.dto.OrderResponse;
import com.github.pramodkuth.dto.PlaceOrderRequest;
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
@RequestMapping("api/v1/orders")
public class OrderControllerV1 implements OrderApiV1 {
    private final OrderService orderService;

    public OrderControllerV1(OrderService orderService) {
        this.orderService = orderService;
    }

    public ResponseEntity<OrderResponse> placeOrder(PlaceOrderRequest request) {
        OrderResponse response=orderService.createOrder(request);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<OrderResponse> getOrder(Long orderId) {
        return ResponseEntity.ok(orderService.getOrder(orderId));
    }
}
