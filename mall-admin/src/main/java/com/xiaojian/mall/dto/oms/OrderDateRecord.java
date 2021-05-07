package com.xiaojian.mall.dto.oms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class OrderDateRecord {
    /**
     * 日期
     */
    private String date;

    /**
     * 订单数量
     */
    private Integer orderCount;

    /**
     * 订单金额
     */
    private BigDecimal  orderAmount;
}