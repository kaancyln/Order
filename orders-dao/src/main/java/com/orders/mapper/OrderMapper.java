package com.orders.mapper;

import com.orders.domain.OrderDto;
import com.orders.data.entity.Order;
import com.orders.mapper.converter.OrderStatusConverter;
import com.orders.orika.OrikaMapperFactoryConfigurer;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements OrikaMapperFactoryConfigurer {

    public void configure(MapperFactory orikaMapperFactory) {
        ConverterFactory converterFactory = orikaMapperFactory.getConverterFactory();
        converterFactory.registerConverter("orderStatusConverter", new OrderStatusConverter());

        orikaMapperFactory.classMap(Order.class, OrderDto.class)
                .fieldMap("durum","durum").converter("orderStatusConverter").add()
                .byDefault()
                .register();
    }
}
