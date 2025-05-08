package com.amoelcodigo.exampleapiexternal.services;

import com.amoelcodigo.exampleapiexternal.models.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherService(final WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<WeatherResponse> getWeatherByCity(final String city) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/weather")
                        .queryParam("q", city)
                        .queryParam("appid", apiKey)
                        .build()
                ).retrieve()
                .bodyToMono(WeatherResponse.class);
    }
}
