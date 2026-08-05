package com.boutique.recommendation.controller;
import com.boutique.recommendation.service.RecommendationService;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/recommendations") public class RecommendationController{
 private final RecommendationService s; public RecommendationController(RecommendationService s){this.s=s;}
 @GetMapping public Object list(){return s.recommendations();}
}
