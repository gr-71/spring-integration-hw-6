package com.rga.my.shop.integration.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("/integration/http-sells-integration.xml")
public class SellsIntegrationConfig {
}
