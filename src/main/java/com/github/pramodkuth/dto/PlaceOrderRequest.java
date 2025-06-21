package com.github.pramodkuth.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class PlaceOrderRequest {
    @Schema(description = "Order quantity", example = "2")
    @Min(value = 1)
    private Integer quantity;
    @Schema(description = "Order amount", example = "100.00")
    @DecimalMin(value = "100.00")
    private BigDecimal amount;
}
