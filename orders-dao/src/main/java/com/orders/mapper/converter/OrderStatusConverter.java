package com.orders.mapper.converter;

import com.orders.enumaration.OrderStatus;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

public class OrderStatusConverter extends BidirectionalConverter<String, OrderStatus> {
    public OrderStatus convertTo(String s, Type<OrderStatus> type, MappingContext mappingContext) {
        return OrderStatus.getEnumByCode(s);
    }

    public String convertFrom(OrderStatus orderStatus, Type<String> type, MappingContext mappingContext) {
        return orderStatus.getCode();
    }
}
