package com.github.pramodkuth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Order response
 *
 * @author pramodkuth
 */
@Data
@Builder
public class OrderResponse {
    @Schema(description = "Order Id", example = "1")
    private Long orderId;
    @Schema(description = "Order quantity", example = "2")
    private Integer quantity;
    @Schema(description = "Order amount", example = "100.00")
    private BigDecimal amount;
}
