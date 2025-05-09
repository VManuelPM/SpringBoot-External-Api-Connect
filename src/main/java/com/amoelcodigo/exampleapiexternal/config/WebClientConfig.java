package com.amoelcodigo.exampleapiexternal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://api.openweathermap.org/data/2.5")
                .defaultHeader("Accept", "application/json")
                .build();
    }
}
