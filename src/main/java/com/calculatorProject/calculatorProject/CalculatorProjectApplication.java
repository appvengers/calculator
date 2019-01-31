package com.calculatorProject.calculatorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CalculatorProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorProjectApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("/**");
            }
        };
    }


    @GetMapping("/")
    public String hello() {
        return "Welcome to Kata Inc Calculator!";
    }

    @CrossOrigin(origins = "/**")
    @PostMapping(path = "/services/operations/V1")
    public ResponseEntity<CalculatorOperationResponse> operateTwoNumbers(@RequestBody Calculator calculator) {

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Access-Control-Allow-Origin", "*");
        return new ResponseEntity<CalculatorOperationResponse>(calculator.operate(calculator.getFirstNumber(),
                calculator.getSecondNumber(), calculator.getOperation()), responseHeaders, HttpStatus.OK);
    }

}

