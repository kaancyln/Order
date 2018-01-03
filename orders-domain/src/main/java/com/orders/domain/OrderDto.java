package com.orders.domain;

import com.orders.enumaration.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto extends BaseDomainDto{
    private String isim;
    private OrderStatus durum;
}
