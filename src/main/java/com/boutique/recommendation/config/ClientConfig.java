package com.boutique.recommendation.config;
import org.springframework.context.annotation.*;import org.springframework.web.client.RestClient;
@Configuration public class ClientConfig{@Bean RestClient.Builder restClientBuilder(){return RestClient.builder();}}
