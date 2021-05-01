package com.xiaojian.mall.dto.oms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class OrderDateRecord {
    private String date;
    private Integer orderCount;
    private BigDecimal  orderAmount;
}