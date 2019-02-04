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

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to Kata Inc Calculator!";
    }



    @PostMapping(path = "/services/operations/V1")
    public CalculatorOperationResponse operateTwoNumbers(@RequestBody Calculator calculator) {
        return calculator.operate(calculator.getFirstNumber(), calculator.getSecondNumber(), calculator.getOperation());
    }

}

