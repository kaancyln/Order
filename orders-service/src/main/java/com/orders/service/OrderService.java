package com.orders.service;


import com.orders.domain.OrderDto;
import com.orders.domain.UpdateOrderDto;

public interface OrderService {
    OrderDto getOrder(Long id);

    OrderDto createOrder(String isim);

    OrderDto updateOrder(UpdateOrderDto dto);
}
