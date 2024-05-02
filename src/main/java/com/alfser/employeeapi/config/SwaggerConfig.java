package com.alfser.employeeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Responsável pelas configurações do Swagger.
 *
 * @author Janilson Serra, Alfredo Gabriel
 * @since 23/01/2023
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
                                "API de geração e cadastro de crachás da Defensoria Pública do Estado do Pará.")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Defensoria Pública do Estado Pará")
                                .url("http://defensoria.pa.def.br/missao.aspx")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Wiki do Projeto no Gitlab")
                        .url("https://gitlab.defensoria.pa.def.br/sistemas-dpe/sistem-relatorio-dpe/-/wikis/home")
                );
    }
}

