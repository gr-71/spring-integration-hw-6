package rga.shop.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import rga.shop.domain.Product;

@MessagingGateway
public interface ChannelGateway {
    @Gateway(requestChannel = "channel")
    void process(Product product);
}
