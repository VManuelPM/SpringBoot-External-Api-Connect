package com.amoelcodigo.exampleapiexternal.controllers;

import com.amoelcodigo.exampleapiexternal.models.WeatherResponse;
import com.amoelcodigo.exampleapiexternal.services.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Mono<WeatherResponse> getWeather(@RequestParam String city) {
        return  weatherService.getWeatherByCity(city);
    }
}
