package com.rga.my.shop.integration;

import com.rga.my.shop.domain.Order;
import com.rga.my.shop.service.OrderService;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderActivator {

    private final OrderService orderService;

    public OrderActivator(OrderService orderService) {
        this.orderService = orderService;
    }

    @ServiceActivator(inputChannel = "ordersChannel")
    public void listenNewsChannel(@Payload Order payload, @Headers Map<String,Object> headers){
        System.out.println("Get order in message: " + payload);
        orderService.save(payload);
    }
}
