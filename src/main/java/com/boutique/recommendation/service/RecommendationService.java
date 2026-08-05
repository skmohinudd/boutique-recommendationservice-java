package com.boutique.recommendation.service;
import org.springframework.beans.factory.annotation.Value;import org.springframework.stereotype.Service;import org.springframework.web.client.RestClient;
@Service public class RecommendationService{
 private final RestClient client;
 public RecommendationService(RestClient.Builder b,@Value("${clients.product.base-url}")String u){client=b.baseUrl(u).build();}
 public Object recommendations(){return client.get().uri("/api/v1/products").retrieve().body(Object.class);}
}
