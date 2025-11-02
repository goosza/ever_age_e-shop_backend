package com.everage.eshop.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ItemDto(
        UUID uuid,
        String name,
        BigDecimal price
) {}
