package com.github.pramodkuth.api;

import com.github.pramodkuth.dto.OrderResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * Order APIs
 *
 * @author pramodkuth
 */
public interface OrderApiV2 {
    @Operation(summary = "Get the order by Id",
            description = "Returns order details for the given Id if exists",
            tags = "Orders", operationId = "getOrderById",responses = {
            @ApiResponse(responseCode = "200", description = "Order found",
                    content = @Content(schema = @Schema(implementation = OrderResponse.class))),
            @ApiResponse(responseCode = "500", description = "Application error",
                    content = @Content(schema = @Schema(implementation = Map.class))),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content(schema = @Schema(implementation = Map.class)))})
    @GetMapping("/{orderId}")
    ResponseEntity<OrderResponse> getOrder(@Parameter(name = "orderId",description = "Id of the order to retrieve") @PathVariable Long orderId);
}
