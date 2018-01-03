package com.orders.controller;

import com.orders.domain.OrderDto;
import com.orders.domain.UpdateOrderDto;
import com.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/siparis")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderDto createOrder(@RequestBody String isim) {
        OrderDto dto = orderService.createOrder(isim);
        return dto;
    }

    @PutMapping
    public OrderDto updateOrder(@RequestBody UpdateOrderDto dto) {
        return orderService.updateOrder(dto);
    }

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }
}
