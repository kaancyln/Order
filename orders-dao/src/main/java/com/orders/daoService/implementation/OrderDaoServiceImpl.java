package com.orders.daoService.implementation;

import com.orders.daoService.OrderDaoService;
import com.orders.data.entity.Order;
import com.orders.data.repository.OrderRepository;
import com.orders.domain.OrderDto;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDaoServiceImpl implements OrderDaoService {

    @Autowired
    private MapperFacade mapper;

    @Autowired
    private OrderRepository orderRepository;

    public OrderDto getOrder(Long id) {
        Order entity = orderRepository.findOne(id);
        return entity == null ? null : mapper.map(entity, OrderDto.class);
    }

    public OrderDto saveOrUpdate(OrderDto orderDto) {
        Order entity = mapper.map(orderDto, Order.class);
        entity = orderRepository.save(entity);

        return mapper.map(entity, OrderDto.class);
    }
}
