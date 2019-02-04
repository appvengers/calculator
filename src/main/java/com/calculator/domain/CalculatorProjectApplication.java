package com.calculator.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CalculatorProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorProjectApplication.class, args);
    }

}

