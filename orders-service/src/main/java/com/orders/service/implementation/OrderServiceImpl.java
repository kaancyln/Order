package com.orders.service.implementation;

import com.orders.daoService.OrderDaoService;
import com.orders.domain.OrderDto;
import com.orders.domain.UpdateOrderDto;
import com.orders.enumaration.OrderStatus;
import com.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDaoService orderDaoService;

    @Override
    public OrderDto getOrder(Long id) {
        return orderDaoService.getOrder(id);
    }

    @Override
    public OrderDto createOrder(String isim) {
        OrderDto orderDto = new OrderDto(isim, OrderStatus.WAITING);

        return orderDaoService.saveOrUpdate(orderDto);
    }

    @Override
    public OrderDto updateOrder(UpdateOrderDto dto) {
        OrderDto orderDto = orderDaoService.getOrder(dto.getId());
        orderDto.setDurum(OrderStatus.getEnumByCode(dto.getDurum()));

        return orderDaoService.saveOrUpdate(orderDto);

    }
}
