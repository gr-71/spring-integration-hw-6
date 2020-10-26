package com.rga.my.shop.integration.my.integration;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.rga.my.shop.integration.entities.Sell;
import com.rga.my.shop.integration.entities.SellsList;
import com.rga.my.shop.integration.services.SellService;

import java.util.Map;

@Component
public class SellActivator {
    private final SellService sellService;

    public SellActivator(SellService sellService) {
        this.sellService = sellService;
    }

    @ServiceActivator(inputChannel = "sellsChannel")
    public void listenNewsChannel(@Payload SellsList payload, @Headers Map<String,Object> headers){
        System.out.println("Get order in message: " + payload);
        for (Sell sell: payload.getSell()) {
            System.out.println("Sell: " + sell);
            sellService.save(sell);
        }

    }
}
