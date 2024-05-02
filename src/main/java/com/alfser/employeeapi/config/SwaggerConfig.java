package com.alfser.employeeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * Responsável pelas configurações do Swagger.
 *
 * @author Janilson Serra
 * @since 2/04/2024
 * @version 1.0
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee API")
                        .description(
                                "An example of API employee register integrate to RabbitMQ.")
                        .version("v1"));
                        
    }
}

