package com.orders.daoService;

import com.orders.domain.OrderDto;

public interface OrderDaoService {
    OrderDto getOrder(Long id);

    OrderDto saveOrUpdate(OrderDto orderDto);
}
